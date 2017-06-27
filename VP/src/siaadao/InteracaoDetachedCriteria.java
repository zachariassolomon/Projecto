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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class InteracaoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression userId;
	public final AssociationExpression user;
	public final IntegerExpression tarefaId;
	public final AssociationExpression tarefa;
	public final StringExpression comment;
	public final LongExpression data_interacao;
	
	public InteracaoDetachedCriteria() {
		super(siaadao.Interacao.class, siaadao.InteracaoCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		userId = new IntegerExpression("user.ID", this.getDetachedCriteria());
		user = new AssociationExpression("user", this.getDetachedCriteria());
		tarefaId = new IntegerExpression("tarefa.ID", this.getDetachedCriteria());
		tarefa = new AssociationExpression("tarefa", this.getDetachedCriteria());
		comment = new StringExpression("comment", this.getDetachedCriteria());
		data_interacao = new LongExpression("data_interacao", this.getDetachedCriteria());
	}
	
	public InteracaoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, siaadao.InteracaoCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		userId = new IntegerExpression("user.ID", this.getDetachedCriteria());
		user = new AssociationExpression("user", this.getDetachedCriteria());
		tarefaId = new IntegerExpression("tarefa.ID", this.getDetachedCriteria());
		tarefa = new AssociationExpression("tarefa", this.getDetachedCriteria());
		comment = new StringExpression("comment", this.getDetachedCriteria());
		data_interacao = new LongExpression("data_interacao", this.getDetachedCriteria());
	}
	
	public UserDetachedCriteria createUserCriteria() {
		return new UserDetachedCriteria(createCriteria("user"));
	}
	
	public TarefaDetachedCriteria createTarefaCriteria() {
		return new TarefaDetachedCriteria(createCriteria("tarefa"));
	}
	
	public Interacao uniqueInteracao(PersistentSession session) {
		return (Interacao) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Interacao[] listInteracao(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Interacao[]) list.toArray(new Interacao[list.size()]);
	}
}

