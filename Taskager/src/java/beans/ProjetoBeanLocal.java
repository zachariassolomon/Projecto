/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;


import java.util.ArrayList;
import javax.ejb.Local;
import org.orm.PersistentSession;
import siaadao.Projeto;
import siaadao.Tarefa;

/**
 *
 * @author nelson
 */
@Local
public interface ProjetoBeanLocal {

    Projeto create(org.orm.PersistentSession session, String titulo, String descricao);

    Projeto getProjeto(org.orm.PersistentSession session, String titulo);

    ArrayList<siaadao.Tarefa> getTarefas(PersistentSession session, String project_name);

    ArrayList<siaadao.User> getMembers(PersistentSession session, String project_name);

    Boolean changeStatus(PersistentSession session, String project_name, String project_status);

    
}
