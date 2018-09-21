package com.viome.interview.dao;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "address")
public
class Address {
	@Id
	@Column(name = "address_id")
	int address_id;
	public int getAddressID() {return this.address_id;}
	public void setAddressID(int id) {this.address_id = id;}
	@Column(name = "address")
	String address;
	public String getAddress() {return this.address;}
	public void setAddress(String l1) {this.address = l1;}
	@Column(name = "address2")
	String address2;
	public String getAddress2() {return this.address2;}
	public void setAddress2(String l2) {this.address2 = l2;}
	@Column(name = "district")
	String district;
	public String getDistrict() {return this.district;}
	public void setDistrict(String d) {this.district = d;}
	@Column(name = "city_id")
	int city_id;
	public int getCityID() {return this.city_id;}
	public void setCityID(int cid) {this.city_id = cid;}
	@Column(name = "postal_code")
	String postal_code;
	public String getPostalCode() {return this.postal_code;}
	public void setPostalCode(String pcode) {this.postal_code = pcode;}
	@Column(name = "phone")
	String phone;
	public String getPhone() {return this.phone;}
	public void setPhone(String p) {this.phone = p;}
	@Column(name = "last_update")
	Timestamp last_update;
	public Timestamp getLastUpdate() {return this.last_update;}
	public void setTimestamp(Timestamp t) {this.last_update = t;}
}
