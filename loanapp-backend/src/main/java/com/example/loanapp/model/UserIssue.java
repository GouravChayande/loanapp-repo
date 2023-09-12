package com.example.loanapp.model;

import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Table(name="user_issue_details")
public class UserIssue {
	
	@Id
	@GeneratedValue
	@Column(name="issue_id")
	private int issueId;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;
	
	@ManyToOne
	@JoinColumn(name="item_id")
	private Item item;
	
	@JsonFormat(pattern="yyyy-MM-dd")
	@Column(name="issue_date", nullable=false)
	private LocalDate issueDate;

	public int getIssueId() {
		return issueId;
	}

	public void setIssueId(int issueId) {
		this.issueId = issueId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public LocalDate getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(LocalDate issueDate) {
		this.issueDate = issueDate;
	}

}
