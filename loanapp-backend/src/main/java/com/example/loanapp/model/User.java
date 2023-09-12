package com.example.loanapp.model;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="user_info")
public class User {
	@Id
	@GeneratedValue
	@Column(name="user_id")
	private int id;
	
	@Column(length=30, nullable=false, unique=true)
	private String username;
	
	@Column(length=10, nullable=false)
	private String password;
	
	@Column(name="full_name",length=40, nullable=false)
	private String name;
	
	@JsonFormat(pattern="yyyy-MM-dd")
	@Column(nullable=false)
	private LocalDate dob;
	
	@Column(length=30, nullable=false)
	private String designation;
	
	@Column(length=20, nullable=false)
	private String department;
	
	@OneToMany(mappedBy="user",fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	private List<LoanCard> userCard;
	
	@OneToMany(mappedBy="user",fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	private Set<UserIssue> userIssue;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public List<LoanCard> getUserCard() {
		return userCard;
	}
	public void setUserCard(List<LoanCard> userCard) {
		this.userCard = userCard;
	}
	public Set<UserIssue> getUserIssue() {
		return userIssue;
	}
	public void setUserIssue(Set<UserIssue> userIssue) {
		this.userIssue = userIssue;
	}
	
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getUsername() {
		return username;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
