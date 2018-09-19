package com.viome.interview.dao;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "actor")
public class Actor implements Serializable{
	@Id
	@Column(name = "actor_id")
	int actor_id;
	@Column(name = "first_name")
	String first_name;
	@Column(name = "last_name")
	String last_name;
	@Column(name = "last_update")
	String last_update;
}
