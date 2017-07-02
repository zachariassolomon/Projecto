/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

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

import utils.Func;
import utils.Constants;
import beans.UserBeanLocal;
import org.orm.PersistentSession;

/**
 *
 * @author siaa
 */
@WebServlet(name = "Register", urlPatterns = {"/Register"})
public class RegisterServelet extends HttpServlet {

    @EJB
    private UserBeanLocal userBean;
    
    //////////// SETUP METERING AND LOGGING //////////
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final StatsDClient statsd = new NonBlockingStatsDClient(Constants.STATSD_PREFIX, Constants.STATSD_HOST, Constants.STATSD_PORT);
    private final String METHOD = "Register";
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
        String email = request.getParameter("email");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        logger.log(Level.INFO, "Pedido de registo para user " + username + " e email " + email);
        if(email == null || username == null || password == null) {
            try (PrintWriter out = response.getWriter()) {
                out.println("Pedido com dados em falta");

                logger.log(Level.INFO, "Pedido de registo falhou, dados em falta");
                return;
            }
        } 
        
        
        Boolean result = userBean.register(Func.getOrCreatePersistentSession(request), username, password, email);
        
        if (result == true ) {
            logger.log(Level.INFO, "Registado com sucesso");

            request.setAttribute("username", username);
            request.setAttribute("password", password);
            request.getSession().setAttribute("user_id", username);
            
            request.getRequestDispatcher("Login").forward(request, response);
        } else {
            try (PrintWriter out = response.getWriter()) {
                out.println("Registo falhou, utilizador já existe");
                logger.log(Level.INFO, "Registo falhou");
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
