package com.example.loanapp.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.loanapp.model.User;
import com.example.loanapp.model.UserLogin;

import com.example.loanapp.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepo;
	
	
	
	public String saveUser(User u) {
		String result="";
		
		User obj = null;
		Optional<User>optional = userRepo.findById(u.getId());
		
		if(optional.isPresent()) {
			result="User already exists.";
		}
		else {
			obj = userRepo.save(u);
			if(obj!=null)
				result = "User saved successfuly.";
			else
				result = "Registration failed!";
		}
		
		return result;
	}
	
	public String loginUser(UserLogin u) {
		String result="";
		User user = null;

		Optional<User>optional = userRepo.findById(u.getId());
		
		if(optional.isEmpty()) {
			result = "Invalid Employee";
		}
		else {
			user = optional.get();
			if(user.getPassword().equals(u.getPassword())) {
				result = "Login Success";
			}
			else {
				result = "Login Failed";
			}
		}
		
		return result;
	}
}
