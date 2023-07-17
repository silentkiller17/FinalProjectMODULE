package com.example.FinalProjectSpringBoot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.FinalProjectSpringBoot.entity.User;
import com.example.FinalProjectSpringBoot.repository.UserRepository;

@RestController
//@CrossOrigin(origins="http://localhost:4200")
public class UserController {

	@Autowired
	private UserRepository repo;
	@PostMapping("/user")
	public ResponseEntity<User>registerUser(@RequestBody User user) {
		
		System.out.println("User Controller Called");
		return ResponseEntity.ok(repo.save(user));
	}
	
	
	@GetMapping("/user") // Add this GetMapping annotation with the desired endpoint
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> user = repo.findAll();
        if (user.isEmpty()) {
            return ResponseEntity.noContent().build();
	        }
		return null;
	    }	
}