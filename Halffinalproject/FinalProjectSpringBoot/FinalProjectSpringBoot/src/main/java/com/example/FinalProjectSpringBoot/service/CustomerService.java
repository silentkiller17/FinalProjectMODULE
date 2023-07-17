package com.example.FinalProjectSpringBoot.service;

//The all services provide to Spring Boot controller class
//Calling all methods from EmployeeServiceImple.java (class) file
//EmployeeService.java
import com.example.FinalProjectSpringBoot.entity.Customer;

import java.util.List;

public interface CustomerService {
	Customer saveCustomer(Customer customer);
  List<Customer> fetchAllCustomers();
  Customer getCustomerById(Long id);
  Customer updateCustomerById(Long id, Customer customer);
  String deleteDepartmentById(Long id);
//List<com.example.FinalProjectSpringBoot.dto.CustomerDTO> getAllCustomersWithAddress();
Customer updateCustomerById1(Long id, Customer customer);

}


//package com.business.customermanagement.services;
//
//import java.util.List;
//import java.util.Optional;
//import java.util.UUID;
//
//import com.business.customermanagement.dtos.CustomerDto;
//
///**
// * The Interface CustomerService.
// */
//public interface CustomerService {
//	
//	/**
//	 * Adds customer.
//	 *
//	 * @param customerDto - object representing customer
//	 * @return the added customer with id
//	 */
//	CustomerDto addCustomer(CustomerDto customerDto);
//
//	/**
//	 * Updates customer.
//	 *
//	 * @param id - id of the customer
//	 * @param customerDto - object representing customer
//	 * @return the updated customer
//	 */
//	CustomerDto updateCustomer(UUID id, CustomerDto customerDto);
//
//	/**
//	 * Gets all customers.
//	 *
//	 * @return the all customers
//	 */
//	List<CustomerDto> getAllCustomers();
//
//	/**
//	 * Gets customer by id.
//	 *
//	 * @param id - id of the customer
//	 * @return the customer
//	 */
//	CustomerDto getCustomerById(UUID id);
//
//	/**
//	 * Gets the list of customers
//	 *
//	 * @param firstName - first name of the customer
//	 * @param lastName - last name of the customer
//	 * @return the list
//	 */
//	List<CustomerDto> getByCustomerName(Optional<String> firstName, Optional<String> lastName);
//
//}