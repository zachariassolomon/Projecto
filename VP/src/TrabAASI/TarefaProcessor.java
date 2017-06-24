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
public class TarefaProcessor {
	private int ID;
	
	private String descricao;
	
	private String estado;
	
	private int prioridade;
	
	private long data_inicio;
	
	private long data_fim;
	
	private String action="";
	
	public void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public void setDescricao(String value) {
		this.descricao = value;
	}
	
	public String getDescricao() {
		return descricao == null ? "" : descricao;
	}
	
	public void setEstado(String value) {
		this.estado = value;
	}
	
	public String getEstado() {
		return estado == null ? "" : estado;
	}
	
	public void setPrioridade(int value) {
		this.prioridade = value;
	}
	
	public int getPrioridade() {
		return prioridade;
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
	
	public String getAction() {
		return action;
	}
	
	public void setAction(String action) {
		this.action = action;
	}
	
	private int projeto_projetoID;
	
	public void setProjeto_projetoID(int value) {
		this.projeto_projetoID = value;
	}
	
	public int getProjeto_projetoID() {
		return projeto_projetoID;
	}
	
	private int tarefa_mae_tarefaID;
	
	public void setTarefa_mae_tarefaID(int value) {
		this.tarefa_mae_tarefaID = value;
	}
	
	public int getTarefa_mae_tarefaID() {
		return tarefa_mae_tarefaID;
	}
	
	public String process() {
		String result = "Unexcepted result";
		if (action.equals("search")) {
			try {
				TrabAASI.Tarefa _tarefa = TrabAASI.TarefaDAO.loadTarefaByORMID(getID());
				if (_tarefa!= null) {
					copyFromBean(_tarefa);
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
				TrabAASI.Tarefa _tarefa = TrabAASI.TarefaDAO.createTarefa();
				copyToBean(_tarefa);
				if (TrabAASI.TarefaDAO.save(_tarefa)) {
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
				TrabAASI.Tarefa _tarefa= TrabAASI.TarefaDAO.loadTarefaByORMID(getID());
				if (_tarefa != null) {
					copyToBean(_tarefa);
					if (TrabAASI.TarefaDAO.save(_tarefa)) {
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
				TrabAASI.Tarefa _tarefa = TrabAASI.TarefaDAO.loadTarefaByORMID(getID());
				if (_tarefa != null && TrabAASI.TarefaDAO.deleteAndDissociate(_tarefa)) {
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
	
	private void copyFromBean(TrabAASI.Tarefa _tarefa) {
		setDescricao(_tarefa.getDescricao());
		setEstado(_tarefa.getEstado());
		setPrioridade(_tarefa.getPrioridade());
		setData_inicio(_tarefa.getData_inicio());
		setData_fim(_tarefa.getData_fim());
		setID(_tarefa.getORMID());
		
		{
			TrabAASI.Projeto _projeto = _tarefa.getProjeto();
			if (_projeto != null) {
				setProjeto_projetoID(_projeto.getORMID());
			}
		}
		
		
		{
			TrabAASI.Tarefa _tarefa2 = _tarefa.getTarefa_mae();
			if (_tarefa2 != null) {
				setTarefa_mae_tarefaID(_tarefa2.getORMID());
			}
		}
		
	}
	
	private void copyToBean(TrabAASI.Tarefa _tarefa) {
		_tarefa.setDescricao(getDescricao());
		_tarefa.setEstado(getEstado());
		_tarefa.setPrioridade(getPrioridade());
		_tarefa.setData_inicio(getData_inicio());
		_tarefa.setData_fim(getData_fim());
		try  {
			TrabAASI.Projeto _projeto = TrabAASI.ProjetoDAO.loadProjetoByORMID(getProjeto_projetoID());
			_tarefa.setProjeto(_projeto);
		}
		catch (PersistentException e) {
		}
		
		try  {
			TrabAASI.Tarefa _tarefa_mae = TrabAASI.TarefaDAO.loadTarefaByORMID(getTarefa_mae_tarefaID());
			_tarefa.setTarefa_mae(_tarefa_mae);
		}
		catch (PersistentException e) {
		}
		
	}
	
}

