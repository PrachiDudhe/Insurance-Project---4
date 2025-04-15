package com.insurance.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="branch")
public class Branch {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String branchName;
	private Integer branch_Id;
	private String city;
	private Integer postalCode;
	private String country;
	
	public Branch(int id, String branchName, Integer branch_Id, String city, Integer postalCode, String country) {
		this.id = id;
		this.branchName = branchName;
		this.branch_Id = branch_Id;
		this.city = city;
		this.postalCode = postalCode;
		this.country = country;
	}
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
	public Integer getBranch_Id() {
		return branch_Id;
	}
	public void setBranch_Id(Integer branch_Id) {
		this.branch_Id = branch_Id;
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
	@Override
	public String toString() {
		return "Branch [id=" + id + ", branchName=" + branchName + ", branch_Id=" + branch_Id + ", city=" + city
				+ ", postalCode=" + postalCode + ", country=" + country + "]";
	}

}
