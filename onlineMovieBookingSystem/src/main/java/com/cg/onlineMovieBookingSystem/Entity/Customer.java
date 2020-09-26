package com.cg.onlineMovieBookingSystem.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name="Customer")
public class Customer {



	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid")
	@NotEmpty
	private String userId;
	@NotEmpty
	private String userType;

	@NotEmpty(message="user name can not be null")
	@Column(length=20)
	private String userName;

	@NotEmpty
	@Column(length=20)
	private String userPassword;

	@NotEmpty
	@Column(length=10)
	private String contact;

	@NotEmpty
	@Email(message = "email should be a valid email")
	private String email;



	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}



	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}



	public Customer() {

	}

	public Customer(String userId, String userType, String userName, String userPassword, String contact, String email) {
		super();
		this.userId = userId;
		this.userType= userType;
		this.userName = userName;
		this.userPassword = userPassword;
		this.contact = contact;
		this.email= email;

	}



	@Override
	public String toString() {
		return "Customer [userId=" + userId + ", userType="+ userType +",  userName=" + userName + ", userPassword=" + userPassword + ", contact=" + contact + ", email=" + email +"]";
	}

}
