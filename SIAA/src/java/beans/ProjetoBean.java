/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import siaadao.Projeto;
import siaadao.ProjetoDAO;
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
    

}
