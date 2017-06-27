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

public class Tarefa {
	public Tarefa() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == siaadao.ORMConstants.KEY_TAREFA_INTERACOES) {
			return ORM_interacoes;
		}
		else if (key == siaadao.ORMConstants.KEY_TAREFA_SESSOES) {
			return ORM_sessoes;
		}
		else if (key == siaadao.ORMConstants.KEY_TAREFA_SUBTAREFAS) {
			return ORM_subtarefas;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == siaadao.ORMConstants.KEY_TAREFA_PROJETO) {
			this.projeto = (siaadao.Projeto) owner;
		}
		
		else if (key == siaadao.ORMConstants.KEY_TAREFA_TAREFA_MAE) {
			this.tarefa_mae = (siaadao.Tarefa) owner;
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
	
	private siaadao.Tarefa tarefa_mae;
	
	private siaadao.Projeto projeto;
	
	private String descricao;
	
	private String estado;
	
	private int prioridade;
	
	private long data_inicio;
	
	private long data_fim;
	
	private String titulo;
	
	private java.util.Set ORM_interacoes = new java.util.HashSet();
	
	private java.util.Set ORM_sessoes = new java.util.HashSet();
	
	private java.util.Set ORM_subtarefas = new java.util.HashSet();
	
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
	
	public void setTitulo(String value) {
		this.titulo = value;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setProjeto(siaadao.Projeto value) {
		if (projeto != null) {
			projeto.tarefas.remove(this);
		}
		if (value != null) {
			value.tarefas.add(this);
		}
	}
	
	public siaadao.Projeto getProjeto() {
		return projeto;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Projeto(siaadao.Projeto value) {
		this.projeto = value;
	}
	
	private siaadao.Projeto getORM_Projeto() {
		return projeto;
	}
	
	public void setTarefa_mae(siaadao.Tarefa value) {
		if (tarefa_mae != null) {
			tarefa_mae.subtarefas.remove(this);
		}
		if (value != null) {
			value.subtarefas.add(this);
		}
	}
	
	public siaadao.Tarefa getTarefa_mae() {
		return tarefa_mae;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Tarefa_mae(siaadao.Tarefa value) {
		this.tarefa_mae = value;
	}
	
	private siaadao.Tarefa getORM_Tarefa_mae() {
		return tarefa_mae;
	}
	
	private void setORM_Interacoes(java.util.Set value) {
		this.ORM_interacoes = value;
	}
	
	private java.util.Set getORM_Interacoes() {
		return ORM_interacoes;
	}
	
	public final siaadao.InteracaoSetCollection interacoes = new siaadao.InteracaoSetCollection(this, _ormAdapter, siaadao.ORMConstants.KEY_TAREFA_INTERACOES, siaadao.ORMConstants.KEY_INTERACAO_TAREFA, siaadao.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Sessoes(java.util.Set value) {
		this.ORM_sessoes = value;
	}
	
	private java.util.Set getORM_Sessoes() {
		return ORM_sessoes;
	}
	
	public final siaadao.SessaoSetCollection sessoes = new siaadao.SessaoSetCollection(this, _ormAdapter, siaadao.ORMConstants.KEY_TAREFA_SESSOES, siaadao.ORMConstants.KEY_SESSAO_TAREFA, siaadao.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Subtarefas(java.util.Set value) {
		this.ORM_subtarefas = value;
	}
	
	private java.util.Set getORM_Subtarefas() {
		return ORM_subtarefas;
	}
	
	public final siaadao.TarefaSetCollection subtarefas = new siaadao.TarefaSetCollection(this, _ormAdapter, siaadao.ORMConstants.KEY_TAREFA_SUBTAREFAS, siaadao.ORMConstants.KEY_TAREFA_TAREFA_MAE, siaadao.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public Tarefa(String titulo) {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public Tarefa(String titulo, int prioridade) {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
