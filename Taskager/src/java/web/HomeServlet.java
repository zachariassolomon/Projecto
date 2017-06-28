/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author joao
 */
public class HomeServlet extends HttpServlet {

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
            throws ServletException, IOException 
    {
    
        response.setContentType("text/html;charset=UTF-8");
        
        String[][] projects = {
            {"AA/SI", "Tecnologias Java Web, incluindo beans, servlets e páginas JSP com tags JSTL"},
            {"EngWeb", "Projeto em Rails para a cadeira de Engenharia Web na Universidade do Minho"},
            {"Primecog", "Dashboard realizado em Angular 2 para a cadeira LEI com o cliente Manuel Alves"},
            {"ZooKeeper", "Aplicação para gestão de jardins zoológicos"},
            {"",""}
        };
        
        List<String[]> projs;
    
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
