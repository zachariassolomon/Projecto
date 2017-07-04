/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
                session = (PersistentSession) dbsession;
                logger.log(Level.INFO,"Reutilizar sessao persistente: " + session.hashCode());
            } else {
                session = ProjectoPersistentManager.instance().getSession();
                //request.getSession().setAttribute("dbsession", session);
                logger.log(Level.INFO, "Criada uma nova sessao persistente: " + session.hashCode());
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
    
    public static String long2String(long time) {
        if(time==0) {
            return "-";
        }
        Date data = new Date(time);
        
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        return df.format(data);
    }
    
    public static String minutes2hours(long time) {
        long hours = time / 60; //since both are ints, you get an int
        long minutes = time % 60;
        return String.format("%dh%02dm", hours, minutes);
    }
}
