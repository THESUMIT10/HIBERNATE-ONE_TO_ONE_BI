package com.jsp.person.pan;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSavePersonPan {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("sumit");
	EntityManager entityManager= entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	Person person= new Person();
	person.setName("Siddhesh");
	person.setEmail("siddheshshewale420@gmail.com");
	
	
	Pan pan= new Pan();
	pan.setPan_no(987654321l);
	pan.setPerson(person);
	
	person.setPan(pan);
	
	entityTransaction.begin();
	entityManager.persist(pan);
	entityManager.persist(person);
	entityTransaction.commit();
	System.out.println("All Good");
} 
}
