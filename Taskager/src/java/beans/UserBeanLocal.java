/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Local;
import org.orm.PersistentSession;
import siaadao.Projeto;
import siaadao.User;

/**
 *
 * @author nelson
 */
@Local
public interface UserBeanLocal {

    Boolean register(PersistentSession session, String username, String password, String email);

    Boolean login(org.orm.PersistentSession session, String username, String password);

    ArrayList<Projeto> getProjetos(String username, PersistentSession session);

    Boolean addProjeto(Projeto Projeto, PersistentSession session, String username);

    User getUser(String username, PersistentSession session);


    
}
