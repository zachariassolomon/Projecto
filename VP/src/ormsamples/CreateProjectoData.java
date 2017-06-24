/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;
public class CreateProjectoData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = TrabAASI.ProjectoPersistentManager.instance().getSession().beginTransaction();
		try {
			TrabAASI.User projectoUser = TrabAASI.UserDAO.createUser();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : projetos
			TrabAASI.UserDAO.save(projectoUser);
			TrabAASI.Tarefa projectoTarefa = TrabAASI.TarefaDAO.createTarefa();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : interacoes, subtarefas, data_fim, data_inicio, prioridade, projeto, tarefa_mae
			TrabAASI.TarefaDAO.save(projectoTarefa);
			TrabAASI.Projeto projectoProjeto = TrabAASI.ProjetoDAO.createProjeto();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : tarefas, users, data_fim, data_criacao
			TrabAASI.ProjetoDAO.save(projectoProjeto);
			TrabAASI.Interacao projectoInteracao = TrabAASI.InteracaoDAO.createInteracao();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : data_interacao, tarefa
			TrabAASI.InteracaoDAO.save(projectoInteracao);
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
				TrabAASI.ProjectoPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
