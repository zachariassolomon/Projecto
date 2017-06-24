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

public class ProjetoCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression nome;
	public final StringExpression descricao;
	public final LongExpression data_criacao;
	public final LongExpression data_fim;
	public final StringExpression estado;
	public final CollectionExpression users;
	public final CollectionExpression tarefas;
	
	public ProjetoCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		nome = new StringExpression("nome", this);
		descricao = new StringExpression("descricao", this);
		data_criacao = new LongExpression("data_criacao", this);
		data_fim = new LongExpression("data_fim", this);
		estado = new StringExpression("estado", this);
		users = new CollectionExpression("ORM_Users", this);
		tarefas = new CollectionExpression("ORM_Tarefas", this);
	}
	
	public ProjetoCriteria(PersistentSession session) {
		this(session.createCriteria(Projeto.class));
	}
	
	public ProjetoCriteria() throws PersistentException {
		this(TrabAASI.ProjectoPersistentManager.instance().getSession());
	}
	
	public TrabAASI.UserCriteria createUsersCriteria() {
		return new TrabAASI.UserCriteria(createCriteria("ORM_Users"));
	}
	
	public TrabAASI.TarefaCriteria createTarefasCriteria() {
		return new TrabAASI.TarefaCriteria(createCriteria("ORM_Tarefas"));
	}
	
	public Projeto uniqueProjeto() {
		return (Projeto) super.uniqueResult();
	}
	
	public Projeto[] listProjeto() {
		java.util.List list = super.list();
		return (Projeto[]) list.toArray(new Projeto[list.size()]);
	}
}

