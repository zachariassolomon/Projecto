/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;
public class ListProjectoData {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing User...");
		TrabAASI.User[] projectoUsers = TrabAASI.UserDAO.listUserByQuery(null, null);
		int length = Math.min(projectoUsers.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(projectoUsers[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Tarefa...");
		TrabAASI.Tarefa[] projectoTarefas = TrabAASI.TarefaDAO.listTarefaByQuery(null, null);
		length = Math.min(projectoTarefas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(projectoTarefas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Projeto...");
		TrabAASI.Projeto[] projectoProjetos = TrabAASI.ProjetoDAO.listProjetoByQuery(null, null);
		length = Math.min(projectoProjetos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(projectoProjetos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Interacao...");
		TrabAASI.Interacao[] projectoInteracaos = TrabAASI.InteracaoDAO.listInteracaoByQuery(null, null);
		length = Math.min(projectoInteracaos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(projectoInteracaos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing User by Criteria...");
		TrabAASI.UserCriteria projectoUserCriteria = new TrabAASI.UserCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//projectoUserCriteria.ID.eq();
		projectoUserCriteria.setMaxResults(ROW_COUNT);
		TrabAASI.User[] projectoUsers = projectoUserCriteria.listUser();
		int length =projectoUsers== null ? 0 : Math.min(projectoUsers.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(projectoUsers[i]);
		}
		System.out.println(length + " User record(s) retrieved."); 
		
		System.out.println("Listing Tarefa by Criteria...");
		TrabAASI.TarefaCriteria projectoTarefaCriteria = new TrabAASI.TarefaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//projectoTarefaCriteria.ID.eq();
		projectoTarefaCriteria.setMaxResults(ROW_COUNT);
		TrabAASI.Tarefa[] projectoTarefas = projectoTarefaCriteria.listTarefa();
		length =projectoTarefas== null ? 0 : Math.min(projectoTarefas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(projectoTarefas[i]);
		}
		System.out.println(length + " Tarefa record(s) retrieved."); 
		
		System.out.println("Listing Projeto by Criteria...");
		TrabAASI.ProjetoCriteria projectoProjetoCriteria = new TrabAASI.ProjetoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//projectoProjetoCriteria.ID.eq();
		projectoProjetoCriteria.setMaxResults(ROW_COUNT);
		TrabAASI.Projeto[] projectoProjetos = projectoProjetoCriteria.listProjeto();
		length =projectoProjetos== null ? 0 : Math.min(projectoProjetos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(projectoProjetos[i]);
		}
		System.out.println(length + " Projeto record(s) retrieved."); 
		
		System.out.println("Listing Interacao by Criteria...");
		TrabAASI.InteracaoCriteria projectoInteracaoCriteria = new TrabAASI.InteracaoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//projectoInteracaoCriteria.ID.eq();
		projectoInteracaoCriteria.setMaxResults(ROW_COUNT);
		TrabAASI.Interacao[] projectoInteracaos = projectoInteracaoCriteria.listInteracao();
		length =projectoInteracaos== null ? 0 : Math.min(projectoInteracaos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(projectoInteracaos[i]);
		}
		System.out.println(length + " Interacao record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListProjectoData listProjectoData = new ListProjectoData();
			try {
				listProjectoData.listTestData();
				//listProjectoData.listByCriteria();
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
