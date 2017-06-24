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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class TarefaCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression tarefa_maeId;
	public final AssociationExpression tarefa_mae;
	public final IntegerExpression projetoId;
	public final AssociationExpression projeto;
	public final StringExpression descricao;
	public final StringExpression estado;
	public final IntegerExpression prioridade;
	public final LongExpression data_inicio;
	public final LongExpression data_fim;
	public final CollectionExpression subtarefas;
	public final CollectionExpression interacoes;
	
	public TarefaCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		tarefa_maeId = new IntegerExpression("tarefa_mae.ID", this);
		tarefa_mae = new AssociationExpression("tarefa_mae", this);
		projetoId = new IntegerExpression("projeto.ID", this);
		projeto = new AssociationExpression("projeto", this);
		descricao = new StringExpression("descricao", this);
		estado = new StringExpression("estado", this);
		prioridade = new IntegerExpression("prioridade", this);
		data_inicio = new LongExpression("data_inicio", this);
		data_fim = new LongExpression("data_fim", this);
		subtarefas = new CollectionExpression("ORM_Subtarefas", this);
		interacoes = new CollectionExpression("ORM_Interacoes", this);
	}
	
	public TarefaCriteria(PersistentSession session) {
		this(session.createCriteria(Tarefa.class));
	}
	
	public TarefaCriteria() throws PersistentException {
		this(TrabAASI.ProjectoPersistentManager.instance().getSession());
	}
	
	public TarefaCriteria createTarefa_maeCriteria() {
		return new TarefaCriteria(createCriteria("tarefa_mae"));
	}
	
	public ProjetoCriteria createProjetoCriteria() {
		return new ProjetoCriteria(createCriteria("projeto"));
	}
	
	public TrabAASI.TarefaCriteria createSubtarefasCriteria() {
		return new TrabAASI.TarefaCriteria(createCriteria("ORM_Subtarefas"));
	}
	
	public TrabAASI.InteracaoCriteria createInteracoesCriteria() {
		return new TrabAASI.InteracaoCriteria(createCriteria("ORM_Interacoes"));
	}
	
	public Tarefa uniqueTarefa() {
		return (Tarefa) super.uniqueResult();
	}
	
	public Tarefa[] listTarefa() {
		java.util.List list = super.list();
		return (Tarefa[]) list.toArray(new Tarefa[list.size()]);
	}
}

