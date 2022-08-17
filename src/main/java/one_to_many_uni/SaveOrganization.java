package one_to_many_uni;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveOrganization {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Bus bus = new Bus();
		bus.setCapacity(50);
		bus.setType("Volvo");

		Bus bus1 = new Bus();
		bus1.setCapacity(60);
		bus1.setType("Rajahamsa");

		List<Bus> ls = new ArrayList();
		ls.add(bus);
		ls.add(bus1);

		Organization org = new Organization();
		org.setName("KSRTC");
		org.setAddress("Yelahanka");

		org.setBus(ls);

		entityTransaction.begin();
		entityManager.persist(org);
		entityManager.persist(bus);
		entityManager.persist(bus1);
		entityTransaction.commit();
		
		System.out.println("Data stored");

	}

}
