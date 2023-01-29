package com.harman.demo.emp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vehicle {
	
	

private	long id;
	private String companyname;
	private String model;

  private String regno;
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
  private  int year;


public String getCompanyname() {
	return companyname;
}
public void setCompanyname(String companyname) {
	this.companyname = companyname;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getRegno() {
	return regno;
}
public void setRegno(String regno) {
	this.regno = regno;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}


}
