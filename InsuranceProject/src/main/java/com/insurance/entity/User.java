package com.insurance.entity;

import java.util.List;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Insurance_UserDetail")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String firstName;
	private String lastName;
	private String emailId;
	private Double mobileNumber;
	private Integer dateOfBirth;
	private Double aadharNumber;
	
	@OneToMany(mappedBy="userId")
	private Set<Nominee> nominees;
	
	@OneToMany(mappedBy="userId")
	private List<Policy> policies;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Double getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(Double mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public Integer getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Integer dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Double getAadharNumber() {
		return aadharNumber;
	}

	public void setAadharNumber(Double aadharNumber) {
		this.aadharNumber = aadharNumber;
	}

	public Set<Nominee> getNominees() {
		return nominees;
	}

	public void setNominees(Set<Nominee> nominees) {
		this.nominees = nominees;
	}

	public List<Policy> getPolicies() {
		return policies;
	}

	public void setPolicies(List<Policy> policies) {
		this.policies = policies;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", emailId=" + emailId
				+ ", mobileNumber=" + mobileNumber + ", dateOfBirth=" + dateOfBirth + ", aadharNumber=" + aadharNumber
				+ ", nominees=" + nominees + ", policies=" + policies + "]";
	}

}
