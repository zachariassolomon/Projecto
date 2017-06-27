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

public class UserCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression username;
	public final StringExpression password;
	public final StringExpression email;
	public final CollectionExpression projetos;
	public final CollectionExpression sessoes;
	public final CollectionExpression interacoes;
	
	public UserCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		username = new StringExpression("username", this);
		password = new StringExpression("password", this);
		email = new StringExpression("email", this);
		projetos = new CollectionExpression("ORM_Projetos", this);
		sessoes = new CollectionExpression("ORM_Sessoes", this);
		interacoes = new CollectionExpression("ORM_Interacoes", this);
	}
	
	public UserCriteria(PersistentSession session) {
		this(session.createCriteria(User.class));
	}
	
	public UserCriteria() throws PersistentException {
		this(siaadao.ProjectoPersistentManager.instance().getSession());
	}
	
	public ProjetoCriteria createProjetosCriteria() {
		return new ProjetoCriteria(createCriteria("ORM_Projetos"));
	}
	
	public SessaoCriteria createSessoesCriteria() {
		return new SessaoCriteria(createCriteria("ORM_Sessoes"));
	}
	
	public InteracaoCriteria createInteracoesCriteria() {
		return new InteracaoCriteria(createCriteria("ORM_Interacoes"));
	}
	
	public User uniqueUser() {
		return (User) super.uniqueResult();
	}
	
	public User[] listUser() {
		java.util.List list = super.list();
		return (User[]) list.toArray(new User[list.size()]);
	}
}

