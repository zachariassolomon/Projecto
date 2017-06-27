/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
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
    
    
}
