/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import org.hibernate.Session;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import siaadao.*;
/**
 *
 * @author siaa
 */
@Stateless
public class UserBean implements UserBeanLocal {

    @Override
    public Boolean register(PersistentSession session, String username, String password, String email) {
        try {
            User n = UserDAO.loadUserByQuery(session, "Username='"+username+"' OR Email='"+email+"'", "Username");
            if (n==null) {
                User novoUser = new User();
                novoUser.setUsername(username);
                novoUser.setEmail(email);
                novoUser.setPassword(password);
                UserDAO.save(novoUser);
                return true;
            }          
        } catch (PersistentException ex) {
            Logger.getLogger(UserBean.class.getName()).log(Level.SEVERE, "Ocorreu uma excepção ao registar o utilizador!", ex);
        }
        return false;
    }

    @Override
    public Boolean login(PersistentSession session, String identifier, String password) {
        User user = null;
        try {
            user = UserDAO.loadUserByQuery(session, "Username='"+identifier+"' OR Email='"+identifier+"'","Username");
        } catch (PersistentException ex) {
            Logger.getLogger(UserBean.class.getName()).log(Level.SEVERE, "Ocorreu uma excepção ao logar o utilizador!", ex);
        }
        return (user!=null && user.getPassword().equals(password));
    }

    @Override
    public ArrayList<Projeto> getProjetos(String username, PersistentSession session) {
        User user = getUser(username, session);
        if(user==null) 
            return null;

        ArrayList<Projeto> projs = new ArrayList(Arrays.asList(user.projetos.toArray()));
        Collections.sort(projs, (Projeto o1, Projeto o2) -> (o1.getNome()).compareTo(o2.getNome()));
        
        return projs;
    }

    @Override
    public Boolean addProjeto(Projeto Projeto, PersistentSession session, String username) {
        User user = getUser(username, session);
        
        if(user==null) 
            return false;
        user.projetos.add(Projeto);
        try {
            //siaadao.ProjectoPersistentManager.instance().getSession().getSessionFactory().getCurrentSession().merge(user);
            UserDAO.save(user);
        } catch (PersistentException ex) {
            Logger.getLogger(UserBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }

    @Override
    public User getUser(String username, PersistentSession session) {
        User user = null;
        try {
            user = UserDAO.loadUserByQuery(session, "Username='"+username+"'","Username");

        } catch (PersistentException ex) {
            Logger.getLogger(UserBean.class.getName()).log(Level.SEVERE, "Ocorreu uma excepção ao pesquisar o utilizador!", ex);
        }
        return user;
    }

    
    
    
    
    
    
}
