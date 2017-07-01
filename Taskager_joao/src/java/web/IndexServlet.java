/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author joao
 */
public class IndexServlet extends HttpServlet {

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
            {"Primecog", "Dashboard realizado em Angular 2 para a cadeira LEI com o cliente Manuel Alves"},
            {"EngWeb", "Projeto em Rails para a cadeira de Engenharia Web na Universidade do Minho"},
            {"ZooKeeper", "Aplicação para gestão de jardins zoológicos"}
        };
    
        String[][] recentProjects = {
            {"Primecog", "Dashboard realizado em Angular 2 para a cadeira LEI com o cliente Manuel Alves"},
            {"EngWeb", "Projeto em Rails para a cadeira de Engenharia Web na Universidade do Minho"}
        };
        
        request.setAttribute("recentProjects", recentProjects);
        request.setAttribute("projects", projects);
        
        
        
        String register_username = request.getParameter("register_username");
        String register_email = request.getParameter("register_email");
        
        
        if (register_username!=null){               // Ação de "registo"
            System.out.println("");
            if (register_username.equals("joao"))   // ERRO: Username já existe (ko)
                request.setAttribute("register_username_ok", "no");
            else                                    // Username ainda não existe (ok)
                request.setAttribute("register_username_ok", "yes");
        }
        
        if (register_email!=null){               // Ação de "registo"
            if (register_email.equals("joao"))   // ERRO: Email já existe (ko)
                request.setAttribute("register_email_ok", false);
            else                                    // Email ainda não existe (ok)
                request.setAttribute("register_email_ok", true);
        }
        
        
        
        
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        if (username!=null && username.equals("joao")){ // Username existe
            request.setAttribute("user_ok", "yes");
            if (password!= null && password.equals("123")){ // Password correta
                request.setAttribute("login_ok","yes");
                request.getRequestDispatcher("WEB-INF/Home.jsp").forward(request, response);
            }
            else {
                request.setAttribute("login_ok","no");
                request.getRequestDispatcher("WEB-INF/Index.jsp").forward(request, response);
            }// Password incorreta
        }
        else { // Username não existe
            request.setAttribute("user_ok", "no");
            //request.setAttribute("login_ok","no");
            request.getRequestDispatcher("WEB-INF/Index.jsp").forward(request, response);
        }
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
