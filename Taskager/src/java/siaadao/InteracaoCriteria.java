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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class InteracaoCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression userId;
	public final AssociationExpression user;
	public final IntegerExpression tarefaId;
	public final AssociationExpression tarefa;
	public final StringExpression comment;
	public final LongExpression data_interacao;
	
	public InteracaoCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		userId = new IntegerExpression("user.ID", this);
		user = new AssociationExpression("user", this);
		tarefaId = new IntegerExpression("tarefa.ID", this);
		tarefa = new AssociationExpression("tarefa", this);
		comment = new StringExpression("comment", this);
		data_interacao = new LongExpression("data_interacao", this);
	}
	
	public InteracaoCriteria(PersistentSession session) {
		this(session.createCriteria(Interacao.class));
	}
	
	public InteracaoCriteria() throws PersistentException {
		this(siaadao.ProjectoPersistentManager.instance().getSession());
	}
	
	public UserCriteria createUserCriteria() {
		return new UserCriteria(createCriteria("user"));
	}
	
	public TarefaCriteria createTarefaCriteria() {
		return new TarefaCriteria(createCriteria("tarefa"));
	}
	
	public Interacao uniqueInteracao() {
		return (Interacao) super.uniqueResult();
	}
	
	public Interacao[] listInteracao() {
		java.util.List list = super.list();
		return (Interacao[]) list.toArray(new Interacao[list.size()]);
	}
}

