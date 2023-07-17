package com.example.FinalProjectSpringBoot.repository;

//Hibernate jpa file, here connecting Entity class to service implementation class
//CartRepository.java
import com.example.FinalProjectSpringBoot.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
}
