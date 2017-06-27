/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import beans.ProjetoBeanLocal;
import siaadao.Projeto;
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
@WebServlet(name = "Project", urlPatterns = {"/Project"})
public class Project extends HttpServlet {

    @EJB
    private ProjetoBeanLocal projetoBean;

    //////////// SETUP METERING AND LOGGING //////////
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final StatsDClient statsd = new NonBlockingStatsDClient(Constants.STATSD_PREFIX, Constants.STATSD_HOST, Constants.STATSD_PORT);
    private final String METHOD = "Project";
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
        response.setContentType("text/html;charset=UTF-8");
        
        statsd.incrementCounter(METHOD);
        Long starttime = new Date().getTime();
        
        if(request.getParameter("Titulo").equals("") || request.getParameter("Titulo") == null) {
            Func.printToScreen("Nome de projeto inválido", response);
            logger.log(Level.INFO, "Pedido de criação de projeto falhou");
            return;
        }
        
        String method = request.getMethod();
        if (method.equals("POST")) {
            String titulo = request.getParameter("Titulo");
            String descricao = request.getParameter("Descricao") == null ? "" : request.getParameter("Descricao");
            Projeto proj = projetoBean.create(Func.getOrCreatePersistentSession(request), titulo, descricao);
            if (proj==null) {
                Func.printToScreen("Ocorreu um erro ao criar o projeto, verifique se já não existe um projeto com o mesmo nome", response);
                logger.log(Level.INFO, "Pedido de criação de projeto falhou");
                return;
            } else {
                Func.printToScreen("Projeto criado com sucesso", response);
                logger.log(Level.INFO, "Projeto criado com sucesso");
                return;
            }
        } else if (method.equals("GET")) {
            String titulo = request.getParameter("Titulo");
            Projeto proj = projetoBean.getProjeto(Func.getOrCreatePersistentSession(request), titulo);
            if (proj==null) {
                Func.printToScreen("O projeto que indicou não existe",response);
                logger.log(Level.INFO, "Pedido de consulta do projeto: " + titulo);
                return;
            } else {
                Func.printToScreen("Projeto consultado com sucesso, o nome é: " + proj.getNome(), response);
                logger.log(Level.INFO, "Projeto criado com sucesso");
                return;
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
