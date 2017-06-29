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

public class SessaoDAO {
	private static final org.apache.log4j.Logger _logger = org.apache.log4j.Logger.getLogger(SessaoDAO.class);
	public static Sessao loadSessaoByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = siaadao.ProjectoPersistentManager.instance().getSession();
			return loadSessaoByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("loadSessaoByORMID(int ID)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Sessao getSessaoByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = siaadao.ProjectoPersistentManager.instance().getSession();
			return getSessaoByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("getSessaoByORMID(int ID)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Sessao loadSessaoByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = siaadao.ProjectoPersistentManager.instance().getSession();
			return loadSessaoByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadSessaoByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Sessao getSessaoByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = siaadao.ProjectoPersistentManager.instance().getSession();
			return getSessaoByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("getSessaoByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Sessao loadSessaoByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Sessao) session.load(siaadao.Sessao.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("loadSessaoByORMID(PersistentSession session, int ID)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Sessao getSessaoByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Sessao) session.get(siaadao.Sessao.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("getSessaoByORMID(PersistentSession session, int ID)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Sessao loadSessaoByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Sessao) session.load(siaadao.Sessao.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("loadSessaoByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Sessao getSessaoByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Sessao) session.get(siaadao.Sessao.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("getSessaoByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			throw new PersistentException(e);
		}
	}
	
	public static List querySessao(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = siaadao.ProjectoPersistentManager.instance().getSession();
			return querySessao(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("querySessao(String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static List querySessao(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = siaadao.ProjectoPersistentManager.instance().getSession();
			return querySessao(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("querySessao(String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Sessao[] listSessaoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = siaadao.ProjectoPersistentManager.instance().getSession();
			return listSessaoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("listSessaoByQuery(String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Sessao[] listSessaoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = siaadao.ProjectoPersistentManager.instance().getSession();
			return listSessaoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("listSessaoByQuery(String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static List querySessao(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From siaadao.Sessao as Sessao");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			_logger.error("listSessaoByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static List querySessao(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From siaadao.Sessao as Sessao");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Sessao", lockMode);
			return query.list();
		}
		catch (Exception e) {
			_logger.error("listSessaoByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Sessao[] listSessaoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = querySessao(session, condition, orderBy);
			return (Sessao[]) list.toArray(new Sessao[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listSessaoByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Sessao[] listSessaoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = querySessao(session, condition, orderBy, lockMode);
			return (Sessao[]) list.toArray(new Sessao[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listSessaoByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Sessao loadSessaoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = siaadao.ProjectoPersistentManager.instance().getSession();
			return loadSessaoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("loadSessaoByQuery(String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Sessao loadSessaoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = siaadao.ProjectoPersistentManager.instance().getSession();
			return loadSessaoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadSessaoByQuery(String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Sessao loadSessaoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Sessao[] sessaos = listSessaoByQuery(session, condition, orderBy);
		if (sessaos != null && sessaos.length > 0)
			return sessaos[0];
		else
			return null;
	}
	
	public static Sessao loadSessaoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Sessao[] sessaos = listSessaoByQuery(session, condition, orderBy, lockMode);
		if (sessaos != null && sessaos.length > 0)
			return sessaos[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateSessaoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = siaadao.ProjectoPersistentManager.instance().getSession();
			return iterateSessaoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("iterateSessaoByQuery(String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateSessaoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = siaadao.ProjectoPersistentManager.instance().getSession();
			return iterateSessaoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("iterateSessaoByQuery(String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateSessaoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From siaadao.Sessao as Sessao");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			_logger.error("iterateSessaoByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateSessaoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From siaadao.Sessao as Sessao");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Sessao", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			_logger.error("iterateSessaoByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Sessao createSessao() {
		return new siaadao.Sessao();
	}
	
	public static boolean save(siaadao.Sessao sessao) throws PersistentException {
		try {
			siaadao.ProjectoPersistentManager.instance().saveObject(sessao);
			return true;
		}
		catch (Exception e) {
			_logger.error("save(siaadao.Sessao sessao)", e);
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(siaadao.Sessao sessao) throws PersistentException {
		try {
			siaadao.ProjectoPersistentManager.instance().deleteObject(sessao);
			return true;
		}
		catch (Exception e) {
			_logger.error("delete(siaadao.Sessao sessao)", e);
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(siaadao.Sessao sessao)throws PersistentException {
		try {
			if (sessao.getUser() != null) {
				sessao.getUser().sessoes.remove(sessao);
			}
			
			if (sessao.getTarefa() != null) {
				sessao.getTarefa().sessoes.remove(sessao);
			}
			
			return delete(sessao);
		}
		catch(Exception e) {
			_logger.error("deleteAndDissociate()", e);
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(siaadao.Sessao sessao, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (sessao.getUser() != null) {
				sessao.getUser().sessoes.remove(sessao);
			}
			
			if (sessao.getTarefa() != null) {
				sessao.getTarefa().sessoes.remove(sessao);
			}
			
			try {
				session.delete(sessao);
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
	
	public static boolean refresh(siaadao.Sessao sessao) throws PersistentException {
		try {
			siaadao.ProjectoPersistentManager.instance().getSession().refresh(sessao);
			return true;
		}
		catch (Exception e) {
			_logger.error("refresh(siaadao.Sessao sessao)", e);
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(siaadao.Sessao sessao) throws PersistentException {
		try {
			siaadao.ProjectoPersistentManager.instance().getSession().evict(sessao);
			return true;
		}
		catch (Exception e) {
			_logger.error("evict(siaadao.Sessao sessao)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Sessao loadSessaoByCriteria(SessaoCriteria sessaoCriteria) {
		Sessao[] sessaos = listSessaoByCriteria(sessaoCriteria);
		if(sessaos == null || sessaos.length == 0) {
			return null;
		}
		return sessaos[0];
	}
	
	public static Sessao[] listSessaoByCriteria(SessaoCriteria sessaoCriteria) {
		return sessaoCriteria.listSessao();
	}
}
