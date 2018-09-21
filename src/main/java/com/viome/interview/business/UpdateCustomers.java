package com.viome.interview.business;

import com.viome.interview.dao.City;
import com.viome.interview.dao.Address;
import java.util.Date;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

// changes customers located in Vancouver to New York. 
class UpdateCustomers {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		// get the city id of Vancouver
		int Vancouver_city_id;
		Query q1 = session.createQuery("SELECT city_id FROM com.viome.interview.dao.City WHERE city = 'Vancouver'");
		Vancouver_city_id = (Integer) q1.uniqueResult();
		//System.out.println("Vancouver city id: "+Vancouver_city_id);
		// get the city id of New York
		int Newyork_city_id;
		Query q2 = session.createQuery("SELECT city_id FROM com.viome.interview.dao.City WHERE city = 'New York'");
		if(q2.uniqueResult()!=null) {
			Newyork_city_id = (Integer) q2.uniqueResult();
		}else {
			// create a new id for New York and update table
			Query q3 = session.createQuery("SELECT MAX(city_id) FROM com.viome.interview.dao.City");
			Newyork_city_id = (Integer) q3.uniqueResult() + 1;
			// update city table
				// find the country id for United States
			Query q4 = session.createQuery("SELECT country_id FROM com.viome.interview.dao.Country WHERE country = 'United States'");
			int UnitedStates_id = (Integer) q4.uniqueResult();
				//System.out.println(UnitedStates_id);
			session.beginTransaction();
			City nyc = new City(Newyork_city_id,"New York",UnitedStates_id, new Date());
			session.save(nyc);
			session.getTransaction().commit();
		}
		//System.out.println("New York city id: "+Newyork_city_id);
		// update city id in address table
			// get the address id with Vancouver city id
		Query q5 = session.createQuery("SELECT address_id FROM com.viome.interview.dao.Address WHERE city_id = "+Vancouver_city_id);
			// Switch those to New York city id
		for(Object aid : q5.list()) {
			System.out.println((Integer) aid);
			session.beginTransaction();
			Address addr = (Address) session.get(Address.class, (Integer) aid);
			addr.setCityID(Newyork_city_id);
			session.update(addr);
			session.getTransaction().commit();
		}
		System.out.println("Update finished!");
	}

}
