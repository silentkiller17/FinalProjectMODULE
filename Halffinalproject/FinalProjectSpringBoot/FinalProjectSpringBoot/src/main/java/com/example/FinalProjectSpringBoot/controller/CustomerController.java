package com.example.FinalProjectSpringBoot.controller;

//Controller file
//we only create the file(EmployeeController.java)
import com.example.FinalProjectSpringBoot.entity.Customer;
import com.example.FinalProjectSpringBoot.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//import com.example.FinalProjectSpringBoot.dto.CustomerDTO;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//@RequestMapping("/api/customers")
//@CrossOrigin(origins="http://localhost:4200")
public class CustomerController {
	
	
  @Autowired
  private CustomerService customerService;
  @PostMapping("/customer")
  public Customer saveCustomer(@RequestBody Customer customer) {
      return customerService.saveCustomer(customer);
  }
  @GetMapping("/customer")
  public List<Customer> getAllCustomers() {
      return customerService.fetchAllCustomers();
  }
  @GetMapping("/customer/{id}")
  public Customer getCustomerById(@PathVariable("id") Long id) {
      return customerService.getCustomerById(id);
  }

  @PutMapping("/customer/{id}")
  public Customer updateCustomer(@PathVariable("id") Long id, @RequestBody Customer customer) {
      return customerService.updateCustomerById(id, customer);
  }
  @DeleteMapping("/customer/{id}")
  public String deleteCustomer(@PathVariable("id") Long id) {
      return customerService.deleteDepartmentById(id);
  }
}



