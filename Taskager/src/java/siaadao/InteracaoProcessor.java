/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: 
 * License Type: Evaluation
 */
package siaadao;

import org.orm.PersistentException;
public class InteracaoProcessor {
	private int ID;
	
	private String comment;
	
	private long data_interacao;
	
	private String action="";
	
	public void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public void setComment(String value) {
		this.comment = value;
	}
	
	public String getComment() {
		return comment == null ? "" : comment;
	}
	
	public void setData_interacao(long value) {
		this.data_interacao = value;
	}
	
	public long getData_interacao() {
		return data_interacao;
	}
	
	public String getAction() {
		return action;
	}
	
	public void setAction(String action) {
		this.action = action;
	}
	
	private int tarefa_tarefaID;
	
	public void setTarefa_tarefaID(int value) {
		this.tarefa_tarefaID = value;
	}
	
	public int getTarefa_tarefaID() {
		return tarefa_tarefaID;
	}
	
	private int user_userID;
	
	public void setUser_userID(int value) {
		this.user_userID = value;
	}
	
	public int getUser_userID() {
		return user_userID;
	}
	
	public String process() {
		String result = "Unexcepted result";
		if (action.equals("search")) {
			try {
				siaadao.Interacao _interacao = siaadao.InteracaoDAO.loadInteracaoByORMID(getID());
				if (_interacao!= null) {
					copyFromBean(_interacao);
					result = "Search success";
				}
				else {
					result = "Search failed";
				}
			}
			catch (PersistentException e) {
				result = "Search error: " + e.toString();
			}
		}
		else if(action.equals("insert"))  {
			try {
				siaadao.Interacao _interacao = siaadao.InteracaoDAO.createInteracao();
				copyToBean(_interacao);
				if (siaadao.InteracaoDAO.save(_interacao)) {
					result = "Insert success";
				}
				else {
					result = "Insert failed";
				}
			}
			catch (Exception e) {
				result = "Insert error: " + e.toString();
			}
		}
		else if (action.equals("update")) {
			try {
				siaadao.Interacao _interacao= siaadao.InteracaoDAO.loadInteracaoByORMID(getID());
				if (_interacao != null) {
					copyToBean(_interacao);
					if (siaadao.InteracaoDAO.save(_interacao)) {
						result = "Update success";
					}
					 else {
						result = "Update failed";
					}
				}
				 else  {
					result = "Update failed";
				}
				
			}
			catch (PersistentException e) {
				result = "Update error: " + e.toString();
			}
		}
		else if (action.equals("delete")) {
			try {
				siaadao.Interacao _interacao = siaadao.InteracaoDAO.loadInteracaoByORMID(getID());
				if (_interacao != null && siaadao.InteracaoDAO.deleteAndDissociate(_interacao)) {
					result = "Delete success";
				}
				else {
					result = "Delete failed";
				}
			}
			catch (PersistentException e)  {
				result = "Delete error: " + e.toString();
			}
		}
		else if (action.equals("")) {
			result = "";
		}
		action = "";
		return result;
	}
	
	private void copyFromBean(siaadao.Interacao _interacao) {
		setComment(_interacao.getComment());
		setData_interacao(_interacao.getData_interacao());
		setID(_interacao.getORMID());
		
		{
			siaadao.Tarefa _tarefa = _interacao.getTarefa();
			if (_tarefa != null) {
				setTarefa_tarefaID(_tarefa.getORMID());
			}
		}
		
		
		{
			siaadao.User _user = _interacao.getUser();
			if (_user != null) {
				setUser_userID(_user.getORMID());
			}
		}
		
	}
	
	private void copyToBean(siaadao.Interacao _interacao) {
		_interacao.setComment(getComment());
		_interacao.setData_interacao(getData_interacao());
		try  {
			siaadao.Tarefa _tarefa = siaadao.TarefaDAO.loadTarefaByORMID(getTarefa_tarefaID());
			_interacao.setTarefa(_tarefa);
		}
		catch (PersistentException e) {
		}
		
		try  {
			siaadao.User _user = siaadao.UserDAO.loadUserByORMID(getUser_userID());
			_interacao.setUser(_user);
		}
		catch (PersistentException e) {
		}
		
	}
	
}

