package com.example.FinalProjectSpringBoot.service;

//The all services provide to Spring Boot controller class
//Calling all methods from EmployeeServiceImple.java (class) file
//EmployeeService.java
import com.example.FinalProjectSpringBoot.entity.Cart;

import java.util.List;

public interface CartService {
	Cart saveCart(Cart cart);
List<Cart> fetchAllCarts();
Cart getCartById(Long id);
Cart updateCartById(Long id, Cart cart);
String deleteItemById(Long id);
}