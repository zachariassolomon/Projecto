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
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import siaadao.Projeto;
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
        if((user_id!=null)) {
            logger.log(Level.INFO, "Utilizador já está logado com user_id: " + user_id);
            doLogin(request, response);

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
            request.getSession().setAttribute("user_id", identifier);
            logger.log(Level.INFO, "Login com sucesso para: {0}", identifier);
            
            doLogin(request, response);

        } else {
            try (PrintWriter out = response.getWriter()) {
                out.println("Login falhou, utilizador inexistente ou credenciais erradas");
                logger.log(Level.INFO, "Logou falhou, utilizador inexistente ou credenciais erradas");
            }
        }
        
        statsd.recordExecutionTimeToNow(METHOD, starttime);
    }
    
    private void doLogin(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = (String) request.getSession().getAttribute("user_id"); // TODO - Fix this  
        Projeto[] projs = userBean.getProjetos(username, Func.getOrCreatePersistentSession(request));
        
        if(projs==null) {
            logger.log(Level.SEVERE, "User not found, somethin went terribly wrong!");
            return; /// TODO: Fix this
        }
        
        String[][] projects = new String[projs.length][2];  // TODO: fix this
        
        for(int i = 0; i<projs.length; i++ ) {
            if(projs[i].getEstado() != Constants.PROJETO_CLOSED) {
                projects[i][0] = projs[i].getNome();
                projects[i][1] = projs[i].getDescricao();
            }
        }
//        String[][] projects = {
//             {"AA/SI", "Tecnologias Java Web, incluindo beans, servlets e páginas JSP com tags JSTL"},
//             {"EngWeb", "Projeto em Rails para a cadeira de Engenharia Web na Universidade do Minho"},
//             {"Primecog", "Dashboard realizado em Angular 2 para a cadeira LEI com o cliente Manuel Alves"},
//             {"ZooKeeper", "Aplicação para gestão de jardins zoológicos"},
//             {"",""}
//         };

 //        List<String[]> projs;

         String[][] recentProjects = {
             {"Primecog", "Dashboard realizado em Angular 2 para a cadeira LEI com o cliente Manuel Alves"},
             {"EngWeb", "Projeto em Rails para a cadeira de Engenharia Web na Universidade do Minho"}
         };

         String aux = request.getParameter("project_name");

         if (aux != null){
             projects[projects.length-1][0] = aux;
             projects[projects.length-1][1] = request.getParameter("project_description");
         }
              
         request.setAttribute("recentProjects", recentProjects);
         request.setAttribute("projects", projects);

         request.getRequestDispatcher("WEB-INF/Home.jsp").forward(request, response);
        
        
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
