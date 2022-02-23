package com.iocl.cyro.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
	@Id
	private int customerid;
	private String customername;
	private String designation;
	private String address;
	private String town;
	private String district;
	private String state;
	private String pin;
	private Integer phone;
	private String emailid;
	private String panno;
	private String[] applicationuse;
	private String[] modelselection;
	private String[] inforequired;
	private String freetext;

	public int getCustomerid() {
		return customerid;
	}

	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public Integer getPhone() {
		return phone;
	}

	public void setPhone(Integer phone) {
		this.phone = phone;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getPanno() {
		return panno;
	}

	public void setPanno(String panno) {
		this.panno = panno;
	}

	public String[] getApplicationuse() {
		return applicationuse;
	}

	public void setApplicationuse(String[] applicationuse) {
		this.applicationuse = applicationuse;
	}

	public String[] getModelselection() {
		return modelselection;
	}

	public void setModelselection(String[] modelselection) {
		this.modelselection = modelselection;
	}

	public String[] getInforequired() {
		return inforequired;
	}

	public void setInforequired(String[] inforequired) {
		this.inforequired = inforequired;
	}

	public String getFreetext() {
		return freetext;
	}

	public void setFreetext(String freetext) {
		this.freetext = freetext;
	}
}
