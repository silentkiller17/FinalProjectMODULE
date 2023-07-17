package com.example.FinalProjectSpringBoot.service;

//All business logic(services) we are going to achieve with predefined methods(save(),findAll()....
//EmployeeServiceImple.java
import com.example.FinalProjectSpringBoot.entity.Customer;
import com.example.FinalProjectSpringBoot.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.example.FinalProjectSpringBoot.dto.CustomerDTO;

//import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService{

  @Autowired
  private CustomerRepository customerRepository;

//  @Override
//  public Customer saveCustomer(Customer customer) {//saving records
//      return customerRepository.save(customer);
//  }
//  
  @Autowired
public CustomerServiceImpl(CustomerRepository customerRepository) {
    this.customerRepository = customerRepository;
}
//
  @Override
  public List<Customer> fetchAllCustomers() {
      List<Customer> allCustomers = customerRepository.findAll();//select the records from db table
      return allCustomers;
  }

  @Override
  public Customer getCustomerById(Long id) {
      Optional<Customer> customer = customerRepository.findById(id);//get the values based on customer requirement
      if (customer.isPresent()) {
          return customer.get();
      }
      return null;
  }
  @Override
  public Customer updateCustomerById(Long id, Customer customer) {//based on selected id we are going to edit(Update) the record here
      Optional<Customer> customer1 = customerRepository.findById(id);

      if (customer1.isPresent()) {
    	  Customer originalCustomer = customer1.get();

          if (Objects.nonNull(customer.getCustomerName()) && !"".equalsIgnoreCase(customer.getCustomerName())) {
              originalCustomer.setCustomerName(customer.getCustomerName());
          }
          if (Objects.nonNull(customer.getCustomerAddress()) && customer.getCustomerAddress() != "NULL") {
              originalCustomer.setCustomerAddress(customer.getCustomerAddress());
          }
          if (Objects.nonNull(customer.getCustomerMobile()) && customer.getCustomerMobile() != "NULL") {
              originalCustomer.setCustomerMobile(customer.getCustomerMobile());
          }
          return customerRepository.save(originalCustomer);
      }
      return null;
  }

//  @Override
//public List<CustomerDTO> getAllCustomersWithAddress() {
//    List<CustomerDTO> customerAddressDTOs = new ArrayList<>();
//
//    List<Customer> customers = customerRepository.findAll();
//
//    for (Customer customer : customers) {
//        CustomerDTO customerAddressDTO = new CustomerDTO();
//        customerAddressDTO.setCustomerId(customer.getCustomerId());
//        customerAddressDTO.setCustomerName(customer.getCustomerName());
//        customerAddressDTO.setCustomerAddress(customer.getCustomerAddress());
//        customerAddressDTO.setCustomermob(customer.getCustomermob());
//        
//        // Set other fields from the Customer entity
//        String address = customer.getCustomerAddress();
//        
//        customerAddressDTO.setAddressId(address.getAddressId());
//        customerAddressDTO.setAddressArea(address.getAddressArea());
//        customerAddressDTO.setAddressCity(address.getAddressCity());
//        customerAddressDTO.setAddressState(address.getAddressState());
//        customerAddressDTO.setAddressCountry(address.getAddressCountry());
//        customerAddressDTO.setAddressPincode(address.getAddressPincode());
//        // Set other fields from the Address entity
//        
//        customerAddressDTOs.add(customerAddressDTO);
//        
//    }
//
//    return customerAddressDTOs;
//}
 
  
  @Override
  public String deleteDepartmentById(Long id) {//deleting the records from the mysql db table
      if (customerRepository.findById(id).isPresent()) {
    	  customerRepository.deleteById(id);
          return "Customer deleted successfully";
      }
      return "No such customer in the database";//table not present unable to delete the record
  }
//@Override
//public Customer saveCustomer(Customer customer) {
//	// TODO Auto-generated method stub
//	return null;
//}
//@Override
//public Customer updateCustomerById1(Long id, Customer customer) {
//	// TODO Auto-generated method stub
//	return null;
//}
@Override
public Customer saveCustomer(Customer customer) {
	// TODO Auto-generated method stub
	return null;
}
//@Override
//public Customer updateCustomerById1(Long id, Customer customer) {
//	// TODO Auto-generated method stub
//	return null;
//}
//@Override
//public Customer updateCustomerById(Long id, Customer customer) {
//	// TODO Auto-generated method stub
//	return null;
//}
@Override
public Customer updateCustomerById1(Long id, Customer customer) {
	// TODO Auto-generated method stub
	return null;
}
}

//
//import com.example.FinalProjectSpringBoot.dto.CustomerAddressDTO;
//import com.example.FinalProjectSpringBoot.repository.CustomerRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Service
//public class CustomerServiceImpl implements CustomerService {
//
//    private final CustomerRepository customerRepository;
//
//    @Autowired
//    public CustomerServiceImpl(CustomerRepository customerRepository) {
//        this.customerRepository = customerRepository;
//    }
//
//    @Override
//    public List<CustomerAddressDTO> getAllCustomersWithAddress() {
//        List<CustomerAddressDTO> customerAddressDTOs = new ArrayList<>();
//
//        List<Customer> customers = customerRepository.findAll();
//
//        for (Customer customer : customers) {
//            CustomerAddressDTO customerAddressDTO = new CustomerAddressDTO();
//            customerAddressDTO.setCustomerId(customer.getId());
//            customerAddressDTO.setCustomerName(customer.getName());
//            // Set other fields from the Customer entity
//
//            Address address = customer.getAddress();
//            customerAddressDTO.setAddressId(address.getId());
//            customerAddressDTO.setArea(address.getArea());
//            // Set other fields from the Address entity
//
//            customerAddressDTOs.add(customerAddressDTO);
//        }
//
//        return customerAddressDTOs;
//    }
//
//    // Implement other methods for CRUD operations
//    // ...
//}


