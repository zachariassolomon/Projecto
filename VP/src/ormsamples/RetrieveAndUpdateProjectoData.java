/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateProjectoData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = TrabAASI.ProjectoPersistentManager.instance().getSession().beginTransaction();
		try {
			TrabAASI.User projectoUser = TrabAASI.UserDAO.loadUserByQuery(null, null);
			// Update the properties of the persistent object
			TrabAASI.UserDAO.save(projectoUser);
			TrabAASI.Tarefa projectoTarefa = TrabAASI.TarefaDAO.loadTarefaByQuery(null, null);
			// Update the properties of the persistent object
			TrabAASI.TarefaDAO.save(projectoTarefa);
			TrabAASI.Projeto projectoProjeto = TrabAASI.ProjetoDAO.loadProjetoByQuery(null, null);
			// Update the properties of the persistent object
			TrabAASI.ProjetoDAO.save(projectoProjeto);
			TrabAASI.Interacao projectoInteracao = TrabAASI.InteracaoDAO.loadInteracaoByQuery(null, null);
			// Update the properties of the persistent object
			TrabAASI.InteracaoDAO.save(projectoInteracao);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving User by UserCriteria");
		TrabAASI.UserCriteria projectoUserCriteria = new TrabAASI.UserCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//projectoUserCriteria.ID.eq();
		System.out.println(projectoUserCriteria.uniqueUser());
		
		System.out.println("Retrieving Tarefa by TarefaCriteria");
		TrabAASI.TarefaCriteria projectoTarefaCriteria = new TrabAASI.TarefaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//projectoTarefaCriteria.ID.eq();
		System.out.println(projectoTarefaCriteria.uniqueTarefa());
		
		System.out.println("Retrieving Projeto by ProjetoCriteria");
		TrabAASI.ProjetoCriteria projectoProjetoCriteria = new TrabAASI.ProjetoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//projectoProjetoCriteria.ID.eq();
		System.out.println(projectoProjetoCriteria.uniqueProjeto());
		
		System.out.println("Retrieving Interacao by InteracaoCriteria");
		TrabAASI.InteracaoCriteria projectoInteracaoCriteria = new TrabAASI.InteracaoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//projectoInteracaoCriteria.ID.eq();
		System.out.println(projectoInteracaoCriteria.uniqueInteracao());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateProjectoData retrieveAndUpdateProjectoData = new RetrieveAndUpdateProjectoData();
			try {
				retrieveAndUpdateProjectoData.retrieveAndUpdateTestData();
				//retrieveAndUpdateProjectoData.retrieveByCriteria();
			}
			finally {
				TrabAASI.ProjectoPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
