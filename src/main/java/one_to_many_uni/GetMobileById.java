package one_to_many_uni;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetMobileById {
	
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entitymanager = factory.createEntityManager();
		Mobile mobile =entitymanager.find(Mobile.class, 1);
		System.out.println(mobile.getCost());
		System.out.println(mobile.getId());
		System.out.println(mobile.getName());
		System.out.println(mobile.getSim());
		
	}

}
