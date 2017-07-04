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

public class Sessao {
	public Sessao() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == siaadao.ORMConstants.KEY_SESSAO_TAREFA) {
			this.tarefa = (siaadao.Tarefa) owner;
		}
		
		else if (key == siaadao.ORMConstants.KEY_SESSAO_USER) {
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
	
	private long data_inicio;
	
	private long data_fim;
	
	private String comentario;
	
	private long tempo_trabalho;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setData_inicio(long value) {
		this.data_inicio = value;
	}
	
	public long getData_inicio() {
		return data_inicio;
	}
        
        public String getData_inicioString() {
		return Func.long2String(data_inicio);
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
		return comentario;
	}
	
	public void setTempo_trabalho(long value) {
		this.tempo_trabalho = value;
	}
	
	public long getTempo_trabalho() {
		return tempo_trabalho;
	}
	
        public String getTempo_trabalhoString() {
		return Func.minutes2hours(tempo_trabalho);
	}
                
	public void setTarefa(siaadao.Tarefa value) {
		if (tarefa != null) {
			tarefa.sessoes.remove(this);
		}
		if (value != null) {
			value.sessoes.add(this);
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
			user.sessoes.remove(this);
		}
		if (value != null) {
			value.sessoes.add(this);
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
	
	public Sessao(int data_inicio) {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public Sessao(long tempo_trabalho) {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
