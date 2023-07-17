package com.example.FinalProjectSpringBoot.entity;

//Hibernate Persistence class
//Employee.java file
//creating Address persistence class(table)
import jakarta.persistence.*;

@Entity
public class Address{

@Id
//@GeneratedValue(strategy = GenerationType.AUTO)
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer addressId;
private String area;
private String city;
private String state;
private String country;
private String pincode;

@ManyToOne
@JoinColumn(name = "customer_Id")
private Customer customer;

public Address(Integer addressId, String area, String city, String state, String country, String pincode) {
	super();
	this.addressId = addressId;
	this.area = area;
	this.city = city;
	this.state = state;
	this.country = country;
	this.pincode = pincode;
}


public Address() {
	
}


public Integer getAddressId() {
	return addressId;
}
public void setAddressId(Integer addressId) {
	this.addressId = addressId;
}
public String getArea() {
	return area;
}
public void setArea(String area) {
	this.area = area;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public String getPincode() {
	return pincode;
}
public void setPincode(String pincode) {
	this.pincode = pincode;
}


// Relationship with Customer entity
public Customer getCustomer() {
  return customer;
}

public void setCustomer(Customer customer) {
  this.customer = customer;
}

}
