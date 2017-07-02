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
import siaadao.Tarefa;
import siaadao.TarefaDAO;
import utils.Constants;

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
        try {
            Tarefa tar_mae = getTarefa(session, tarefa_mae);
            Tarefa subtarefa = new Tarefa();
            subtarefa.setData_inicio(new Date().getTime());
            subtarefa.setDescricao(descricao);
            subtarefa.setEstado(Constants.TAREFA_PROGRESS);
            subtarefa.setPrioridade(prioridade);
            subtarefa.setTitulo(titulo);
            tar_mae.subtarefas.add(subtarefa);
            TarefaDAO.save(tar_mae);
            return true;
        } catch (PersistentException ex) {
            Logger.getLogger(TarefaBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public Tarefa getTarefa(PersistentSession session, int task_id) {
        
        Tarefa tar = null;            
        try {
            tar = TarefaDAO.getTarefaByORMID(task_id);
         
        } catch (PersistentException ex) {
            Logger.getLogger(TarefaBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tar;
    }
    
    
}
