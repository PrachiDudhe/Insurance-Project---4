package com.insurance.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Insurance_Branch")
public class Branch {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String branchName;
	private Integer branch_ID;
	private String city;
	private Integer postalCode;
	private String country;
	
	@OneToMany(mappedBy="branch") 
	private List<Policy> policies;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public Integer getBranch_ID() {
		return branch_ID;
	}
	public void setBranch_ID(Integer branch_ID) {
		this.branch_ID = branch_ID;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Integer getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(Integer postalCode) {
		this.postalCode = postalCode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	public List<Policy> getPolicies() {
		return policies;
	}
	public void setPolicies(List<Policy> policies) {
		this.policies = policies;
	}
	
	@Override
	public String toString() {
		return "Branch [id=" + id + ", branchName=" + branchName + ", branch_ID=" + branch_ID + ", city=" + city
				+ ", postalCode=" + postalCode + ", country=" + country + ", policies=" + policies + "]";
	}
	
}
