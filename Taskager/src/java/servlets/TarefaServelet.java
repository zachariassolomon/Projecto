/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import beans.ProjetoBeanLocal;
import beans.TarefaBeanLocal;
import beans.UserBeanLocal;
import com.timgroup.statsd.NonBlockingStatsDClient;
import com.timgroup.statsd.StatsDClient;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import siaadao.Projeto;
import siaadao.User;
import utils.Constants;
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

    //////////// SETUP METERING AND LOGGING //////////
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final StatsDClient statsd = new NonBlockingStatsDClient(Constants.STATSD_PREFIX, Constants.STATSD_HOST, Constants.STATSD_PORT);
    private final String METHOD = "Tarefa";
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
        request.setAttribute("project_description", proj.getDescricao());
        request.getRequestDispatcher("WEB-INF/Project.jsp").forward(request, response);
        
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
