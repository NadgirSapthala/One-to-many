package one_to_many_uni;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetOrganizationById {
	
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entitymanager = factory.createEntityManager();
		Organization org=entitymanager.find(Organization.class, 1);
		System.out.println(org.getId());
		System.out.println(org.getName());
		System.out.println(org.getAddress());
		System.out.println(org.getBus());
	}

}
