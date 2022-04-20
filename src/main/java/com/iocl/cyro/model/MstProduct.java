package com.iocl.cyro.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MST_PRODUCT")
public class MstProduct {
	@Id
	@Column(name = "SL_NO")
	private int sl_no;

	@Column(name = "PROD_CODE")
	private String prod_code;

	@Column(name = "PROD_DESC")
	private String prod_desc;

	public int getSl_no() {
		return sl_no;
	}

	public void setSl_no(int sl_no) {
		this.sl_no = sl_no;
	}

	public String getProd_code() {
		return prod_code;
	}

	public void setProd_code(String prod_code) {
		this.prod_code = prod_code;
	}

	public String getProd_desc() {
		return prod_desc;
	}

	public void setProd_desc(String prod_desc) {
		this.prod_desc = prod_desc;
	}

	public MstProduct(String prod_code, String prod_desc) {
		super();
		this.prod_code = prod_code;
		this.prod_desc = prod_desc;
	}

	public MstProduct() {
		super();
	}

	public MstProduct(String string, String string2, int i) {
		// TODO Auto-generated constructor stub
	}

	public MstProduct(int sl_no, String prod_code, String prod_desc) {
		super();
		this.sl_no = sl_no;
		this.prod_code = prod_code;
		this.prod_desc = prod_desc;
	}
}
