package com.fdmgroup.vvs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="USERS")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="USER_ID_GENERATOR")
	@SequenceGenerator(name="USER_ID_GENERATOR", sequenceName="USER_ID", allocationSize=1, initialValue=1)
	@Column(name = "USER_ID")
	private int userId;
	private String firstName;
	private String lastName;
	@Column(nullable = false, unique = true) // "^*@fdmgroup\.com$"
	private String email;
	@Column(nullable = false, unique = true)
	private String username;
	private String password;
	private Role role;
	private String candidatePosition;
	
	
	
	/**
	 * @return the candidatePosition
	 */
	public String getCandidatePosition() {
		return candidatePosition;
	}
	/**
	 * @param candidatePosition the candidatePosition to set
	 */
	public void setCandidatePosition(String candidatePosition) {
		this.candidatePosition = candidatePosition;
	}
	/**
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the role
	 */
	public Role getRole() {
		return role;
	}
	/**
	 * @param role the role to set
	 */
	public void setRole(Role role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", username=" + username + ", password=" + password + ", role=" + role + "]";
	}
	public User(int userId, String firstName, String lastName, String email, String username, String password,
			Role role, String candidatePosition) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.username = username;
		this.password = password;
		this.role = role;
		this.candidatePosition = candidatePosition;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
}
