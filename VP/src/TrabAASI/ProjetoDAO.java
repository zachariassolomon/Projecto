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

public class ProjetoDAO {
	private static final org.apache.log4j.Logger _logger = org.apache.log4j.Logger.getLogger(ProjetoDAO.class);
	public static Projeto loadProjetoByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = TrabAASI.ProjectoPersistentManager.instance().getSession();
			return loadProjetoByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("loadProjetoByORMID(int ID)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Projeto getProjetoByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = TrabAASI.ProjectoPersistentManager.instance().getSession();
			return getProjetoByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("getProjetoByORMID(int ID)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Projeto loadProjetoByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = TrabAASI.ProjectoPersistentManager.instance().getSession();
			return loadProjetoByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadProjetoByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Projeto getProjetoByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = TrabAASI.ProjectoPersistentManager.instance().getSession();
			return getProjetoByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("getProjetoByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Projeto loadProjetoByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Projeto) session.load(TrabAASI.Projeto.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("loadProjetoByORMID(PersistentSession session, int ID)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Projeto getProjetoByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Projeto) session.get(TrabAASI.Projeto.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("getProjetoByORMID(PersistentSession session, int ID)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Projeto loadProjetoByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Projeto) session.load(TrabAASI.Projeto.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("loadProjetoByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Projeto getProjetoByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Projeto) session.get(TrabAASI.Projeto.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("getProjetoByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			throw new PersistentException(e);
		}
	}
	
	public static List queryProjeto(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = TrabAASI.ProjectoPersistentManager.instance().getSession();
			return queryProjeto(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("queryProjeto(String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static List queryProjeto(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = TrabAASI.ProjectoPersistentManager.instance().getSession();
			return queryProjeto(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("queryProjeto(String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Projeto[] listProjetoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = TrabAASI.ProjectoPersistentManager.instance().getSession();
			return listProjetoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("listProjetoByQuery(String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Projeto[] listProjetoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = TrabAASI.ProjectoPersistentManager.instance().getSession();
			return listProjetoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("listProjetoByQuery(String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static List queryProjeto(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From projecto.Projeto as Projeto");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			_logger.error("listProjetoByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static List queryProjeto(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From projecto.Projeto as Projeto");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Projeto", lockMode);
			return query.list();
		}
		catch (Exception e) {
			_logger.error("listProjetoByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Projeto[] listProjetoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryProjeto(session, condition, orderBy);
			return (Projeto[]) list.toArray(new Projeto[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listProjetoByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Projeto[] listProjetoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryProjeto(session, condition, orderBy, lockMode);
			return (Projeto[]) list.toArray(new Projeto[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listProjetoByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Projeto loadProjetoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = TrabAASI.ProjectoPersistentManager.instance().getSession();
			return loadProjetoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("loadProjetoByQuery(String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Projeto loadProjetoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = TrabAASI.ProjectoPersistentManager.instance().getSession();
			return loadProjetoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadProjetoByQuery(String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Projeto loadProjetoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Projeto[] projetos = listProjetoByQuery(session, condition, orderBy);
		if (projetos != null && projetos.length > 0)
			return projetos[0];
		else
			return null;
	}
	
	public static Projeto loadProjetoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Projeto[] projetos = listProjetoByQuery(session, condition, orderBy, lockMode);
		if (projetos != null && projetos.length > 0)
			return projetos[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateProjetoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = TrabAASI.ProjectoPersistentManager.instance().getSession();
			return iterateProjetoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("iterateProjetoByQuery(String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateProjetoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = TrabAASI.ProjectoPersistentManager.instance().getSession();
			return iterateProjetoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("iterateProjetoByQuery(String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateProjetoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From projecto.Projeto as Projeto");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			_logger.error("iterateProjetoByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateProjetoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From projecto.Projeto as Projeto");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Projeto", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			_logger.error("iterateProjetoByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Projeto createProjeto() {
		return new TrabAASI.Projeto();
	}
	
	public static boolean save(TrabAASI.Projeto projeto) throws PersistentException {
		try {
			TrabAASI.ProjectoPersistentManager.instance().saveObject(projeto);
			return true;
		}
		catch (Exception e) {
			_logger.error("save(Projecto.Projeto projeto)", e);
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(TrabAASI.Projeto projeto) throws PersistentException {
		try {
			TrabAASI.ProjectoPersistentManager.instance().deleteObject(projeto);
			return true;
		}
		catch (Exception e) {
			_logger.error("delete(Projecto.Projeto projeto)", e);
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(TrabAASI.Projeto projeto)throws PersistentException {
		try {
			TrabAASI.User[] lUserss = projeto.users.toArray();
			for(int i = 0; i < lUserss.length; i++) {
				lUserss[i].projetos.remove(projeto);
			}
			TrabAASI.Tarefa[] lTarefass = projeto.tarefas.toArray();
			for(int i = 0; i < lTarefass.length; i++) {
				lTarefass[i].setProjeto(null);
			}
			return delete(projeto);
		}
		catch(Exception e) {
			_logger.error("deleteAndDissociate()", e);
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(TrabAASI.Projeto projeto, org.orm.PersistentSession session)throws PersistentException {
		try {
			TrabAASI.User[] lUserss = projeto.users.toArray();
			for(int i = 0; i < lUserss.length; i++) {
				lUserss[i].projetos.remove(projeto);
			}
			TrabAASI.Tarefa[] lTarefass = projeto.tarefas.toArray();
			for(int i = 0; i < lTarefass.length; i++) {
				lTarefass[i].setProjeto(null);
			}
			try {
				session.delete(projeto);
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
	
	public static boolean refresh(TrabAASI.Projeto projeto) throws PersistentException {
		try {
			TrabAASI.ProjectoPersistentManager.instance().getSession().refresh(projeto);
			return true;
		}
		catch (Exception e) {
			_logger.error("refresh(Projecto.Projeto projeto)", e);
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(TrabAASI.Projeto projeto) throws PersistentException {
		try {
			TrabAASI.ProjectoPersistentManager.instance().getSession().evict(projeto);
			return true;
		}
		catch (Exception e) {
			_logger.error("evict(Projecto.Projeto projeto)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Projeto loadProjetoByCriteria(ProjetoCriteria projetoCriteria) {
		Projeto[] projetos = listProjetoByCriteria(projetoCriteria);
		if(projetos == null || projetos.length == 0) {
			return null;
		}
		return projetos[0];
	}
	
	public static Projeto[] listProjetoByCriteria(ProjetoCriteria projetoCriteria) {
		return projetoCriteria.listProjeto();
	}
}
