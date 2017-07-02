/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import beans.ProjetoBeanLocal;
import beans.TarefaBeanLocal;
import beans.UserBeanLocal;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
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
public class TarefaServelet extends HttpServlet {

    @EJB
    private TarefaBeanLocal tarefaBean;

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
        Projeto proj = projetoBean.getProjeto(Func.getOrCreatePersistentSession(request), project_name);
        request.setAttribute("project_status", proj.getEstado());

        // ADD MEMBER
        String member = request.getParameter("person_name");
        if(member != null) {
            userBean.addProjeto(proj, Func.getOrCreatePersistentSession(request), member);
        }
        
        // ADD TAREFA
        String task_name = request.getParameter("task_name");
        if(task_name != null ) {
            String task_description = request.getParameter("task_description");
            int task_priority = Integer.valueOf(request.getParameter("task_priority"));
            Boolean result = tarefaBean.addTarefa(Func.getOrCreatePersistentSession(request), task_name, task_description, task_priority, project_name);
            //TODO : do something with result
        }
        
        // CHANGE PROJECT STATUS
        String project_status = request.getParameter("project_status");
        if(project_status != null) {
            projetoBean.changeStatus(Func.getOrCreatePersistentSession(request), project_name, project_status);
            request.setAttribute("project_status", project_status);

            // TODO : do something with result
        }
        
        // ADD SUBTAREFA
        String subtask = request.getParameter("subtask_name");
        if(subtask != null) {
            String subtask_task_name = request.getParameter("subtask_task_name");
            String subtask_description = request.getParameter("subtask_description");
            int subtask_priority = Integer.valueOf(request.getParameter("subtask_priority"));
            int task_id = Integer.valueOf(request.getParameter("task_id"));
            tarefaBean.addSubtarefa(Func.getOrCreatePersistentSession(request), subtask_description, subtask, subtask_priority, task_id);
        }
        
        
        // Show project details default
        ArrayList<siaadao.Tarefa> tarefas = projetoBean.getTarefas(Func.getOrCreatePersistentSession(request), project_name);
        HashMap<siaadao.Tarefa,ArrayList<siaadao.Tarefa>> tasks = new HashMap();
        for(siaadao.Tarefa tar : tarefas) {
            tasks.put(tar, new ArrayList(Arrays.asList(tar.subtarefas.toArray())));
        }    
        
        ArrayList<User> members = projetoBean.getMembers(Func.getOrCreatePersistentSession(request), project_name);
        
        request.setAttribute("tasks", tasks);
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
