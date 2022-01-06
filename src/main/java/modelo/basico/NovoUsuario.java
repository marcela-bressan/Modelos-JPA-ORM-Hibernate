package modelo.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class NovoUsuario {
	public static void main(String[] args) {
		//Entity Manager -> CRUD 
		// Entity Manager Factory - > cria Entity Manager
		//JPQL
		
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("exercicios-JPA");
		EntityManager em = emf.createEntityManager();
		
		Usuario novoUsuario = new Usuario("Carlos","carlos@local.com.br");
		Usuario novoUsuario2 = new Usuario("André","andre@local.com.br");
		Usuario novoUsuario3 = new Usuario("Luana","luana@local.com.br");
		Usuario novoUsuario4 = new Usuario("Carla","carla@local.com.br");
		Usuario novoUsuario5 = new Usuario("Guilherme","gui@local.com.br");
		Usuario novoUsuario6 = new Usuario("Luciano","luciano@local.com.br");
				
		
		//Iniciar
		em.getTransaction().begin();
		
		//inserir o objeto
		
		em.persist(novoUsuario);
		em.persist(novoUsuario2);
		em.persist(novoUsuario3);
		em.persist(novoUsuario4);
		em.persist(novoUsuario5);
		em.persist(novoUsuario6);
		
		System.out.println(novoUsuario.getId());
		
		//Gravar
		em.getTransaction().commit();
		
		//Fechar
		em.close();
		emf.close();
		
		
	}
}
