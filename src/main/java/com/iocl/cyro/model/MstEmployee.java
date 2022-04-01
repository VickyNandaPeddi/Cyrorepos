package com.iocl.cyro.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MST_EMPLOYEE")
public class MstEmployee {
	@Id
	@Column(name = "EMP_CODE")
	private String empCode;

	public String getEmpCode() {
		return empCode;
	}

	public void setEmpCode(String empCode) {
		this.empCode = empCode;
	}

	public MstEmployee(String empCode) {
		super();
		this.empCode = empCode;
	}

	public MstEmployee() {
		super();
	}
	
	@Column(name = "PASSWORD")
	private String password;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
