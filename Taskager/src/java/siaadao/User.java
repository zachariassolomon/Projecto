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

public class User {
	public User() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == siaadao.ORMConstants.KEY_USER_PROJETOS) {
			return ORM_projetos;
		}
		else if (key == siaadao.ORMConstants.KEY_USER_SESSOES) {
			return ORM_sessoes;
		}
		else if (key == siaadao.ORMConstants.KEY_USER_INTERACOES) {
			return ORM_interacoes;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int ID;
	
	private String username;
	
	private String password;
	
	private String email;
	
	private java.util.Set ORM_projetos = new java.util.HashSet();
	
	private java.util.Set ORM_sessoes = new java.util.HashSet();
	
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
	
	public void setUsername(String value) {
		this.username = value;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setPassword(String value) {
		this.password = value;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setEmail(String value) {
		this.email = value;
	}
	
	public String getEmail() {
		return email;
	}
	
	private void setORM_Projetos(java.util.Set value) {
		this.ORM_projetos = value;
	}
	
	private java.util.Set getORM_Projetos() {
		return ORM_projetos;
	}
	
	public final siaadao.ProjetoSetCollection projetos = new siaadao.ProjetoSetCollection(this, _ormAdapter, siaadao.ORMConstants.KEY_USER_PROJETOS, siaadao.ORMConstants.KEY_PROJETO_USERS, siaadao.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Sessoes(java.util.Set value) {
		this.ORM_sessoes = value;
	}
	
	private java.util.Set getORM_Sessoes() {
		return ORM_sessoes;
	}
	
	public final siaadao.SessaoSetCollection sessoes = new siaadao.SessaoSetCollection(this, _ormAdapter, siaadao.ORMConstants.KEY_USER_SESSOES, siaadao.ORMConstants.KEY_SESSAO_USER, siaadao.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Interacoes(java.util.Set value) {
		this.ORM_interacoes = value;
	}
	
	private java.util.Set getORM_Interacoes() {
		return ORM_interacoes;
	}
	
	public final siaadao.InteracaoSetCollection interacoes = new siaadao.InteracaoSetCollection(this, _ormAdapter, siaadao.ORMConstants.KEY_USER_INTERACOES, siaadao.ORMConstants.KEY_INTERACAO_USER, siaadao.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public User(String username, String password, String email) {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
