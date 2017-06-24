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

public class Interacao {
	public Interacao() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == TrabAASI.ORMConstants.KEY_INTERACAO_TAREFA) {
			this.tarefa = (TrabAASI.Tarefa) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int ID;
	
	private TrabAASI.Tarefa tarefa;
	
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
	
	public void setTarefa(TrabAASI.Tarefa value) {
		if (tarefa != null) {
			tarefa.interacoes.remove(this);
		}
		if (value != null) {
			value.interacoes.add(this);
		}
	}
	
	public TrabAASI.Tarefa getTarefa() {
		return tarefa;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Tarefa(TrabAASI.Tarefa value) {
		this.tarefa = value;
	}
	
	private TrabAASI.Tarefa getORM_Tarefa() {
		return tarefa;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
