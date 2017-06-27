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
		siaadao.User[] siaadaoUsers = siaadao.UserDAO.listUserByQuery(null, null);
		int length = Math.min(siaadaoUsers.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(siaadaoUsers[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Tarefa...");
		siaadao.Tarefa[] siaadaoTarefas = siaadao.TarefaDAO.listTarefaByQuery(null, null);
		length = Math.min(siaadaoTarefas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(siaadaoTarefas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Projeto...");
		siaadao.Projeto[] siaadaoProjetos = siaadao.ProjetoDAO.listProjetoByQuery(null, null);
		length = Math.min(siaadaoProjetos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(siaadaoProjetos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Interacao...");
		siaadao.Interacao[] siaadaoInteracaos = siaadao.InteracaoDAO.listInteracaoByQuery(null, null);
		length = Math.min(siaadaoInteracaos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(siaadaoInteracaos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Sessao...");
		siaadao.Sessao[] siaadaoSessaos = siaadao.SessaoDAO.listSessaoByQuery(null, null);
		length = Math.min(siaadaoSessaos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(siaadaoSessaos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing User by Criteria...");
		siaadao.UserCriteria lsiaadaoUserCriteria = new siaadao.UserCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lsiaadaoUserCriteria.ID.eq();
		lsiaadaoUserCriteria.setMaxResults(ROW_COUNT);
		siaadao.User[] siaadaoUsers = lsiaadaoUserCriteria.listUser();
		int length =siaadaoUsers== null ? 0 : Math.min(siaadaoUsers.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(siaadaoUsers[i]);
		}
		System.out.println(length + " User record(s) retrieved."); 
		
		System.out.println("Listing Tarefa by Criteria...");
		siaadao.TarefaCriteria lsiaadaoTarefaCriteria = new siaadao.TarefaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lsiaadaoTarefaCriteria.ID.eq();
		lsiaadaoTarefaCriteria.setMaxResults(ROW_COUNT);
		siaadao.Tarefa[] siaadaoTarefas = lsiaadaoTarefaCriteria.listTarefa();
		length =siaadaoTarefas== null ? 0 : Math.min(siaadaoTarefas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(siaadaoTarefas[i]);
		}
		System.out.println(length + " Tarefa record(s) retrieved."); 
		
		System.out.println("Listing Projeto by Criteria...");
		siaadao.ProjetoCriteria lsiaadaoProjetoCriteria = new siaadao.ProjetoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lsiaadaoProjetoCriteria.ID.eq();
		lsiaadaoProjetoCriteria.setMaxResults(ROW_COUNT);
		siaadao.Projeto[] siaadaoProjetos = lsiaadaoProjetoCriteria.listProjeto();
		length =siaadaoProjetos== null ? 0 : Math.min(siaadaoProjetos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(siaadaoProjetos[i]);
		}
		System.out.println(length + " Projeto record(s) retrieved."); 
		
		System.out.println("Listing Interacao by Criteria...");
		siaadao.InteracaoCriteria lsiaadaoInteracaoCriteria = new siaadao.InteracaoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lsiaadaoInteracaoCriteria.ID.eq();
		lsiaadaoInteracaoCriteria.setMaxResults(ROW_COUNT);
		siaadao.Interacao[] siaadaoInteracaos = lsiaadaoInteracaoCriteria.listInteracao();
		length =siaadaoInteracaos== null ? 0 : Math.min(siaadaoInteracaos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(siaadaoInteracaos[i]);
		}
		System.out.println(length + " Interacao record(s) retrieved."); 
		
		System.out.println("Listing Sessao by Criteria...");
		siaadao.SessaoCriteria lsiaadaoSessaoCriteria = new siaadao.SessaoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lsiaadaoSessaoCriteria.ID.eq();
		lsiaadaoSessaoCriteria.setMaxResults(ROW_COUNT);
		siaadao.Sessao[] siaadaoSessaos = lsiaadaoSessaoCriteria.listSessao();
		length =siaadaoSessaos== null ? 0 : Math.min(siaadaoSessaos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(siaadaoSessaos[i]);
		}
		System.out.println(length + " Sessao record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListProjectoData listProjectoData = new ListProjectoData();
			try {
				listProjectoData.listTestData();
				//listProjectoData.listByCriteria();
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
