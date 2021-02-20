package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		
//		Pessoa p1 = new Pessoa(null, "Francisco Souza", "fran@souza");
//		Pessoa p2 = new Pessoa(null, "Ana Clara", "ana@clara");
//		Pessoa p3 = new Pessoa(null, "Carolina Souza", "carol@souza");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
//		em.getTransaction().begin();
//		
//		em.persist(p1);
//		em.persist(p2);
//		em.persist(p3);
//		
//		em.getTransaction().commit();
//		
//		quando é só consulta não precisa do getTransaction
//		Pessoa p = em.find(Pessoa.class, 2);
//		System.out.println(p);
		
//		se vai fazer um aoperação de criação, exclusão ou alteração
//		em.getTransaction().begin();
//		Pessoa p = em.find(Pessoa.class, 2);
//		em.remove(p);
//		em.getTransaction().commit();
		
		System.out.println("Pronto, dados gravados no BD!");
		em.close();
		emf.close();
	}

}
