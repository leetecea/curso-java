package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario2 {
	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Usuario usuario = em.find(Usuario.class, 1L);
		usuario.setNome("Leonardo Leitao");
		
		// em.merge(usuario); // mesmo não chamando merge, ele gera alteração
		// esse comportamento acontece, pois o objeto está no estado gerenciado, de transação
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}
}