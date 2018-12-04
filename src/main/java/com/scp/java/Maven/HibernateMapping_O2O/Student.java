package com.scp.java.Maven.HibernateMapping_O2O;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Student_Info")

public class Student {
	@Id
	private int id;
	private String studName;
	@OneToOne(cascade=CascadeType.ALL)
	private Address address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", studName=" + studName + ", address=" + address + "]";
	}
	public Student(int id, String studName, Address address) {
		super();
		this.id = id;
		this.studName = studName;
		this.address = address;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
