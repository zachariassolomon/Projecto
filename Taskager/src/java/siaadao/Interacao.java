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

import utils.Func;

public class Interacao {
	public Interacao() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == siaadao.ORMConstants.KEY_INTERACAO_TAREFA) {
			this.tarefa = (siaadao.Tarefa) owner;
		}
		
		else if (key == siaadao.ORMConstants.KEY_INTERACAO_USER) {
			this.user = (siaadao.User) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int ID;
	
	private siaadao.User user;
	
	private siaadao.Tarefa tarefa;
	
	private String comment;
	
	private long data_interacao;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setComment(String value) {
		this.comment = value;
	}
	
	public String getComment() {
		return comment;
	}
	
	public void setData_interacao(long value) {
		this.data_interacao = value;
	}
	
	public long getData_interacao() {
		return data_interacao;
	}
        
        public String getData_interacaoString() {
		return Func.long2String(data_interacao);
	}
	
	public void setTarefa(siaadao.Tarefa value) {
		if (tarefa != null) {
			tarefa.interacoes.remove(this);
		}
		if (value != null) {
			value.interacoes.add(this);
		}
	}
	
	public siaadao.Tarefa getTarefa() {
		return tarefa;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Tarefa(siaadao.Tarefa value) {
		this.tarefa = value;
	}
	
	private siaadao.Tarefa getORM_Tarefa() {
		return tarefa;
	}
	
	public void setUser(siaadao.User value) {
		if (user != null) {
			user.interacoes.remove(this);
		}
		if (value != null) {
			value.interacoes.add(this);
		}
	}
	
	public siaadao.User getUser() {
		return user;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_User(siaadao.User value) {
		this.user = value;
	}
	
	private siaadao.User getORM_User() {
		return user;
	}
	
	public Interacao(String comment) {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
