package com.example.FinalProjectSpringBoot.service;

//The all services provide to Spring Boot controller class
//Calling all methods from EmployeeServiceImple.java (class) file
//EmployeeService.java
import com.example.FinalProjectSpringBoot.entity.Order;
import java.util.List;

public interface OrderService{
	Order saveOrder(Order order);
List<Order> fetchAllOrders();
Order getOrderById(Long id);
Order updateOrderById(Long id, Order order);
String deleteOrderById(Long id);
}