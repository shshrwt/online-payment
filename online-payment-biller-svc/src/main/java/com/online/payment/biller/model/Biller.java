package com.online.payment.biller.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Biller {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Long bllerSequenceId;
	private String billerCode;
	private String accountNumber;
	private boolean autoPay;
	private Double autoPayLimit;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getBllerSequenceId() {
		return bllerSequenceId;
	}
	public void setBllerSequenceId(Long bllerSequenceId) {
		this.bllerSequenceId = bllerSequenceId;
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
	public boolean isAutoPay() {
		return autoPay;
	}
	public void setAutoPay(boolean autoPay) {
		this.autoPay = autoPay;
	}
	public Double getAutoPayLimit() {
		return autoPayLimit;
	}
	public void setAutoPayLimit(Double autoPayLimit) {
		this.autoPayLimit = autoPayLimit;
	} 

}
