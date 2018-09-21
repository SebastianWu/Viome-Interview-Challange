package com.viome.interview.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;
import java.util.Date;   

@Entity
@Table(name = "city")
public
class City {
	@Id
	@Column(name = "city_id")
	int city_id;
	@Column(name = "city")
	String city;
	@Column(name = "country_id")
	int country_id;
	@Column(name = "last_update")
	Timestamp last_update;
	public City(int id, String c, int cid, Date lu){
		this.city_id = id;
		this.city = c;
		this.country_id = cid;
		this.last_update = new Timestamp(lu.getTime()); 
	}
}
