/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ormsamples;
import java.util.List;
import siaadao.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import org.hibernate.Query;
import org.hibernate.mapping.Set;
import org.orm.PersistentException;
import org.orm.PersistentSession;

import com.timgroup.statsd.StatsDClient;
import com.timgroup.statsd.NonBlockingStatsDClient;
import java.util.Date;

/**
 *
 * @author nelson
 */
public class testing {

        private static final StatsDClient statsd = new NonBlockingStatsDClient("my.prefix", "localhost", 8125);
        public static void main(String[] args) {
            for(int i=0; i<1000; i++) {

                    statsd.recordExecutionTime("register", new Date().getTime());
                    statsd.recordExecutionTimeToNow("register", new Date().getTime()-1000);

            }
            try {
                
//                User u = new User("nelson", "ola123", "asdasd");
//                UserDAO.save(u);
                //User n = UserDAO.getUserByORMID(1);
                PersistentSession session = siaadao.ProjectoPersistentManager.instance().getSession();
                Query query = session.createSQLQuery("SELECT Username FROM User");
            
                List ad = query.list();
                
                
                
                String nome = "nelson";
                User n = UserDAO.loadUserByQuery("Username='"+nome+"'", "Username");
                ProjetoSetCollection a = n.projetos;
                //Projeto p = new Projeto("proj", "projecto fixe");
               // a.add(p);

                Projeto P = a.toArray()[0];
//                Tarefa f = P.tarefas.toArray()[0];
//
//                Tarefa g = new Tarefa("tarefa");
//                Tarefa h = new Tarefa("tarefa");
//                f.subtarefas.add(g);
//                f.subtarefas.add(h);

                
//                P.tarefas.add(f);
//                
//                UserDAO.save(n);
//                
                Tarefa[] asd = P.tarefas.toArray();
                
                Tarefa[] subtarefas = asd[0].subtarefas.toArray();
                Tarefa asdasdasd = subtarefas[0].getTarefa_mae();
                
                
                int gzxc=0;
                
             
                
            } catch (PersistentException ex) {
                java.util.logging.Logger.getLogger(testing.class.getName()).log(Level.SEVERE, null, ex);
            }


        
        
    }


}
