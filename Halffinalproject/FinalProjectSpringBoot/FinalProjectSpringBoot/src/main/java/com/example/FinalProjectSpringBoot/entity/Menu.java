package com.example.FinalProjectSpringBoot.entity;

//Hibernate Persistence class
//Employee.java file
//creating employee persistence class(table)
import jakarta.persistence.*;

@Entity
public class Menu{
@Id
@GeneratedValue(strategy = GenerationType.AUTO)

private int foodId;
private String foodName;
private int foodPrice;
private String foodCategory;

@ManyToOne
@JoinColumn(name = "customer_id")
private Customer customer;

public Menu(int foodId, String foodName, int foodPrice, String foodCategory) {
	super();
	this.foodId = foodId;
	this.foodName = foodName;
	this.foodPrice = foodPrice;
	this.foodCategory = foodCategory;
}


public Menu() {
	
}


public int getFoodId() {
	return foodId;
}


public void setFoodId(int foodId) {
	this.foodId = foodId;
}


public String getFoodName() {
	return foodName;
}


public void setFoodName(String foodName) {
	this.foodName = foodName;
}


public int getFoodPrice() {
	return foodPrice;
}


public void setFoodPrice(int foodPrice) {
	this.foodPrice = foodPrice;
}


public String getFoodCategory() {
	return foodCategory;
}


public void setFoodCategory(String foodCategory) {
	this.foodCategory = foodCategory;
}


public String getMenuName() {
	// TODO Auto-generated method stub
	return null;
}
public void setCustomerName(Object menuName) {
	// TODO Auto-generated method stub
	
}
public static Object getMenuPrice() {
	// TODO Auto-generated method stub
	return null;
}
public void setMenuPrice(Object menuPrice) {
	// TODO Auto-generated method stub
	
}
public String getMenuCategory() {
	// TODO Auto-generated method stub
	return null;
}

}
