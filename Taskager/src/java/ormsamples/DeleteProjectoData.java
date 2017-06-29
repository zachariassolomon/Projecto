/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;
public class DeleteProjectoData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = siaadao.ProjectoPersistentManager.instance().getSession().beginTransaction();
		try {
			siaadao.User lsiaadaoUser = siaadao.UserDAO.loadUserByQuery(null, null);
			// Delete the persistent object
			siaadao.UserDAO.delete(lsiaadaoUser);
			siaadao.Tarefa lsiaadaoTarefa = siaadao.TarefaDAO.loadTarefaByQuery(null, null);
			// Delete the persistent object
			siaadao.TarefaDAO.delete(lsiaadaoTarefa);
			siaadao.Projeto lsiaadaoProjeto = siaadao.ProjetoDAO.loadProjetoByQuery(null, null);
			// Delete the persistent object
			siaadao.ProjetoDAO.delete(lsiaadaoProjeto);
			siaadao.Interacao lsiaadaoInteracao = siaadao.InteracaoDAO.loadInteracaoByQuery(null, null);
			// Delete the persistent object
			siaadao.InteracaoDAO.delete(lsiaadaoInteracao);
			siaadao.Sessao lsiaadaoSessao = siaadao.SessaoDAO.loadSessaoByQuery(null, null);
			// Delete the persistent object
			siaadao.SessaoDAO.delete(lsiaadaoSessao);
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
				siaadao.ProjectoPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
