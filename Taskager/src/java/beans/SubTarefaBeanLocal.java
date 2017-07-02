/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.ArrayList;
import javax.ejb.Local;
import org.orm.PersistentSession;
import siaadao.Interacao;
import siaadao.Sessao;

/**
 *
 * @author nelson
 */
@Local
public interface SubTarefaBeanLocal {

    Boolean addComment(PersistentSession session, String texto, int id, String user_name);

    Boolean addAtividade(PersistentSession session, String comentario, String username, long tempo_trabalho, int task_id);

    ArrayList<Interacao> getComentarios(PersistentSession session, int task_id);

    ArrayList<Sessao> getAtividades(PersistentSession session, int task_id);

    Boolean changeStatus(PersistentSession session, int task_id, String novo_estado);
    
}
