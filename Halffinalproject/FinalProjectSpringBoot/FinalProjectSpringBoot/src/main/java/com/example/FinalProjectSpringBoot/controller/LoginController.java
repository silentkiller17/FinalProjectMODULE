package com.example.FinalProjectSpringBoot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.FinalProjectSpringBoot.entity.Login;
import com.example.FinalProjectSpringBoot.entity.User;
import com.example.FinalProjectSpringBoot.repository.LoginRepository;


@RestController
//@CrossOrigin(origins="http://localhost:4200")

public class LoginController {
	@Autowired
	private LoginRepository repo1;
	@PostMapping("/login")
	public ResponseEntity<Login>loginUser(@RequestBody Login data) {
		
		System.out.println("Login Controller Called");
		return ResponseEntity.ok(repo1.save(data));
	}
	
	
	@GetMapping("/login")
	public ResponseEntity<List<Login>> getAllLogins() {
	    List<Login> logins = repo1.findAll();
	    if (logins.isEmpty()) {
	        return ResponseEntity.noContent().build();
	    }
	    return ResponseEntity.ok(logins);
	}
		
//		 @GetMapping("/login/{id}")
//		    public ResponseEntity<Login> getUserById(@PathVariable Long id) {
//		        // Retrieve a user by ID using the repo1 or perform any desired logic
//		        Login user = repo1.findById(id).orElse(null);
//		        if (user != null) {
//		            return ResponseEntity.ok(user);
//		        } else {
//		            return ResponseEntity.notFound().build();
//		        }
//		
//	}
}
