package infra;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import modelo.basico.Usuario;

public class DAO<E> {
	
	private static EntityManagerFactory emf; // 1° numa declaração
	private EntityManager em;
	private Class<E> classe; 
	
	static { // 2° num bloco estatico - será chamado apenas uma unica vez, quando a classe for carregada pelo java
		try { // para tratar erros
			emf = Persistence
					.createEntityManagerFactory("exercicios-jpa");
		} catch (Exception e) { // para logar o erro que aconteceu na criação da sua classe
			// logar -> log4j
		}
	}
	
	public DAO() {
		this(null); 
	}
	
	public DAO(Class<E> classe) {  // para pegar a classe que será passada, como no ex: Usuario usuario = em.find(Usuario.class, 1L);
		this.classe = classe;
		em = emf.createEntityManager(); // inicializado no construtor/inicializado na construção do objeto
	}
	
	public DAO<E> abrirT() { // abrir transação
		em.getTransaction().begin();
		return this;
	}
	
	public DAO<E> fecharT() { // fechar transação
		em.getTransaction().commit();
		return this;
	}

	public DAO<E> incluir(E entidade) {  // inclui a alteração
		em.persist(entidade);
		return this;
	}

	public DAO<E> incluirAtomico(E entidade) { // irá considerar a abertura e fechamento da transação, junto com a inclusão da alteração
		return this.abrirT().incluir(entidade).fecharT();
	}
	
	public E obterPorID(Object id) { //
		return em.find(classe, id);
	}
	
	public List<E> obterTodos() { // caso queira chamar obterTodos sem passar os paramentros
		return this.obterTodos(10, 0);
	}
	
	public List<E> obterTodos(int qtde, int deslocamento) {
		if(classe == null) {
			throw new UnsupportedOperationException("Classe nula.");
		}
		
		String jpql = "select e from " + classe.getName() + " e";
		TypedQuery<E> query = em.createQuery(jpql, classe);
		query.setMaxResults(qtde);
		query.setFirstResult(deslocamento);
		return query.getResultList();
	}
	
	// Named Query
	public List<E> consultar(String nomeConsulta, Object... params) {
		TypedQuery<E> query = em.createNamedQuery(nomeConsulta, classe);
		
		for (int i = 0; i < params.length; i += 2) {
			query.setParameter(params[i].toString(), params[i + 1]);
		}
		
		return query.getResultList();
	}
	
	// Named Native Query
	public E consultarUm(String nomeConsulta, Object... params) {
		List<E> lista = consultar(nomeConsulta, params);
		return lista.isEmpty() ? null : lista.get(0);
	}
	
	public void fechar() {
		em.close();
	}
}