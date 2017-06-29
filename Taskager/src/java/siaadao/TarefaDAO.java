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

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class TarefaDAO {
	private static final org.apache.log4j.Logger _logger = org.apache.log4j.Logger.getLogger(TarefaDAO.class);
	public static Tarefa loadTarefaByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = siaadao.ProjectoPersistentManager.instance().getSession();
			return loadTarefaByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("loadTarefaByORMID(int ID)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Tarefa getTarefaByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = siaadao.ProjectoPersistentManager.instance().getSession();
			return getTarefaByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("getTarefaByORMID(int ID)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Tarefa loadTarefaByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = siaadao.ProjectoPersistentManager.instance().getSession();
			return loadTarefaByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadTarefaByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Tarefa getTarefaByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = siaadao.ProjectoPersistentManager.instance().getSession();
			return getTarefaByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("getTarefaByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Tarefa loadTarefaByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Tarefa) session.load(siaadao.Tarefa.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("loadTarefaByORMID(PersistentSession session, int ID)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Tarefa getTarefaByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Tarefa) session.get(siaadao.Tarefa.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("getTarefaByORMID(PersistentSession session, int ID)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Tarefa loadTarefaByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Tarefa) session.load(siaadao.Tarefa.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("loadTarefaByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Tarefa getTarefaByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Tarefa) session.get(siaadao.Tarefa.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("getTarefaByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			throw new PersistentException(e);
		}
	}
	
	public static List queryTarefa(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = siaadao.ProjectoPersistentManager.instance().getSession();
			return queryTarefa(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("queryTarefa(String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static List queryTarefa(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = siaadao.ProjectoPersistentManager.instance().getSession();
			return queryTarefa(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("queryTarefa(String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Tarefa[] listTarefaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = siaadao.ProjectoPersistentManager.instance().getSession();
			return listTarefaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("listTarefaByQuery(String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Tarefa[] listTarefaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = siaadao.ProjectoPersistentManager.instance().getSession();
			return listTarefaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("listTarefaByQuery(String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static List queryTarefa(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From siaadao.Tarefa as Tarefa");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			_logger.error("listTarefaByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static List queryTarefa(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From siaadao.Tarefa as Tarefa");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Tarefa", lockMode);
			return query.list();
		}
		catch (Exception e) {
			_logger.error("listTarefaByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Tarefa[] listTarefaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryTarefa(session, condition, orderBy);
			return (Tarefa[]) list.toArray(new Tarefa[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listTarefaByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Tarefa[] listTarefaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryTarefa(session, condition, orderBy, lockMode);
			return (Tarefa[]) list.toArray(new Tarefa[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listTarefaByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Tarefa loadTarefaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = siaadao.ProjectoPersistentManager.instance().getSession();
			return loadTarefaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("loadTarefaByQuery(String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Tarefa loadTarefaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = siaadao.ProjectoPersistentManager.instance().getSession();
			return loadTarefaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadTarefaByQuery(String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Tarefa loadTarefaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Tarefa[] tarefas = listTarefaByQuery(session, condition, orderBy);
		if (tarefas != null && tarefas.length > 0)
			return tarefas[0];
		else
			return null;
	}
	
	public static Tarefa loadTarefaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Tarefa[] tarefas = listTarefaByQuery(session, condition, orderBy, lockMode);
		if (tarefas != null && tarefas.length > 0)
			return tarefas[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateTarefaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = siaadao.ProjectoPersistentManager.instance().getSession();
			return iterateTarefaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("iterateTarefaByQuery(String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTarefaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = siaadao.ProjectoPersistentManager.instance().getSession();
			return iterateTarefaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("iterateTarefaByQuery(String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTarefaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From siaadao.Tarefa as Tarefa");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			_logger.error("iterateTarefaByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTarefaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From siaadao.Tarefa as Tarefa");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Tarefa", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			_logger.error("iterateTarefaByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Tarefa createTarefa() {
		return new siaadao.Tarefa();
	}
	
	public static boolean save(siaadao.Tarefa tarefa) throws PersistentException {
		try {
			siaadao.ProjectoPersistentManager.instance().saveObject(tarefa);
			return true;
		}
		catch (Exception e) {
			_logger.error("save(siaadao.Tarefa tarefa)", e);
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(siaadao.Tarefa tarefa) throws PersistentException {
		try {
			siaadao.ProjectoPersistentManager.instance().deleteObject(tarefa);
			return true;
		}
		catch (Exception e) {
			_logger.error("delete(siaadao.Tarefa tarefa)", e);
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(siaadao.Tarefa tarefa)throws PersistentException {
		try {
			if (tarefa.getTarefa_mae() != null) {
				tarefa.getTarefa_mae().subtarefas.remove(tarefa);
			}
			
			if (tarefa.getProjeto() != null) {
				tarefa.getProjeto().tarefas.remove(tarefa);
			}
			
			siaadao.Interacao[] lInteracoess = tarefa.interacoes.toArray();
			for(int i = 0; i < lInteracoess.length; i++) {
				lInteracoess[i].setTarefa(null);
			}
			siaadao.Sessao[] lSessoess = tarefa.sessoes.toArray();
			for(int i = 0; i < lSessoess.length; i++) {
				lSessoess[i].setTarefa(null);
			}
			siaadao.Tarefa[] lSubtarefass = tarefa.subtarefas.toArray();
			for(int i = 0; i < lSubtarefass.length; i++) {
				lSubtarefass[i].setTarefa_mae(null);
			}
			return delete(tarefa);
		}
		catch(Exception e) {
			_logger.error("deleteAndDissociate()", e);
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(siaadao.Tarefa tarefa, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (tarefa.getTarefa_mae() != null) {
				tarefa.getTarefa_mae().subtarefas.remove(tarefa);
			}
			
			if (tarefa.getProjeto() != null) {
				tarefa.getProjeto().tarefas.remove(tarefa);
			}
			
			siaadao.Interacao[] lInteracoess = tarefa.interacoes.toArray();
			for(int i = 0; i < lInteracoess.length; i++) {
				lInteracoess[i].setTarefa(null);
			}
			siaadao.Sessao[] lSessoess = tarefa.sessoes.toArray();
			for(int i = 0; i < lSessoess.length; i++) {
				lSessoess[i].setTarefa(null);
			}
			siaadao.Tarefa[] lSubtarefass = tarefa.subtarefas.toArray();
			for(int i = 0; i < lSubtarefass.length; i++) {
				lSubtarefass[i].setTarefa_mae(null);
			}
			try {
				session.delete(tarefa);
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
	
	public static boolean refresh(siaadao.Tarefa tarefa) throws PersistentException {
		try {
			siaadao.ProjectoPersistentManager.instance().getSession().refresh(tarefa);
			return true;
		}
		catch (Exception e) {
			_logger.error("refresh(siaadao.Tarefa tarefa)", e);
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(siaadao.Tarefa tarefa) throws PersistentException {
		try {
			siaadao.ProjectoPersistentManager.instance().getSession().evict(tarefa);
			return true;
		}
		catch (Exception e) {
			_logger.error("evict(siaadao.Tarefa tarefa)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Tarefa loadTarefaByCriteria(TarefaCriteria tarefaCriteria) {
		Tarefa[] tarefas = listTarefaByCriteria(tarefaCriteria);
		if(tarefas == null || tarefas.length == 0) {
			return null;
		}
		return tarefas[0];
	}
	
	public static Tarefa[] listTarefaByCriteria(TarefaCriteria tarefaCriteria) {
		return tarefaCriteria.listTarefa();
	}
}
