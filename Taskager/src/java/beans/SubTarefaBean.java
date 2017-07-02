/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import siaadao.Interacao;
import siaadao.Sessao;
import siaadao.Tarefa;
import siaadao.TarefaDAO;
import siaadao.User;

/**
 *
 * @author nelson
 */
@Stateless
public class SubTarefaBean implements SubTarefaBeanLocal {

    @EJB
    private TarefaBeanLocal tarefaBean;

    @EJB
    private UserBeanLocal userBean;

    @Override
    public Boolean addComment(PersistentSession session, String texto, int id, String user_name) {
        try {
            Tarefa subtarefa = tarefaBean.getTarefa(session, id);            
            User user = userBean.getUser(user_name, session);
            
            Interacao interacao = new Interacao();
            interacao.setComment(texto);
            interacao.setData_interacao(new Date().getTime());
            interacao.setUser(user);
            subtarefa.interacoes.add(interacao);
            TarefaDAO.save(subtarefa);
            return true;
        } catch (PersistentException ex) {
            Logger.getLogger(SubTarefaBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public Boolean addAtividade(PersistentSession session, String comentario, String username, long tempo_trabalho, int task_id) {
        try {
            Tarefa subtarefa = tarefaBean.getTarefa(session, task_id);            
            User user = userBean.getUser(username, session);
            
            Sessao sessao = new Sessao();
            sessao.setComentario(comentario);
            sessao.setTempo_trabalho(tempo_trabalho);
            sessao.setUser(user);
            subtarefa.sessoes.add(sessao);
            TarefaDAO.save(subtarefa);
            return true;
        } catch (PersistentException ex) {
            Logger.getLogger(SubTarefaBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public ArrayList<Interacao> getComentarios(PersistentSession session, int task_id) {
        Tarefa subtarefa = tarefaBean.getTarefa(session, task_id);  
        return new ArrayList<> (Arrays.asList(subtarefa.interacoes.toArray()));
        
    }

    @Override
    public ArrayList<Sessao> getAtividades(PersistentSession session, int task_id) {
        Tarefa subtarefa = tarefaBean.getTarefa(session, task_id);  
        return new ArrayList<> (Arrays.asList(subtarefa.sessoes.toArray()));
    }

    @Override
    public Boolean changeStatus(PersistentSession session, int task_id, String novo_estado) {
        try {
            Tarefa subtarefa = tarefaBean.getTarefa(session, task_id);
            if(subtarefa==null)
                return false;
            
            subtarefa.setEstado(novo_estado);
            subtarefa.setLast_updated(new Date().getTime());
            
            TarefaDAO.save(subtarefa);
            return true;
           
        } catch (PersistentException ex) {
            Logger.getLogger(SubTarefaBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    
    
    
    
    

    
    
}
