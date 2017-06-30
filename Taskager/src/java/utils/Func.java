/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import siaadao.ProjectoPersistentManager;

/**
 *
 * @author nelson
 */
public class Func {
    
    private static final Logger logger = Logger.getLogger(Func.class.getName());
            
    public static PersistentSession getOrCreatePersistentSession(HttpServletRequest request) {
        
        PersistentSession session = null;
        try {
            Object dbsession = request.getSession().getAttribute("dbsession");
            if(dbsession!=null) {
                logger.log(Level.INFO,"Reutilizar sessão persistente");
                session = (PersistentSession) dbsession;
            } else {
                logger.log(Level.INFO, "A criar uma nova sessão persistente");
                session = ProjectoPersistentManager.instance().getSession();
                //request.getSession().setAttribute("dbsession", session);
            }
        } catch (PersistentException ex) {
            logger.log(Level.SEVERE, "Ocorreu uma exceção ao criar sessão persistente", ex);
        }
        return session;
    }
    
    public static void printToScreen (String text, HttpServletResponse response) {
        try (PrintWriter out = response.getWriter()) {
            out.println(text);
        } catch (IOException ex) {   
            logger.log(Level.SEVERE, text, ex);
        }   
    }
}
