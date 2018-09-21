package com.viome.interview.business;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

// when given a customer’s first name as a command line argument
// outputs either “true” or “false” depending
// on whether the customer is in the database.
public class CheckCustomer {
	
	// you need to change the command line in put at Run configurations, the default first name is a invalid one.
	public static void main(String[] args) {
		if(args.length != 1) {
			System.out.println("Wrong command line input number, should be exactly one!");
			System.exit(-1);
		}
		String target = args[0];
		System.out.println("Find target first name: "+target);
		SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Query q = session.createQuery("SELECT first_name FROM com.viome.interview.dao.Customer WHERE first_name = '"+target+"'");
		System.out.println(q.uniqueResult()!=null);
	}

}
