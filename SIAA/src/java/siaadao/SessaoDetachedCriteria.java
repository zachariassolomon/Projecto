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

public class SessaoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression userId;
	public final AssociationExpression user;
	public final IntegerExpression tarefaId;
	public final AssociationExpression tarefa;
	public final LongExpression data_inicio;
	public final LongExpression data_fim;
	public final StringExpression comentario;
	public final LongExpression tempo_trabalho;
	
	public SessaoDetachedCriteria() {
		super(siaadao.Sessao.class, siaadao.SessaoCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		userId = new IntegerExpression("user.ID", this.getDetachedCriteria());
		user = new AssociationExpression("user", this.getDetachedCriteria());
		tarefaId = new IntegerExpression("tarefa.ID", this.getDetachedCriteria());
		tarefa = new AssociationExpression("tarefa", this.getDetachedCriteria());
		data_inicio = new LongExpression("data_inicio", this.getDetachedCriteria());
		data_fim = new LongExpression("data_fim", this.getDetachedCriteria());
		comentario = new StringExpression("comentario", this.getDetachedCriteria());
		tempo_trabalho = new LongExpression("tempo_trabalho", this.getDetachedCriteria());
	}
	
	public SessaoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, siaadao.SessaoCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		userId = new IntegerExpression("user.ID", this.getDetachedCriteria());
		user = new AssociationExpression("user", this.getDetachedCriteria());
		tarefaId = new IntegerExpression("tarefa.ID", this.getDetachedCriteria());
		tarefa = new AssociationExpression("tarefa", this.getDetachedCriteria());
		data_inicio = new LongExpression("data_inicio", this.getDetachedCriteria());
		data_fim = new LongExpression("data_fim", this.getDetachedCriteria());
		comentario = new StringExpression("comentario", this.getDetachedCriteria());
		tempo_trabalho = new LongExpression("tempo_trabalho", this.getDetachedCriteria());
	}
	
	public UserDetachedCriteria createUserCriteria() {
		return new UserDetachedCriteria(createCriteria("user"));
	}
	
	public TarefaDetachedCriteria createTarefaCriteria() {
		return new TarefaDetachedCriteria(createCriteria("tarefa"));
	}
	
	public Sessao uniqueSessao(PersistentSession session) {
		return (Sessao) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Sessao[] listSessao(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Sessao[]) list.toArray(new Sessao[list.size()]);
	}
}

