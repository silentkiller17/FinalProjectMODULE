package com.example.FinalProjectSpringBoot.repository;
//Hibernate jpa file, here connecting Entity class to service implementation class
//MenuRepository.java
import com.example.FinalProjectSpringBoot.entity.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuRepository extends JpaRepository<Menu, Long> {
}
