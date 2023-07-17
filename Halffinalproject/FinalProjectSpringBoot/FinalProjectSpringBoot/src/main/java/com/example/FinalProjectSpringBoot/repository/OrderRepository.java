package com.example.FinalProjectSpringBoot.repository;

//Hibernate jpa file, here connecting Entity class to service implementation class
//OrderRepository.java
import com.example.FinalProjectSpringBoot.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
