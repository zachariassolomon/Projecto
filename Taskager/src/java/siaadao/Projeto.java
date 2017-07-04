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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import utils.Func;

public class Projeto {
	public Projeto() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == siaadao.ORMConstants.KEY_PROJETO_USERS) {
			return ORM_users;
		}
		else if (key == siaadao.ORMConstants.KEY_PROJETO_TAREFAS) {
			return ORM_tarefas;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int ID;
	
	private String nome;
	
	private String descricao;
	
	private long data_fim;
	
	private long data_criacao;
	
	private String estado;
	
	private long last_updated;
	
	private java.util.Set ORM_users = new java.util.HashSet();
	
	private java.util.Set ORM_tarefas = new java.util.HashSet();
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setNome(String value) {
		this.nome = value;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setDescricao(String value) {
		this.descricao = value;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setData_criacao(long value) {
		this.data_criacao = value;
	}
	
	public long getData_criacao() {
		return data_criacao;
	}
        
        public String getData_criacaoString() {
		return Func.long2String(data_criacao);
	}
	
	public void setData_fim(long value) {
		this.data_fim = value;
	}
	
	public long getData_fim() {
		return data_fim;
	}
	
        public String getData_fimString() {
		return Func.long2String(data_fim);
	}
                
	public void setEstado(String value) {
		this.estado = value;
	}
	
	public String getEstado() {
		return estado;
	}
	
	public void setLast_updated(long value) {
		this.last_updated = value;
	}
	
	public long getLast_updated() {
		return last_updated;
	}
        
        public String getLast_updatedString() {
                return Func.long2String(last_updated);
	}
	
	private void setORM_Users(java.util.Set value) {
		this.ORM_users = value;
	}
	
	private java.util.Set getORM_Users() {
		return ORM_users;
	}
	
	public final siaadao.UserSetCollection users = new siaadao.UserSetCollection(this, _ormAdapter, siaadao.ORMConstants.KEY_PROJETO_USERS, siaadao.ORMConstants.KEY_USER_PROJETOS, siaadao.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
        public ArrayList<User> getUsers() {
		return new ArrayList<>(Arrays.asList(users.toArray()));
	}
        
        public HashMap<String, String> getTempos() {
            HashMap<String, Long> tempos = new HashMap<>();
            HashMap<String, String> temposString = new HashMap<>();
            for (Tarefa tar : tarefas.toArray()) {
                for (Tarefa subtar : tar.subtarefas.toArray()) {
                    for(Sessao s : subtar.getSessoes()) {
                        String u = s.getUser().getUsername();
                        if(tempos.containsKey(u)) {
                            Long novo_tempo = tempos.get(u)+s.getTempo_trabalho();
                            tempos.replace(u, novo_tempo);
                        } else {
                            tempos.put(u, s.getTempo_trabalho());
                        }
                    }
                }
            }
            for(Entry<String,Long> tempoEntry : tempos.entrySet()) {
                temposString.put(tempoEntry.getKey(), Func.minutes2hours(tempoEntry.getValue()));
            }
            return temposString;
        }
        
        public ArrayList<User> getMembers() {
            ArrayList<siaadao.User> members = new ArrayList(Arrays.asList(users.toArray()));
            return members;
        }
        
        public Long getTempoTrabalho() {
            long tempo = 0;
            for (Tarefa tar : tarefas.toArray()) {
                for (Tarefa subtar : tar.subtarefas.toArray()) {
                    for(Sessao s : subtar.getSessoes()) {
                        tempo+=s.getTempo_trabalho();
                    }
                }
            }
            return tempo;
        }
        
        public String getTempoTrabalhoString() {
            return Func.minutes2hours(getTempoTrabalho());
        }
        
	private void setORM_Tarefas(java.util.Set value) {
		this.ORM_tarefas = value;
	}
	
	private java.util.Set getORM_Tarefas() {
		return ORM_tarefas;
	}
	
	public final siaadao.TarefaSetCollection tarefas = new siaadao.TarefaSetCollection(this, _ormAdapter, siaadao.ORMConstants.KEY_PROJETO_TAREFAS, siaadao.ORMConstants.KEY_TAREFA_PROJETO, siaadao.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public Projeto(String nome, String descricao) {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
        @Override
	public String toString() {
		return String.valueOf(getID());
	}
	
}
