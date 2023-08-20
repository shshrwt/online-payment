package com.online.payment.biller.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.online.payment.biller.enums.Status;

@Entity
public class BillerDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;	
	private Long billSequenceId; 
	private String billerCode; 
	private String accountNumber; 
	private Double amount;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate dueDate; 
    @Column(columnDefinition = "ENUM('PENDING', 'COMPLETE')")
    @Enumerated(EnumType.STRING)
	private Status status;//P-pending, C- Completed
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getBillSequenceId() {
		return billSequenceId;
	}
	public void setBillSequenceId(Long billSequenceId) {
		this.billSequenceId = billSequenceId;
	}
	public String getBillerCode() {
		return billerCode;
	}
	public void setBillerCode(String billerCode) {
		this.billerCode = billerCode;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public LocalDate getDueDate() {
		return dueDate;
	}
	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}	

}
