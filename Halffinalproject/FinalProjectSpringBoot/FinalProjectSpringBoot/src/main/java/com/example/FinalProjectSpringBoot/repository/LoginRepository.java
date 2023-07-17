package com.example.FinalProjectSpringBoot.repository;

//import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.FinalProjectSpringBoot.entity.Login;

@Repository
public interface LoginRepository extends JpaRepository<com.example.FinalProjectSpringBoot.entity.Login,String> {

//	Optional<Login> findById(Long id);
	
	

}
