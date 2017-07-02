/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.ArrayList;
import javax.ejb.Local;
import org.orm.PersistentSession;
import siaadao.Tarefa;

/**
 *
 * @author nelson
 */
@Local
public interface TarefaBeanLocal {
        ArrayList<siaadao.Tarefa> getTarefas(PersistentSession session, String project_name);
        
        boolean addTarefa(PersistentSession session, String task_name, String task_description, int task_priority, String project_name);

    Boolean addSubtarefa(PersistentSession session, String descricao, String titulo, int prioridade, int tarefa_mae);

    Tarefa getTarefa(PersistentSession session, int task_id);
}
