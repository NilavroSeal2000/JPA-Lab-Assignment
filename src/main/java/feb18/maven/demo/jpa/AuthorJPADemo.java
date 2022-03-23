package feb18.maven.demo.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AuthorJPADemo {

	public static void main(String[] args) {

		System.out.println("Start");
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistenceUnitName");
		EntityManager em = factory.createEntityManager();

//		Author a1 = new Author(107,"Kalpa","Kumer","Kapoor","9512347581");
////		Author a2 = new Author(102,"Rahim","Sen","Gupta","7412347581");
////		Author a3 = new Author(103,"Sarat","Chandra","Chattopadhya","9512347581");
//
		em.getTransaction().begin();
//
//		em.persist(a1); // insert
////		em.persist(a2); // insert
////		em.persist(a3); // insert

//		em.merge(emp2); // update
		em.remove(em.find(Author.class, 101)); // delete
		Author adata = em.find(Author.class, 101); // select
		em.getTransaction().commit();
//		em.getTransaction().rollback();
		System.out.println(adata);
		System.out.println("End");
	}

}
