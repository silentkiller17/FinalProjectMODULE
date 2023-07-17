package com.example.FinalProjectSpringBoot.repository;

//import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.FinalProjectSpringBoot.entity.User;

@Repository
public interface UserRepository extends JpaRepository<com.example.FinalProjectSpringBoot.entity.User,String>{

//	Optional<User> findById(Long id);

}