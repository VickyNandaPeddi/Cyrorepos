package com.iocl.cyro.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TRN_NONREG_ORDER")
public class TrnOrderDetails {
	@Id
	@GeneratedValue(generator = "trnOrderSeq", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(allocationSize = 1, name = "trnOrderSeq", sequenceName = "TRN_ORDER_SEQ")
	@Column(name = "REQ_NO")
	private int reqNo;
	
	@Column(name = "CUST_NAME")
	private String custName;
	
	@Column(name = "CITY")
	private String city;

	public int getReqNo() {
		return reqNo;
	}

	public void setReqNo(int reqNo) {
		this.reqNo = reqNo;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	
	
}
