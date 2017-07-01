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
import javax.ejb.Stateless;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import siaadao.Projeto;
import siaadao.ProjetoDAO;
import siaadao.Tarefa;
import siaadao.User;
import siaadao.UserDAO;
import utils.Constants;

/**
 *
 * @author siaa
 */
@Stateless
public class ProjetoBean implements ProjetoBeanLocal {
    private final Logger logger = Logger.getLogger(this.getClass().getName());

    @Override
    public Projeto create(PersistentSession session, String titulo, String descricao) {
        Projeto proj = null;
        try {
            proj = ProjetoDAO.loadProjetoByQuery(session, "Nome='"+titulo+"'","Nome");
            if (proj==null) {
                proj = new Projeto();
                proj.setNome(titulo);
                proj.setData_criacao(new Date().getTime());
                proj.setEstado(Constants.PROJETO_PROGRESS);
                proj.setDescricao(descricao);
                ProjetoDAO.save(proj);
                logger.log(Level.INFO, "Foi criado o projeto: {0}", proj.getNome());
            } else {
                return null;
            }     
        } catch (PersistentException ex) {
           logger.log(Level.SEVERE, "Ocorreu uma excepção ao criar o projeto!", ex);
           return null;
        } 
        return proj;
    }

    @Override
    public Projeto getProjeto(PersistentSession session, String titulo) {
        Projeto proj = null;
        try {
            proj = ProjetoDAO.loadProjetoByQuery(session, "Nome='"+titulo+"'","Nome");
        } catch (PersistentException ex) {
           logger.log(Level.SEVERE, "Ocorreu uma excepção ao obter o projeto!", ex);
        }
        return proj;
    }

    @Override
    public ArrayList<siaadao.Tarefa> getTarefas(PersistentSession session, String project_name) {
        Projeto proj = getProjeto(session, project_name);
        
        if(proj==null) 
            return null;

        ArrayList<siaadao.Tarefa> tarefas = new ArrayList(Arrays.asList(proj.tarefas.toArray()));
        Collections.sort(tarefas, (siaadao.Tarefa o1, siaadao.Tarefa o2) -> (o1.getTitulo()).compareTo(o2.getTitulo()));
        
        return tarefas;
        
    }

    @Override
    public ArrayList<siaadao.User> getMembers(PersistentSession session, String project_name) {
        Projeto proj = getProjeto(session, project_name);
        
        if(proj==null) 
            return null;

        ArrayList<siaadao.User> members = new ArrayList(Arrays.asList(proj.users.toArray()));
        Collections.sort(members, (siaadao.User o1, siaadao.User o2) -> (o1.getUsername().compareTo(o2.getUsername())));
        
        return members;
    }

    

}
