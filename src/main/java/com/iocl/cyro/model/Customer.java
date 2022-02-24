package com.iocl.cyro.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int customerid;
	private String customername;
	private String designation;
	private String address;
	private String town;
	private String district;
	private String state;
	private String pin;
	private String phone;
	private String emailid;
	private String panno;
	private String applicationuse;
	private String modelselection;
	private String inforequired;
	private String freetext;


}
