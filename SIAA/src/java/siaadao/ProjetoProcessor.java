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
public class ProjetoProcessor {
	private int ID;
	
	private String nome;
	
	private String descricao;
	
	private long data_criacao;
	
	private long data_fim;
	
	private String estado;
	
	private String action="";
	
	public void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public void setNome(String value) {
		this.nome = value;
	}
	
	public String getNome() {
		return nome == null ? "" : nome;
	}
	
	public void setDescricao(String value) {
		this.descricao = value;
	}
	
	public String getDescricao() {
		return descricao == null ? "" : descricao;
	}
	
	public void setData_criacao(long value) {
		this.data_criacao = value;
	}
	
	public long getData_criacao() {
		return data_criacao;
	}
	
	public void setData_fim(long value) {
		this.data_fim = value;
	}
	
	public long getData_fim() {
		return data_fim;
	}
	
	public void setEstado(String value) {
		this.estado = value;
	}
	
	public String getEstado() {
		return estado == null ? "" : estado;
	}
	
	public String getAction() {
		return action;
	}
	
	public void setAction(String action) {
		this.action = action;
	}
	
	public String process() {
		String result = "Unexcepted result";
		if (action.equals("search")) {
			try {
				siaadao.Projeto _projeto = siaadao.ProjetoDAO.loadProjetoByORMID(getID());
				if (_projeto!= null) {
					copyFromBean(_projeto);
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
				siaadao.Projeto _projeto = siaadao.ProjetoDAO.createProjeto();
				copyToBean(_projeto);
				if (siaadao.ProjetoDAO.save(_projeto)) {
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
				siaadao.Projeto _projeto= siaadao.ProjetoDAO.loadProjetoByORMID(getID());
				if (_projeto != null) {
					copyToBean(_projeto);
					if (siaadao.ProjetoDAO.save(_projeto)) {
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
				siaadao.Projeto _projeto = siaadao.ProjetoDAO.loadProjetoByORMID(getID());
				if (_projeto != null && siaadao.ProjetoDAO.deleteAndDissociate(_projeto)) {
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
	
	private void copyFromBean(siaadao.Projeto _projeto) {
		setNome(_projeto.getNome());
		setDescricao(_projeto.getDescricao());
		setData_criacao(_projeto.getData_criacao());
		setData_fim(_projeto.getData_fim());
		setEstado(_projeto.getEstado());
		setID(_projeto.getORMID());
	}
	
	private void copyToBean(siaadao.Projeto _projeto) {
		_projeto.setNome(getNome());
		_projeto.setDescricao(getDescricao());
		_projeto.setData_criacao(getData_criacao());
		_projeto.setData_fim(getData_fim());
		_projeto.setEstado(getEstado());
	}
	
}

