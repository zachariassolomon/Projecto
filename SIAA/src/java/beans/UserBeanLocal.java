/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.ejb.Local;
import org.orm.PersistentSession;

/**
 *
 * @author nelson
 */
@Local
public interface UserBeanLocal {

    Boolean register(PersistentSession session, String username, String password, String email);

    Boolean login(org.orm.PersistentSession session, String username, String password);
    
}
