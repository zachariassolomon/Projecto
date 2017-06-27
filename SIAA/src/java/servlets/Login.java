/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import beans.UserBeanLocal;
import com.timgroup.statsd.NonBlockingStatsDClient;
import com.timgroup.statsd.StatsDClient;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import utils.Constants;
import utils.Func;


/**
 *
 * @author siaa
 */
@WebServlet(name = "Login", urlPatterns = {"/Login"})
public class Login extends HttpServlet {

    @EJB
    private UserBeanLocal userBean;

    //////////// SETUP METERING AND LOGGING //////////
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final StatsDClient statsd = new NonBlockingStatsDClient(Constants.STATSD_PREFIX, Constants.STATSD_HOST, Constants.STATSD_PORT);
    private final String METHOD = "Login";
    //////////////////////////////////////////////////
    
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        statsd.incrementCounter(METHOD);
        Long starttime = new Date().getTime();
        
        response.setContentType("text/html;charset=UTF-8");
        Object user_id = request.getSession().getAttribute("user_id");
        if((user_id!=null) && ((user_id.equals(request.getParameter("username"))) ||
                               (user_id.equals(request.getParameter("email"))))) {
            
            try (PrintWriter out = response.getWriter()) {
            out.println("Utilizador já está logado com user_id: " + user_id);
            logger.log(Level.INFO, "Utilizador já está logado com user_id: " + user_id);
            return;
            }
        }
        
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        
        String identifier = ( username == null) ? email : username;
        
        if(identifier == null || password == null) {
                try (PrintWriter out = response.getWriter()) {
                out.println("Pedido com dados em falta");

                logger.log(Level.INFO, "Pedido de login falhou, dados em falta");
                return;
            }
        }
        
        logger.log(Level.INFO, "Pedido de login com identificação: " + identifier);
       
        Boolean result = userBean.login(Func.getOrCreatePersistentSession(request), identifier, password);
        
        if (result == true ) {
            try (PrintWriter out = response.getWriter()) {
                out.println("Login com sucesso");
                request.getSession().setAttribute("user_id", identifier);
                logger.log(Level.INFO, "Login com sucesso para: {0}", identifier);

            }
        } else {
            try (PrintWriter out = response.getWriter()) {
                out.println("Login falhou, utilizador inexistente ou credenciais erradas");
                logger.log(Level.INFO, "Logou falhou, utilizador inexistente ou credenciais erradas");
            }
        }
        
        statsd.recordExecutionTimeToNow(METHOD, starttime);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}