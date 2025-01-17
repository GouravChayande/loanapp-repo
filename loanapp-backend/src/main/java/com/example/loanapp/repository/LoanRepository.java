package com.example.loanapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.loanapp.model.Loan;

@Repository
public interface LoanRepository extends JpaRepository<Loan, Integer> {
	
}