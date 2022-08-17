package one_to_many_uni;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveMobile {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Sim sim = new Sim();
		sim.setImrc(999);
		sim.setProvider("Jio");
		
		Sim sim1 = new Sim();
		sim1.setImrc(111);
		sim1.setProvider("Airtel");
		
		List<Sim> ls = new ArrayList<Sim>();
		ls.add(sim);
		ls.add(sim1);
		
		Mobile mob = new Mobile();
		mob.setName("Nokia");
		mob.setCost(5000);
		
		mob.setSim(ls);
		
		entityTransaction.begin();
		entityManager.persist(mob);
		entityManager.persist(sim);
		entityManager.persist(sim1);
		entityTransaction.commit();
		
		System.out.println("Data stored");
		

	}

}
