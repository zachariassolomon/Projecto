/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import beans.ProjetoBeanLocal;
import beans.UserBeanLocal;
import java.io.IOException;
import java.util.ArrayList;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import siaadao.Projeto;
import siaadao.User;
import utils.Func;

/**
 *
 * @author nelson
 */
@WebServlet(name = "Tarefa", urlPatterns = {"/Tarefa"})
public class Tarefa extends HttpServlet {

    @EJB
    private UserBeanLocal userBean;

    @EJB
    private ProjetoBeanLocal projetoBean;

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
        
        String username = (String) request.getSession().getAttribute("user_id");
        String project_name = (String) request.getParameter("project_name");

        String member = request.getParameter("person_name");
        if(member != null) {
            Projeto proj = projetoBean.getProjeto(Func.getOrCreatePersistentSession(request), project_name);
            userBean.addProjeto(proj, Func.getOrCreatePersistentSession(request), member);
        }
        
        ArrayList<siaadao.Tarefa> tarefas = projetoBean.getTarefas(Func.getOrCreatePersistentSession(request), project_name);
        ArrayList<User> members = projetoBean.getMembers(Func.getOrCreatePersistentSession(request), project_name);
        
       
        request.setAttribute("tasks", tarefas);
        request.setAttribute("members", members);
        request.setAttribute("username", username);       
        request.getRequestDispatcher("WEB-INF/Project.jsp").forward(request, response);

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
