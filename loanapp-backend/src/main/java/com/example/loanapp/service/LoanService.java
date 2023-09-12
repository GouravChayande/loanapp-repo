package com.example.loanapp.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.loanapp.model.Loan;
import com.example.loanapp.repository.LoanRepository;

@Service
public class LoanService {
	
	@Autowired
	LoanRepository loanRepo;
	
	
	public String saveLoan(Loan l) {
		String result="";
		
		Loan obj = null;
		Optional<Loan>optional = loanRepo.findById(l.getLoanId());
		
		if(optional.isPresent()) {
			result="Loan already exists.";
		}
		else {
			obj = loanRepo.save(l);
			if(obj!=null)
				result = "Loan saved successfuly.";
			else
				result = "Registration failed!";
		}
		
		return result;
	}
}
