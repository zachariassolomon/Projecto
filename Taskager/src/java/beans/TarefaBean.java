/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import siaadao.Projeto;
import siaadao.ProjetoDAO;

/**
 *
 * @author nelson
 */
@Stateless
public class TarefaBean implements TarefaBeanLocal {

    @EJB
    private ProjetoBeanLocal projetoBean;
    
    @Override
    public boolean addTarefa(PersistentSession session, String task_name, String task_description, int task_priority, String project_name) {
        
        try {
            Projeto proj = projetoBean.getProjeto(session, project_name);
            siaadao.Tarefa tarefa = new siaadao.Tarefa();
            tarefa.setTitulo(task_name);
            tarefa.setDescricao(task_description);
            tarefa.setPrioridade(task_priority);
            tarefa.setData_inicio(new Date().getTime());
            tarefa.setLast_updated(new Date().getTime());
            proj.tarefas.add(tarefa);
            ProjetoDAO.save(proj);
            return true;
        } catch (PersistentException ex) {
            Logger.getLogger(TarefaBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    
    @Override
    public ArrayList<siaadao.Tarefa> getTarefas(PersistentSession session, String project_name) {
        Projeto proj = projetoBean.getProjeto(session, project_name);
        
        if(proj==null) 
            return null;

        ArrayList<siaadao.Tarefa> tarefas = new ArrayList(Arrays.asList(proj.tarefas.toArray()));
        Collections.sort(tarefas, (siaadao.Tarefa o1, siaadao.Tarefa o2) -> (o1.getTitulo()).compareTo(o2.getTitulo()));
        
        return tarefas;
        
    }

    @Override
    public Boolean addSubtarefa(PersistentSession session, String descricao, String titulo, int prioridade, int tarefa_mae) {
        return false;
    }
}
