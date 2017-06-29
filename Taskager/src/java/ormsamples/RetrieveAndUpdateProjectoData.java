/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateProjectoData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = siaadao.ProjectoPersistentManager.instance().getSession().beginTransaction();
		try {
			siaadao.User lsiaadaoUser = siaadao.UserDAO.loadUserByQuery(null, null);
			// Update the properties of the persistent object
			siaadao.UserDAO.save(lsiaadaoUser);
			siaadao.Tarefa lsiaadaoTarefa = siaadao.TarefaDAO.loadTarefaByQuery(null, null);
			// Update the properties of the persistent object
			siaadao.TarefaDAO.save(lsiaadaoTarefa);
			siaadao.Projeto lsiaadaoProjeto = siaadao.ProjetoDAO.loadProjetoByQuery(null, null);
			// Update the properties of the persistent object
			siaadao.ProjetoDAO.save(lsiaadaoProjeto);
			siaadao.Interacao lsiaadaoInteracao = siaadao.InteracaoDAO.loadInteracaoByQuery(null, null);
			// Update the properties of the persistent object
			siaadao.InteracaoDAO.save(lsiaadaoInteracao);
			siaadao.Sessao lsiaadaoSessao = siaadao.SessaoDAO.loadSessaoByQuery(null, null);
			// Update the properties of the persistent object
			siaadao.SessaoDAO.save(lsiaadaoSessao);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving User by UserCriteria");
		siaadao.UserCriteria lsiaadaoUserCriteria = new siaadao.UserCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lsiaadaoUserCriteria.ID.eq();
		System.out.println(lsiaadaoUserCriteria.uniqueUser());
		
		System.out.println("Retrieving Tarefa by TarefaCriteria");
		siaadao.TarefaCriteria lsiaadaoTarefaCriteria = new siaadao.TarefaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lsiaadaoTarefaCriteria.ID.eq();
		System.out.println(lsiaadaoTarefaCriteria.uniqueTarefa());
		
		System.out.println("Retrieving Projeto by ProjetoCriteria");
		siaadao.ProjetoCriteria lsiaadaoProjetoCriteria = new siaadao.ProjetoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lsiaadaoProjetoCriteria.ID.eq();
		System.out.println(lsiaadaoProjetoCriteria.uniqueProjeto());
		
		System.out.println("Retrieving Interacao by InteracaoCriteria");
		siaadao.InteracaoCriteria lsiaadaoInteracaoCriteria = new siaadao.InteracaoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lsiaadaoInteracaoCriteria.ID.eq();
		System.out.println(lsiaadaoInteracaoCriteria.uniqueInteracao());
		
		System.out.println("Retrieving Sessao by SessaoCriteria");
		siaadao.SessaoCriteria lsiaadaoSessaoCriteria = new siaadao.SessaoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lsiaadaoSessaoCriteria.ID.eq();
		System.out.println(lsiaadaoSessaoCriteria.uniqueSessao());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateProjectoData retrieveAndUpdateProjectoData = new RetrieveAndUpdateProjectoData();
			try {
				retrieveAndUpdateProjectoData.retrieveAndUpdateTestData();
				//retrieveAndUpdateProjectoData.retrieveByCriteria();
			}
			finally {
				siaadao.ProjectoPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
