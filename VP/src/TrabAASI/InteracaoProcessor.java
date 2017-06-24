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
package TrabAASI;

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
	
	public String process() {
		String result = "Unexcepted result";
		if (action.equals("search")) {
			try {
				TrabAASI.Interacao _interacao = TrabAASI.InteracaoDAO.loadInteracaoByORMID(getID());
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
				TrabAASI.Interacao _interacao = TrabAASI.InteracaoDAO.createInteracao();
				copyToBean(_interacao);
				if (TrabAASI.InteracaoDAO.save(_interacao)) {
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
				TrabAASI.Interacao _interacao= TrabAASI.InteracaoDAO.loadInteracaoByORMID(getID());
				if (_interacao != null) {
					copyToBean(_interacao);
					if (TrabAASI.InteracaoDAO.save(_interacao)) {
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
				TrabAASI.Interacao _interacao = TrabAASI.InteracaoDAO.loadInteracaoByORMID(getID());
				if (_interacao != null && TrabAASI.InteracaoDAO.deleteAndDissociate(_interacao)) {
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
	
	private void copyFromBean(TrabAASI.Interacao _interacao) {
		setComment(_interacao.getComment());
		setData_interacao(_interacao.getData_interacao());
		setID(_interacao.getORMID());
		
		{
			TrabAASI.Tarefa _tarefa = _interacao.getTarefa();
			if (_tarefa != null) {
				setTarefa_tarefaID(_tarefa.getORMID());
			}
		}
		
	}
	
	private void copyToBean(TrabAASI.Interacao _interacao) {
		_interacao.setComment(getComment());
		_interacao.setData_interacao(getData_interacao());
		try  {
			TrabAASI.Tarefa _tarefa = TrabAASI.TarefaDAO.loadTarefaByORMID(getTarefa_tarefaID());
			_interacao.setTarefa(_tarefa);
		}
		catch (PersistentException e) {
		}
		
	}
	
}

