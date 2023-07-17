package com.example.FinalProjectSpringBoot.repository;

//Hibernate jpa file, here connecting Entity class to service implementation class
//CustomerRepository.java
import com.example.FinalProjectSpringBoot.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}


