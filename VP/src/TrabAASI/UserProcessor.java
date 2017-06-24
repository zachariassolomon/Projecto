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
public class UserProcessor {
	private int ID;
	
	private String username;
	
	private String password;
	
	private String email;
	
	private String action="";
	
	public void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public void setUsername(String value) {
		this.username = value;
	}
	
	public String getUsername() {
		return username == null ? "" : username;
	}
	
	public void setPassword(String value) {
		this.password = value;
	}
	
	public String getPassword() {
		return password == null ? "" : password;
	}
	
	public void setEmail(String value) {
		this.email = value;
	}
	
	public String getEmail() {
		return email == null ? "" : email;
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
				TrabAASI.User _user = TrabAASI.UserDAO.loadUserByORMID(getID());
				if (_user!= null) {
					copyFromBean(_user);
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
				TrabAASI.User _user = TrabAASI.UserDAO.createUser();
				copyToBean(_user);
				if (TrabAASI.UserDAO.save(_user)) {
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
				TrabAASI.User _user= TrabAASI.UserDAO.loadUserByORMID(getID());
				if (_user != null) {
					copyToBean(_user);
					if (TrabAASI.UserDAO.save(_user)) {
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
				TrabAASI.User _user = TrabAASI.UserDAO.loadUserByORMID(getID());
				if (_user != null && TrabAASI.UserDAO.deleteAndDissociate(_user)) {
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
	
	private void copyFromBean(TrabAASI.User _user) {
		setUsername(_user.getUsername());
		setPassword(_user.getPassword());
		setEmail(_user.getEmail());
		setID(_user.getORMID());
	}
	
	private void copyToBean(TrabAASI.User _user) {
		_user.setUsername(getUsername());
		_user.setPassword(getPassword());
		_user.setEmail(getEmail());
	}
	
}

