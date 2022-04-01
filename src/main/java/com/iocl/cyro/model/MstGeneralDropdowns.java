package com.iocl.cyro.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
@Entity
@Table(name = "MST_GENERAL_DROPDOWNS")
public class MstGeneralDropdowns {
	@Id
	@Column(name = "TYPE_CODE")
	private String type_code;
	
	@Column(name = "TYPE_SLNO")
	private String typeSlno;
	
	@Column(name = "TYPE_NAME")
	private String type_name;
	
	@Column(name = "CREATED_ON")
	private Date created_on;

	
	public Date getCreated_on() {
		return created_on;
	}

	public void setCreated_on(Date created_on) {
		this.created_on = created_on;
	}

	public MstGeneralDropdowns() {
		super();
	}

	public String getType_code() {
		return type_code;
	}

	public void setType_code(String type_code) {
		this.type_code = type_code;
	}

	public String getTypeSlno() {
		return typeSlno;
	}

	public void setTypeSlno(String typeSlno) {
		this.typeSlno = typeSlno;
	}

	public String getType_name() {
		return type_name;
	}

	public void setType_name(String type_name) {
		this.type_name = type_name;
	}

	public MstGeneralDropdowns(String type_code, String typeSlno, String type_name) {
		super();
		this.type_code = type_code;
		this.typeSlno = typeSlno;
		this.type_name = type_name;
	}

	

	
	
	
}
