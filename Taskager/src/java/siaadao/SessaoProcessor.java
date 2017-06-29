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
public class SessaoProcessor {
	private int ID;
	
	private long data_inicio;
	
	private long data_fim;
	
	private String comentario;
	
	private long tempo_trabalho;
	
	private String action="";
	
	public void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public void setData_inicio(long value) {
		this.data_inicio = value;
	}
	
	public long getData_inicio() {
		return data_inicio;
	}
	
	public void setData_fim(long value) {
		this.data_fim = value;
	}
	
	public long getData_fim() {
		return data_fim;
	}
	
	public void setComentario(String value) {
		this.comentario = value;
	}
	
	public String getComentario() {
		return comentario == null ? "" : comentario;
	}
	
	public void setTempo_trabalho(long value) {
		this.tempo_trabalho = value;
	}
	
	public long getTempo_trabalho() {
		return tempo_trabalho;
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
				siaadao.Sessao _sessao = siaadao.SessaoDAO.loadSessaoByORMID(getID());
				if (_sessao!= null) {
					copyFromBean(_sessao);
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
				siaadao.Sessao _sessao = siaadao.SessaoDAO.createSessao();
				copyToBean(_sessao);
				if (siaadao.SessaoDAO.save(_sessao)) {
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
				siaadao.Sessao _sessao= siaadao.SessaoDAO.loadSessaoByORMID(getID());
				if (_sessao != null) {
					copyToBean(_sessao);
					if (siaadao.SessaoDAO.save(_sessao)) {
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
				siaadao.Sessao _sessao = siaadao.SessaoDAO.loadSessaoByORMID(getID());
				if (_sessao != null && siaadao.SessaoDAO.deleteAndDissociate(_sessao)) {
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
	
	private void copyFromBean(siaadao.Sessao _sessao) {
		setData_inicio(_sessao.getData_inicio());
		setData_fim(_sessao.getData_fim());
		setComentario(_sessao.getComentario());
		setTempo_trabalho(_sessao.getTempo_trabalho());
		setID(_sessao.getORMID());
		
		{
			siaadao.Tarefa _tarefa = _sessao.getTarefa();
			if (_tarefa != null) {
				setTarefa_tarefaID(_tarefa.getORMID());
			}
		}
		
		
		{
			siaadao.User _user = _sessao.getUser();
			if (_user != null) {
				setUser_userID(_user.getORMID());
			}
		}
		
	}
	
	private void copyToBean(siaadao.Sessao _sessao) {
		_sessao.setData_inicio(getData_inicio());
		_sessao.setData_fim(getData_fim());
		_sessao.setComentario(getComentario());
		_sessao.setTempo_trabalho(getTempo_trabalho());
		try  {
			siaadao.Tarefa _tarefa = siaadao.TarefaDAO.loadTarefaByORMID(getTarefa_tarefaID());
			_sessao.setTarefa(_tarefa);
		}
		catch (PersistentException e) {
		}
		
		try  {
			siaadao.User _user = siaadao.UserDAO.loadUserByORMID(getUser_userID());
			_sessao.setUser(_user);
		}
		catch (PersistentException e) {
		}
		
	}
	
}

