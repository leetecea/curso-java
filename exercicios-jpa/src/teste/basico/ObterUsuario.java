package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class ObterUsuario {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		// no caso de consulta, não é necessário lidar com transações
		Usuario usuario = em.find(Usuario.class, 1L); // (nome da classe/entidade, identificador)
		System.out.println(usuario.getNome());
		
		em.close();
		emf.close();
	}
}