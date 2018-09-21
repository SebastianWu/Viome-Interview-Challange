package com.viome.interview.dao;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
class Customer {
	@Id
	@Column(name = "customer_id")
	int customer_id;
	@Column(name = "store_id")
	int store_id;
	@Column(name = "first_name")
	String first_name;
	@Column(name = "last_name")
	String last_name;
	@Column(name = "email")
	String email;
	@Column(name = "address_id")
	int address_id;
	@Column(name = "activebool")	// only contain "t"
	String activebool;
	@Column(name = "create_date")
	String create_date;
	@Column(name = "last_update")
	Timestamp last_update;
	@Column(name = "active")	// only contain 1 and 2
	Boolean active;
}
