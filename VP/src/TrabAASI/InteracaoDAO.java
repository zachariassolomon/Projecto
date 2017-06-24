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

public class InteracaoDAO {
	private static final org.apache.log4j.Logger _logger = org.apache.log4j.Logger.getLogger(InteracaoDAO.class);
	public static Interacao loadInteracaoByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = TrabAASI.ProjectoPersistentManager.instance().getSession();
			return loadInteracaoByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("loadInteracaoByORMID(int ID)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Interacao getInteracaoByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = TrabAASI.ProjectoPersistentManager.instance().getSession();
			return getInteracaoByORMID(session, ID);
		}
		catch (Exception e) {
			_logger.error("getInteracaoByORMID(int ID)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Interacao loadInteracaoByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = TrabAASI.ProjectoPersistentManager.instance().getSession();
			return loadInteracaoByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadInteracaoByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Interacao getInteracaoByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = TrabAASI.ProjectoPersistentManager.instance().getSession();
			return getInteracaoByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			_logger.error("getInteracaoByORMID(int ID, org.hibernate.LockMode lockMode)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Interacao loadInteracaoByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Interacao) session.load(TrabAASI.Interacao.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("loadInteracaoByORMID(PersistentSession session, int ID)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Interacao getInteracaoByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Interacao) session.get(TrabAASI.Interacao.class, new Integer(ID));
		}
		catch (Exception e) {
			_logger.error("getInteracaoByORMID(PersistentSession session, int ID)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Interacao loadInteracaoByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Interacao) session.load(TrabAASI.Interacao.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("loadInteracaoByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Interacao getInteracaoByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Interacao) session.get(TrabAASI.Interacao.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			_logger.error("getInteracaoByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)", e);
			throw new PersistentException(e);
		}
	}
	
	public static List queryInteracao(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = TrabAASI.ProjectoPersistentManager.instance().getSession();
			return queryInteracao(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("queryInteracao(String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static List queryInteracao(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = TrabAASI.ProjectoPersistentManager.instance().getSession();
			return queryInteracao(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("queryInteracao(String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Interacao[] listInteracaoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = TrabAASI.ProjectoPersistentManager.instance().getSession();
			return listInteracaoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("listInteracaoByQuery(String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Interacao[] listInteracaoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = TrabAASI.ProjectoPersistentManager.instance().getSession();
			return listInteracaoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("listInteracaoByQuery(String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static List queryInteracao(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From projecto.Interacao as Interacao");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			_logger.error("listInteracaoByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static List queryInteracao(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From projecto.Interacao as Interacao");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Interacao", lockMode);
			return query.list();
		}
		catch (Exception e) {
			_logger.error("listInteracaoByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Interacao[] listInteracaoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryInteracao(session, condition, orderBy);
			return (Interacao[]) list.toArray(new Interacao[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listInteracaoByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Interacao[] listInteracaoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryInteracao(session, condition, orderBy, lockMode);
			return (Interacao[]) list.toArray(new Interacao[list.size()]);
		}
		catch (Exception e) {
			_logger.error("listInteracaoByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Interacao loadInteracaoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = TrabAASI.ProjectoPersistentManager.instance().getSession();
			return loadInteracaoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("loadInteracaoByQuery(String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Interacao loadInteracaoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = TrabAASI.ProjectoPersistentManager.instance().getSession();
			return loadInteracaoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("loadInteracaoByQuery(String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Interacao loadInteracaoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Interacao[] interacaos = listInteracaoByQuery(session, condition, orderBy);
		if (interacaos != null && interacaos.length > 0)
			return interacaos[0];
		else
			return null;
	}
	
	public static Interacao loadInteracaoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Interacao[] interacaos = listInteracaoByQuery(session, condition, orderBy, lockMode);
		if (interacaos != null && interacaos.length > 0)
			return interacaos[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateInteracaoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = TrabAASI.ProjectoPersistentManager.instance().getSession();
			return iterateInteracaoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			_logger.error("iterateInteracaoByQuery(String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateInteracaoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = TrabAASI.ProjectoPersistentManager.instance().getSession();
			return iterateInteracaoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			_logger.error("iterateInteracaoByQuery(String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateInteracaoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From projecto.Interacao as Interacao");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			_logger.error("iterateInteracaoByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateInteracaoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From projecto.Interacao as Interacao");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Interacao", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			_logger.error("iterateInteracaoByQuery(PersistentSession session, String condition, String orderBy)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Interacao createInteracao() {
		return new TrabAASI.Interacao();
	}
	
	public static boolean save(TrabAASI.Interacao interacao) throws PersistentException {
		try {
			TrabAASI.ProjectoPersistentManager.instance().saveObject(interacao);
			return true;
		}
		catch (Exception e) {
			_logger.error("save(Projecto.Interacao interacao)", e);
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(TrabAASI.Interacao interacao) throws PersistentException {
		try {
			TrabAASI.ProjectoPersistentManager.instance().deleteObject(interacao);
			return true;
		}
		catch (Exception e) {
			_logger.error("delete(Projecto.Interacao interacao)", e);
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(TrabAASI.Interacao interacao)throws PersistentException {
		try {
			if (interacao.getTarefa() != null) {
				interacao.getTarefa().interacoes.remove(interacao);
			}
			
			return delete(interacao);
		}
		catch(Exception e) {
			_logger.error("deleteAndDissociate()", e);
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(TrabAASI.Interacao interacao, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (interacao.getTarefa() != null) {
				interacao.getTarefa().interacoes.remove(interacao);
			}
			
			try {
				session.delete(interacao);
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
	
	public static boolean refresh(TrabAASI.Interacao interacao) throws PersistentException {
		try {
			TrabAASI.ProjectoPersistentManager.instance().getSession().refresh(interacao);
			return true;
		}
		catch (Exception e) {
			_logger.error("refresh(Projecto.Interacao interacao)", e);
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(TrabAASI.Interacao interacao) throws PersistentException {
		try {
			TrabAASI.ProjectoPersistentManager.instance().getSession().evict(interacao);
			return true;
		}
		catch (Exception e) {
			_logger.error("evict(Projecto.Interacao interacao)", e);
			throw new PersistentException(e);
		}
	}
	
	public static Interacao loadInteracaoByCriteria(InteracaoCriteria interacaoCriteria) {
		Interacao[] interacaos = listInteracaoByCriteria(interacaoCriteria);
		if(interacaos == null || interacaos.length == 0) {
			return null;
		}
		return interacaos[0];
	}
	
	public static Interacao[] listInteracaoByCriteria(InteracaoCriteria interacaoCriteria) {
		return interacaoCriteria.listInteracao();
	}
}
