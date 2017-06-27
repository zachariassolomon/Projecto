/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.ejb.Local;
import siaadao.Projeto;

/**
 *
 * @author nelson
 */
@Local
public interface ProjetoBeanLocal {

    Projeto create(org.orm.PersistentSession session, String titulo, String descricao);

    Projeto getProjeto(org.orm.PersistentSession session, String titulo);
    
}
