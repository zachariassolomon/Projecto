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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class TarefaDetachedCriteria extends AbstractORMDetachedCriteria {
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
	
	public TarefaDetachedCriteria() {
		super(TrabAASI.Tarefa.class, TrabAASI.TarefaCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		tarefa_maeId = new IntegerExpression("tarefa_mae.ID", this.getDetachedCriteria());
		tarefa_mae = new AssociationExpression("tarefa_mae", this.getDetachedCriteria());
		projetoId = new IntegerExpression("projeto.ID", this.getDetachedCriteria());
		projeto = new AssociationExpression("projeto", this.getDetachedCriteria());
		descricao = new StringExpression("descricao", this.getDetachedCriteria());
		estado = new StringExpression("estado", this.getDetachedCriteria());
		prioridade = new IntegerExpression("prioridade", this.getDetachedCriteria());
		data_inicio = new LongExpression("data_inicio", this.getDetachedCriteria());
		data_fim = new LongExpression("data_fim", this.getDetachedCriteria());
		subtarefas = new CollectionExpression("ORM_Subtarefas", this.getDetachedCriteria());
		interacoes = new CollectionExpression("ORM_Interacoes", this.getDetachedCriteria());
	}
	
	public TarefaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, TrabAASI.TarefaCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		tarefa_maeId = new IntegerExpression("tarefa_mae.ID", this.getDetachedCriteria());
		tarefa_mae = new AssociationExpression("tarefa_mae", this.getDetachedCriteria());
		projetoId = new IntegerExpression("projeto.ID", this.getDetachedCriteria());
		projeto = new AssociationExpression("projeto", this.getDetachedCriteria());
		descricao = new StringExpression("descricao", this.getDetachedCriteria());
		estado = new StringExpression("estado", this.getDetachedCriteria());
		prioridade = new IntegerExpression("prioridade", this.getDetachedCriteria());
		data_inicio = new LongExpression("data_inicio", this.getDetachedCriteria());
		data_fim = new LongExpression("data_fim", this.getDetachedCriteria());
		subtarefas = new CollectionExpression("ORM_Subtarefas", this.getDetachedCriteria());
		interacoes = new CollectionExpression("ORM_Interacoes", this.getDetachedCriteria());
	}
	
	public TarefaDetachedCriteria createTarefa_maeCriteria() {
		return new TarefaDetachedCriteria(createCriteria("tarefa_mae"));
	}
	
	public ProjetoDetachedCriteria createProjetoCriteria() {
		return new ProjetoDetachedCriteria(createCriteria("projeto"));
	}
	
	public TrabAASI.TarefaDetachedCriteria createSubtarefasCriteria() {
		return new TrabAASI.TarefaDetachedCriteria(createCriteria("ORM_Subtarefas"));
	}
	
	public TrabAASI.InteracaoDetachedCriteria createInteracoesCriteria() {
		return new TrabAASI.InteracaoDetachedCriteria(createCriteria("ORM_Interacoes"));
	}
	
	public Tarefa uniqueTarefa(PersistentSession session) {
		return (Tarefa) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Tarefa[] listTarefa(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Tarefa[]) list.toArray(new Tarefa[list.size()]);
	}
}

