package modelo.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AlterarUsuario2 {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("exercicios-JPA");
		EntityManager em = emf.createEntityManager();
		
em.getTransaction().begin();
		
		
		//alterar
		Usuario usuario = em.find(Usuario.class, 1L);
		usuario.setNome("Marcela");
		//em.merge(usuario);	

		em.getTransaction().commit();
		
		em.clear();
		emf.close();
	}
}
