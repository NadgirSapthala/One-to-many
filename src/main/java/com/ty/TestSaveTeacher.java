package com.ty;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveTeacher {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Subject s1 = new Subject();
		s1.setName("CS");
		s1.setDay(10);

		Subject s2 = new Subject();
		s2.setName("ADA");
		s2.setDay(20);

		List<Subject> ls = new ArrayList<Subject>(); 
		ls.add(s1);
		ls.add(s2);

		Teacher t1 = new Teacher();
		t1.setName("Divya");
		t1.setAge(19);
		t1.setSubject(ls);

		Teacher t2 = new Teacher();
		t2.setName("Priya");
		t2.setAge(24);
		t2.setSubject(ls);

		Teacher t3 = new Teacher();
		t3.setName("Raju");
		t3.setAge(29);
		t3.setSubject(ls);

		entityTransaction.begin();
		entityManager.persist(s1);
		entityManager.persist(s2);
		entityManager.persist(t1);
		entityManager.persist(t2);
		entityManager.persist(t3);
		entityTransaction.commit();

		System.out.println("Data stored");

	}

}
