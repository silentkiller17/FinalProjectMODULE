package com.example.FinalProjectSpringBoot.entity;
//Hibernate Persistence class
//Cart.java file
//creating Cart persistence class(table)

import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;

//import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.*;
//import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Cart{

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Integer itemId;
//@JsonFormat(pattern = "dd-MM-yyyy")
//@DateTimeFormat
@CreationTimestamp
private Date orderDate;
private Double totalCost;
private Integer totalItem;

@OneToOne
@JoinColumn(name = "customer_id")
private Customer customer;

public Cart(Integer itemId, Date orderDate, Double totalCost, Integer totalItem) {
	super();
	this.itemId = itemId;
	this.orderDate = orderDate;
	this.totalCost = totalCost;
	this.totalItem = totalItem;
}
public Cart() {
	
}
public Integer getItemId() {
	return itemId;
}
public void setItemId(Integer itemId) {
	this.itemId = itemId;
}
public Date getOrderDate() {
	return orderDate;
}
public void setOrderDate(Date orderDate) {
	this.orderDate = orderDate;
}
public Double getTotalCost() {
	return totalCost;
}
public void setTotalCost(Double totalCost) {
	this.totalCost = totalCost;
}
public Integer getTotalItem() {
	return totalItem;
}
public void setTotalItem(Integer totalItem) {
	this.totalItem = totalItem;
}
public Object getCartOrderDate() {
	// TODO Auto-generated method stub
	return null;
}
public void setCartTotalCost(Object cartOrderDate) {
	// TODO Auto-generated method stub
	
}
public Object getCartTotalCost() {
	// TODO Auto-generated method stub
	return null;
}
public Object getCartTotalItem() {
	// TODO Auto-generated method stub
	return null;
}
public void setCartTotalItem(Object cartTotalItem) {
	// TODO Auto-generated method stub
	
}
}
