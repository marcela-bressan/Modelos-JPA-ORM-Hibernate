package modelo.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AlterarUsuario1 {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("exercicios-JPA");
		EntityManager em = emf.createEntityManager();
		
		//Iniciar
		em.getTransaction().begin();
		
		
		//Alterar
		Usuario usuario = em.find(Usuario.class, 1L);
		usuario.setNome("Marcela");
		usuario.setEmail("marcela@gmail.com");
		em.merge(usuario);
		
		//Gravar
		em.getTransaction().commit();
		

		em.clear();
		emf.close();
	}
}
