package com.viome.interview.dao;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "country")
class Country {
	@Id
	@Column(name = "country_id")
	int country_id;
	@Column(name = "country")
	String country;
	@Column(name = "last_update")
	Timestamp last_update;
}
