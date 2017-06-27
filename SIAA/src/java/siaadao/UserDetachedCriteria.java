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

public class UserDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression username;
	public final StringExpression password;
	public final StringExpression email;
	public final CollectionExpression projetos;
	public final CollectionExpression sessoes;
	public final CollectionExpression interacoes;
	
	public UserDetachedCriteria() {
		super(siaadao.User.class, siaadao.UserCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		username = new StringExpression("username", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		projetos = new CollectionExpression("ORM_Projetos", this.getDetachedCriteria());
		sessoes = new CollectionExpression("ORM_Sessoes", this.getDetachedCriteria());
		interacoes = new CollectionExpression("ORM_Interacoes", this.getDetachedCriteria());
	}
	
	public UserDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, siaadao.UserCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		username = new StringExpression("username", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		projetos = new CollectionExpression("ORM_Projetos", this.getDetachedCriteria());
		sessoes = new CollectionExpression("ORM_Sessoes", this.getDetachedCriteria());
		interacoes = new CollectionExpression("ORM_Interacoes", this.getDetachedCriteria());
	}
	
	public ProjetoDetachedCriteria createProjetosCriteria() {
		return new ProjetoDetachedCriteria(createCriteria("ORM_Projetos"));
	}
	
	public SessaoDetachedCriteria createSessoesCriteria() {
		return new SessaoDetachedCriteria(createCriteria("ORM_Sessoes"));
	}
	
	public InteracaoDetachedCriteria createInteracoesCriteria() {
		return new InteracaoDetachedCriteria(createCriteria("ORM_Interacoes"));
	}
	
	public User uniqueUser(PersistentSession session) {
		return (User) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public User[] listUser(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (User[]) list.toArray(new User[list.size()]);
	}
}

