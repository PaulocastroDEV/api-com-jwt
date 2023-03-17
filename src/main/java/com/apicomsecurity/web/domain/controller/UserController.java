package com.apicomsecurity.web.domain.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apicomsecurity.web.domain.model.User;
import com.apicomsecurity.web.domain.repository.UserRepository;

@RestController
@RequestMapping("/register")
public class UserController {
	@Autowired
	private UserRepository userRepository;
	@PostMapping
	public ResponseEntity<User> cadastrar(@RequestBody User user){
		return ResponseEntity.status(HttpStatus.CREATED).body(userRepository.save(user));
		
	}

}
