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

public class User {
	public User() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == TrabAASI.ORMConstants.KEY_USER_PROJETOS) {
			return ORM_projetos;
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
	
	public final TrabAASI.ProjetoSetCollection projetos = new TrabAASI.ProjetoSetCollection(this, _ormAdapter, TrabAASI.ORMConstants.KEY_USER_PROJETOS, TrabAASI.ORMConstants.KEY_PROJETO_USERS, TrabAASI.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
