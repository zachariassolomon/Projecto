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

public class Tarefa {
	public Tarefa() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == TrabAASI.ORMConstants.KEY_TAREFA_SUBTAREFAS) {
			return ORM_subtarefas;
		}
		else if (key == TrabAASI.ORMConstants.KEY_TAREFA_INTERACOES) {
			return ORM_interacoes;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == TrabAASI.ORMConstants.KEY_TAREFA_PROJETO) {
			this.projeto = (TrabAASI.Projeto) owner;
		}
		
		else if (key == TrabAASI.ORMConstants.KEY_TAREFA_TAREFA_MAE) {
			this.tarefa_mae = (TrabAASI.Tarefa) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int ID;
	
	private TrabAASI.Tarefa tarefa_mae;
	
	private TrabAASI.Projeto projeto;
	
	private String descricao;
	
	private String estado;
	
	private int prioridade;
	
	private long data_inicio;
	
	private long data_fim;
	
	private java.util.Set ORM_subtarefas = new java.util.HashSet();
	
	private java.util.Set ORM_interacoes = new java.util.HashSet();
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setDescricao(String value) {
		this.descricao = value;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setEstado(String value) {
		this.estado = value;
	}
	
	public String getEstado() {
		return estado;
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
	
	public void setProjeto(TrabAASI.Projeto value) {
		if (projeto != null) {
			projeto.tarefas.remove(this);
		}
		if (value != null) {
			value.tarefas.add(this);
		}
	}
	
	public TrabAASI.Projeto getProjeto() {
		return projeto;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Projeto(TrabAASI.Projeto value) {
		this.projeto = value;
	}
	
	private TrabAASI.Projeto getORM_Projeto() {
		return projeto;
	}
	
	private void setORM_Subtarefas(java.util.Set value) {
		this.ORM_subtarefas = value;
	}
	
	private java.util.Set getORM_Subtarefas() {
		return ORM_subtarefas;
	}
	
	public final TrabAASI.TarefaSetCollection subtarefas = new TrabAASI.TarefaSetCollection(this, _ormAdapter, TrabAASI.ORMConstants.KEY_TAREFA_SUBTAREFAS, TrabAASI.ORMConstants.KEY_TAREFA_TAREFA_MAE, TrabAASI.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public void setTarefa_mae(TrabAASI.Tarefa value) {
		if (tarefa_mae != null) {
			tarefa_mae.subtarefas.remove(this);
		}
		if (value != null) {
			value.subtarefas.add(this);
		}
	}
	
	public TrabAASI.Tarefa getTarefa_mae() {
		return tarefa_mae;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Tarefa_mae(TrabAASI.Tarefa value) {
		this.tarefa_mae = value;
	}
	
	private TrabAASI.Tarefa getORM_Tarefa_mae() {
		return tarefa_mae;
	}
	
	private void setORM_Interacoes(java.util.Set value) {
		this.ORM_interacoes = value;
	}
	
	private java.util.Set getORM_Interacoes() {
		return ORM_interacoes;
	}
	
	public final TrabAASI.InteracaoSetCollection interacoes = new TrabAASI.InteracaoSetCollection(this, _ormAdapter, TrabAASI.ORMConstants.KEY_TAREFA_INTERACOES, TrabAASI.ORMConstants.KEY_INTERACAO_TAREFA, TrabAASI.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
