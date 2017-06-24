/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;
public class DeleteProjectoData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = TrabAASI.ProjectoPersistentManager.instance().getSession().beginTransaction();
		try {
			TrabAASI.User projectoUser = TrabAASI.UserDAO.loadUserByQuery(null, null);
			// Delete the persistent object
			TrabAASI.UserDAO.delete(projectoUser);
			TrabAASI.Tarefa projectoTarefa = TrabAASI.TarefaDAO.loadTarefaByQuery(null, null);
			// Delete the persistent object
			TrabAASI.TarefaDAO.delete(projectoTarefa);
			TrabAASI.Projeto projectoProjeto = TrabAASI.ProjetoDAO.loadProjetoByQuery(null, null);
			// Delete the persistent object
			TrabAASI.ProjetoDAO.delete(projectoProjeto);
			TrabAASI.Interacao projectoInteracao = TrabAASI.InteracaoDAO.loadInteracaoByQuery(null, null);
			// Delete the persistent object
			TrabAASI.InteracaoDAO.delete(projectoInteracao);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteProjectoData deleteProjectoData = new DeleteProjectoData();
			try {
				deleteProjectoData.deleteTestData();
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
