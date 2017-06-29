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

public class SessaoCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression userId;
	public final AssociationExpression user;
	public final IntegerExpression tarefaId;
	public final AssociationExpression tarefa;
	public final LongExpression data_inicio;
	public final LongExpression data_fim;
	public final StringExpression comentario;
	public final LongExpression tempo_trabalho;
	
	public SessaoCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		userId = new IntegerExpression("user.ID", this);
		user = new AssociationExpression("user", this);
		tarefaId = new IntegerExpression("tarefa.ID", this);
		tarefa = new AssociationExpression("tarefa", this);
		data_inicio = new LongExpression("data_inicio", this);
		data_fim = new LongExpression("data_fim", this);
		comentario = new StringExpression("comentario", this);
		tempo_trabalho = new LongExpression("tempo_trabalho", this);
	}
	
	public SessaoCriteria(PersistentSession session) {
		this(session.createCriteria(Sessao.class));
	}
	
	public SessaoCriteria() throws PersistentException {
		this(siaadao.ProjectoPersistentManager.instance().getSession());
	}
	
	public UserCriteria createUserCriteria() {
		return new UserCriteria(createCriteria("user"));
	}
	
	public TarefaCriteria createTarefaCriteria() {
		return new TarefaCriteria(createCriteria("tarefa"));
	}
	
	public Sessao uniqueSessao() {
		return (Sessao) super.uniqueResult();
	}
	
	public Sessao[] listSessao() {
		java.util.List list = super.list();
		return (Sessao[]) list.toArray(new Sessao[list.size()]);
	}
}

