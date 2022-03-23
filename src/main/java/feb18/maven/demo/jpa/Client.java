package feb18.maven.demo.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {

	public static void main(String[] args) {
		System.out.println("Start");
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();

		Greet greet = new Greet();
		greet.setMessage("Hey this is 4th message");
		greet.setMessageId(4);

		em.persist(greet);

		System.out.println("Added greeting to database.");

		em.getTransaction().commit();
		em.close();
		factory.close();
		System.out.println("End");
	}
}
