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

public class Projeto {
	public Projeto() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == TrabAASI.ORMConstants.KEY_PROJETO_USERS) {
			return ORM_users;
		}
		else if (key == TrabAASI.ORMConstants.KEY_PROJETO_TAREFAS) {
			return ORM_tarefas;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int ID;
	
	private String nome;
	
	private String descricao;
	
	private long data_criacao;
	
	private long data_fim;
	
	private String estado;
	
	private java.util.Set ORM_users = new java.util.HashSet();
	
	private java.util.Set ORM_tarefas = new java.util.HashSet();
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setNome(String value) {
		this.nome = value;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setDescricao(String value) {
		this.descricao = value;
	}
	
	public String getDescricao() {
		return descricao;
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
		return estado;
	}
	
	private void setORM_Users(java.util.Set value) {
		this.ORM_users = value;
	}
	
	private java.util.Set getORM_Users() {
		return ORM_users;
	}
	
	public final TrabAASI.UserSetCollection users = new TrabAASI.UserSetCollection(this, _ormAdapter, TrabAASI.ORMConstants.KEY_PROJETO_USERS, TrabAASI.ORMConstants.KEY_USER_PROJETOS, TrabAASI.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Tarefas(java.util.Set value) {
		this.ORM_tarefas = value;
	}
	
	private java.util.Set getORM_Tarefas() {
		return ORM_tarefas;
	}
	
	public final TrabAASI.TarefaSetCollection tarefas = new TrabAASI.TarefaSetCollection(this, _ormAdapter, TrabAASI.ORMConstants.KEY_PROJETO_TAREFAS, TrabAASI.ORMConstants.KEY_TAREFA_PROJETO, TrabAASI.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
