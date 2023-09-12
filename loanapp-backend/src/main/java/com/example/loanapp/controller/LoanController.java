package com.example.loanapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.loanapp.model.Loan;
//import com.example.loanapp.repository.LoanRepository;
import com.example.loanapp.service.LoanService;

@RestController
@CrossOrigin("http://localhost:3000")
class LoanController {
	
	@Autowired
	LoanService loanService;
	
	
	@PostMapping("/loanType")
	public String loanType(@RequestBody Loan l) {
		
		String result = "";
		result = loanService.saveLoan(l);
		
		return result;
		
	}

	
}
