/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import beans.SubTarefaBeanLocal;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import siaadao.Tarefa;
import utils.Func;

/**
 *
 * @author nelson
 */
@WebServlet(name = "Subtarefa", urlPatterns = {"/Subtarefa"})
public class SubTarefaServelet extends HttpServlet {

    @EJB
    private SubTarefaBeanLocal subTarefaBean;

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
        int subtask_id = Integer.valueOf(request.getParameter("subtask_id"));
        Tarefa tarefa = subTarefaBean.getSubTarefa(Func.getOrCreatePersistentSession(request), subtask_id);
        
        request.setAttribute("subtask_status", tarefa.getEstado());

                
        // ADD COMMENT
        String comment = (String) request.getParameter("comment");
        if(comment != null) {
            subTarefaBean.addComment(Func.getOrCreatePersistentSession(request), comment, subtask_id, username);
        }
        
        // ADD ACTIVITY
        String activity_text = (String) request.getParameter("activity_text");
        if(activity_text != null) {
            int hours = Integer.valueOf(request.getParameter("hours"));
            int minutes = Integer.valueOf(request.getParameter("minutes"));
            long worktime = (hours*60)+minutes;
            subTarefaBean.addAtividade(Func.getOrCreatePersistentSession(request), activity_text, username, worktime, subtask_id);
        }
        
        // CHANGE SUBTASK STATUS
        String subtask_status = request.getParameter("subtask_status");
        if(subtask_status != null) {
            subTarefaBean.changeStatus(Func.getOrCreatePersistentSession(request), subtask_id, subtask_status);
            request.setAttribute("subtask_status", subtask_status);

            // TODO : do something with result
        }
        
        
        request.setAttribute("project_name", project_name);
        request.getRequestDispatcher("Tarefa").forward(request, response);
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
