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

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class UserDAO {
	private static final org.apache.log4j.Logger _logger = org.apache.log4j.Logger.getLogger(UserDAO.class);
	public static User loadUserByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = TrabAASI.ProjectoPersistentManager.instance().getSession();
			return loadUserByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("loadUserByORMID(int ID)", e);
			throw new PersistentException(e);
		}
	}
	
	public static User getUserByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = TrabAASI.ProjectoPersistentManager.instance().getSession();
			return getUserByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("getUserByORMID(int ID)", e);
			throw new PersistentException(e);
		}
	}
	
	public static User loadUserByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = TrabAASI.ProjectoPersistentManager.instance().getSession();
			return loadUserByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadUserByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			throw new PersistentException(e);
		}
	}
	
	public static User getUserByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = TrabAASI.ProjectoPersistentManager.instance().getSession();
			return getUserByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("getUserByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			throw new PersistentException(e);
		}
	}
	
	public static User loadUserByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (User) session.load(TrabAASI.User.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("loadUserByORMID(PersistentSession session, int ID)", e);
			throw new PersistentException(e);
		}
	}
	
	public static User getUserByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (User) session.get(TrabAASI.User.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("getUserByORMID(PersistentSession session, int ID)", e);
			throw new PersistentException(e);
		}
	}
	
	public static User loadUserByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (User) session.load(TrabAASI.User.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("loadUserByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			throw new PersistentException(e);
		}
	}
	
	public static User getUserByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (User) session.get(TrabAASI.User.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("getUserByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			throw new PersistentException(e);
		}
	}
	
	public static List queryUser(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = TrabAASI.ProjectoPersistentManager.instance().getSession();
			return queryUser(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("queryUser(String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static List queryUser(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = TrabAASI.ProjectoPersistentManager.instance().getSession();
			return queryUser(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("queryUser(String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static User[] listUserByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = TrabAASI.ProjectoPersistentManager.instance().getSession();
			return listUserByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("listUserByQuery(String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static User[] listUserByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = TrabAASI.ProjectoPersistentManager.instance().getSession();
			return listUserByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("listUserByQuery(String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static List queryUser(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From projecto.User as User");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			_logger.error("listUserByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static List queryUser(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From projecto.User as User");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("User", lockMode);
			return query.list();
		}
		catch (Exception e) {
			_logger.error("listUserByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static User[] listUserByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryUser(session, condition, orderBy);
			return (User[]) list.toArray(new User[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listUserByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static User[] listUserByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryUser(session, condition, orderBy, lockMode);
			return (User[]) list.toArray(new User[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listUserByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static User loadUserByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = TrabAASI.ProjectoPersistentManager.instance().getSession();
			return loadUserByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("loadUserByQuery(String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static User loadUserByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = TrabAASI.ProjectoPersistentManager.instance().getSession();
			return loadUserByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadUserByQuery(String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static User loadUserByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		User[] users = listUserByQuery(session, condition, orderBy);
		if (users != null && users.length > 0)
			return users[0];
		else
			return null;
	}
	
	public static User loadUserByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		User[] users = listUserByQuery(session, condition, orderBy, lockMode);
		if (users != null && users.length > 0)
			return users[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateUserByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = TrabAASI.ProjectoPersistentManager.instance().getSession();
			return iterateUserByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("iterateUserByQuery(String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUserByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = TrabAASI.ProjectoPersistentManager.instance().getSession();
			return iterateUserByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("iterateUserByQuery(String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUserByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From projecto.User as User");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			_logger.error("iterateUserByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUserByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From projecto.User as User");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("User", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			_logger.error("iterateUserByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static User createUser() {
		return new TrabAASI.User();
	}
	
	public static boolean save(TrabAASI.User user) throws PersistentException {
		try {
			TrabAASI.ProjectoPersistentManager.instance().saveObject(user);
			return true;
		}
		catch (Exception e) {
			_logger.error("save(Projecto.User user)", e);
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(TrabAASI.User user) throws PersistentException {
		try {
			TrabAASI.ProjectoPersistentManager.instance().deleteObject(user);
			return true;
		}
		catch (Exception e) {
			_logger.error("delete(Projecto.User user)", e);
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(TrabAASI.User user)throws PersistentException {
		try {
			TrabAASI.Projeto[] lProjetoss = user.projetos.toArray();
			for(int i = 0; i < lProjetoss.length; i++) {
				lProjetoss[i].users.remove(user);
			}
			return delete(user);
		}
		catch(Exception e) {
			_logger.error("deleteAndDissociate()", e);
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(TrabAASI.User user, org.orm.PersistentSession session)throws PersistentException {
		try {
			TrabAASI.Projeto[] lProjetoss = user.projetos.toArray();
			for(int i = 0; i < lProjetoss.length; i++) {
				lProjetoss[i].users.remove(user);
			}
			try {
				session.delete(user);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			_logger.error("deleteAndDissociate()", e);
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(TrabAASI.User user) throws PersistentException {
		try {
			TrabAASI.ProjectoPersistentManager.instance().getSession().refresh(user);
			return true;
		}
		catch (Exception e) {
			_logger.error("refresh(Projecto.User user)", e);
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(TrabAASI.User user) throws PersistentException {
		try {
			TrabAASI.ProjectoPersistentManager.instance().getSession().evict(user);
			return true;
		}
		catch (Exception e) {
			_logger.error("evict(Projecto.User user)", e);
			throw new PersistentException(e);
		}
	}
	
	public static User loadUserByCriteria(UserCriteria userCriteria) {
		User[] users = listUserByCriteria(userCriteria);
		if(users == null || users.length == 0) {
			return null;
		}
		return users[0];
	}
	
	public static User[] listUserByCriteria(UserCriteria userCriteria) {
		return userCriteria.listUser();
	}
}
