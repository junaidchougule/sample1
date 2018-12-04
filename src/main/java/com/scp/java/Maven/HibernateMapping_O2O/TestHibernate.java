package com.scp.java.Maven.HibernateMapping_O2O;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class TestHibernate {

	public static void main(String[] args) {
     
	Address a1= new Address("Pune", 410043);
	Address a2= new Address("Mumbai", 410145);
	
	Student s1 = new Student(1, "Tripathi", a1);
	Student s2 = new Student(2, "Munnabhaiyya",a2);
	
	Configuration configuration = new Configuration();
	configuration.configure("hibernate.cfg.xml");
	SessionFactory sessionfactory= configuration.buildSessionFactory();
	Session session= sessionfactory.openSession();
	Transaction tr= session.beginTransaction();
	session.save(a1);
	session.save(a2);
	session.save(s1);
	session.save(s2);
	session.flush();
	tr.commit();
	System.out.println("Successful");
	}
}
