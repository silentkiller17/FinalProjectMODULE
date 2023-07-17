package com.example.FinalProjectSpringBoot.repository;

//Hibernate jpa file, here connecting Entity class to service implementation class
//CartRepository.java
import com.example.FinalProjectSpringBoot.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long> {
}
