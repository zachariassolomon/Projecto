/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;
public class CreateProjectoData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = siaadao.ProjectoPersistentManager.instance().getSession().beginTransaction();
		try {
			siaadao.User lsiaadaoUser = siaadao.UserDAO.createUser();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : projetos, email, password, username
			siaadao.UserDAO.save(lsiaadaoUser);
			siaadao.Tarefa lsiaadaoTarefa = siaadao.TarefaDAO.createTarefa();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : sessoes, interacoes, titulo
			siaadao.TarefaDAO.save(lsiaadaoTarefa);
			siaadao.Projeto lsiaadaoProjeto = siaadao.ProjetoDAO.createProjeto();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : users, nome
			siaadao.ProjetoDAO.save(lsiaadaoProjeto);
			siaadao.Interacao lsiaadaoInteracao = siaadao.InteracaoDAO.createInteracao();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : data_interacao, comment, tarefa
			siaadao.InteracaoDAO.save(lsiaadaoInteracao);
			siaadao.Sessao lsiaadaoSessao = siaadao.SessaoDAO.createSessao();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : tarefa
			siaadao.SessaoDAO.save(lsiaadaoSessao);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateProjectoData createProjectoData = new CreateProjectoData();
			try {
				createProjectoData.createTestData();
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
