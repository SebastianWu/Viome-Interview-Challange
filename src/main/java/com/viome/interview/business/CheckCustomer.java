package com.viome.interview.business;

import com.viome.interview.dao.Actor;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

// when given a customer’s first name as a command line argument
// outputs either “true” or “false” depending
// on whether the customer is in the database.
public class CheckCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();

		Query q = session.createQuery("SELECT actor_id, first_name, last_name, last_update FROM com.viome.interview.dao.Actor");
		List<Object[]> actor = q.list();
		System.out.println(actor.size());
		for(Object[] a : actor) {
			System.out.println(a[0].toString()+" "+a[1].toString()+" "+a[2].toString()+" "+a[3].toString());
		}
		System.out.println("~");
	}

}
