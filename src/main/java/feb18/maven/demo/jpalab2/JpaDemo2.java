package feb18.maven.demo.jpalab2;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaDemo2 {

	public static void main(String[] args) {

		System.out.println("Start");
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistenceUnitName");
		EntityManager em = factory.createEntityManager();

		Author_Table author1 = new Author_Table(108, "Sukumar Roy", null);
//		Author_Table author2 = new Author_Table(107, "S.N. Dey", null);

		em.getTransaction().begin();

		em.persist(author1);
//		em.persist(author2);

		ArrayList<Author_Table> al1 = new ArrayList<Author_Table>();
		ArrayList<Author_Table> al2 = new ArrayList<Author_Table>();

		al1.add(author1);
//		al1.add(author2);

		al2.add(author1);
//		al2.add(author2);

		Book_Table book1 = new Book_Table("PF1274", "Ha Ja Ba Ra La", 550.0, al1);
//		Book_Table book2 = new Book_Table("MT5012", "Mathematics", 350.0, al2);

		em.persist(book1);
//		em.persist(book2);

		em.getTransaction().commit();
		em.close();
		factory.close();
//		System.out.println(empData.toString());
		System.out.println("End");
	}
}