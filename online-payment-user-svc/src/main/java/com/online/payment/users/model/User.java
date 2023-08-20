package com.online.payment.users.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name = "users")
public class User implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column
	private String username;

	@Column
	private String password;

	@Column(nullable = false, unique = true)
	@NotEmpty
	private String email;

	@Column
	private String phone;

	@Column
	@NotEmpty
	private String name;
	
	@Column
	private String accountSeqId;

	
	  @ManyToMany(cascade=CascadeType.MERGE)
	  
	  @JoinTable( name="user_role", joinColumns={@JoinColumn(name="USER_ID",
	  referencedColumnName="ID")}, inverseJoinColumns={@JoinColumn(name="ROLE_ID",
	  referencedColumnName="ID")}) private Set<Role> roles;
	 

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	  public Set<Role> getRoles() { return roles; }
	  
	  public void setRoles(Set<Role> roles) { this.roles = roles; }

	public String getAccountSeqId() {
		return accountSeqId;
	}

	public void setAccountSeqId(String accountSeqId) {
		this.accountSeqId = accountSeqId;
	}
	 
}
