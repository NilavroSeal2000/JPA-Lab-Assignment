package feb18.maven.demo.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaDemo {

	public static void main(String[] args) {

		System.out.println("Start");
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistenceUnitName");
		EntityManager em = factory.createEntityManager();

		Employee emp = new Employee(101, "Sonu", 50000);
		Employee emp2 = new Employee(102, "Monu", 60000);
		Employee emp3 = new Employee(103, "Tonu", 55000);

		em.getTransaction().begin();

//		em.persist(emp); // insert
//		em.persist(emp2); // insert
//		em.persist(emp3); // insert

 		emp2.setSalary(65000);

		em.merge(emp2); // update
//		em.remove(emp); // delete
		Employee empData = em.find(Employee.class, 102); // select
		em.getTransaction().commit();
//		em.getTransaction().rollback();
		System.out.println(empData.toString());
		System.out.println("End");
	}
}


//package feb18.maven.demo.jpa;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.Persistence;
//
//public class JpaDemo {
//
//	public static void main(String[] args) {
//
//		System.out.println("Start");
//		EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistenceUnitName");
//		EntityManager em = factory.createEntityManager();
//
//		Employee emp = new Employee(105, "Bimal", 60000);
//
//		em.getTransaction().begin();
//
//		em.persist(emp); // insert
////		em.merge(emp); // update
////		em.remove(emp); // delete
//		Employee emp2 = em.find(Employee.class, 103); // select by primary key
//		//em.find
//		em.getTransaction().commit();
//		
//		System.out.println(emp2.toString());
//		System.out.println("End 1");
//
//		
//		System.out.println("End 2");
//
//	}
//
//}