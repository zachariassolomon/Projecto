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

public class ProjetoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression nome;
	public final StringExpression descricao;
	public final LongExpression data_criacao;
	public final LongExpression data_fim;
	public final StringExpression estado;
	public final CollectionExpression users;
	public final CollectionExpression tarefas;
	
	public ProjetoDetachedCriteria() {
		super(TrabAASI.Projeto.class, TrabAASI.ProjetoCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		nome = new StringExpression("nome", this.getDetachedCriteria());
		descricao = new StringExpression("descricao", this.getDetachedCriteria());
		data_criacao = new LongExpression("data_criacao", this.getDetachedCriteria());
		data_fim = new LongExpression("data_fim", this.getDetachedCriteria());
		estado = new StringExpression("estado", this.getDetachedCriteria());
		users = new CollectionExpression("ORM_Users", this.getDetachedCriteria());
		tarefas = new CollectionExpression("ORM_Tarefas", this.getDetachedCriteria());
	}
	
	public ProjetoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, TrabAASI.ProjetoCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		nome = new StringExpression("nome", this.getDetachedCriteria());
		descricao = new StringExpression("descricao", this.getDetachedCriteria());
		data_criacao = new LongExpression("data_criacao", this.getDetachedCriteria());
		data_fim = new LongExpression("data_fim", this.getDetachedCriteria());
		estado = new StringExpression("estado", this.getDetachedCriteria());
		users = new CollectionExpression("ORM_Users", this.getDetachedCriteria());
		tarefas = new CollectionExpression("ORM_Tarefas", this.getDetachedCriteria());
	}
	
	public TrabAASI.UserDetachedCriteria createUsersCriteria() {
		return new TrabAASI.UserDetachedCriteria(createCriteria("ORM_Users"));
	}
	
	public TrabAASI.TarefaDetachedCriteria createTarefasCriteria() {
		return new TrabAASI.TarefaDetachedCriteria(createCriteria("ORM_Tarefas"));
	}
	
	public Projeto uniqueProjeto(PersistentSession session) {
		return (Projeto) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Projeto[] listProjeto(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Projeto[]) list.toArray(new Projeto[list.size()]);
	}
}

