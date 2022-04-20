package com.iocl.cyro.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MST_MODEL")
public class MstModel {
	@Id
	@Column(name = "SL_NO")
	private int sl_no;
	
	@Column(name = "MODEL_CODE")
	private String model_code;
	
	@Column(name = "MODEL_DESC")
	private String model_desc;

	public int getSl_no() {
		return sl_no;
	}

	public void setSl_no(int sl_no) {
		this.sl_no = sl_no;
	}

	public String getModel_code() {
		return model_code;
	}

	public void setModel_code(String model_code) {
		this.model_code = model_code;
	}

	public String getModel_desc() {
		return model_desc;
	}

	public void setModel_desc(String model_desc) {
		this.model_desc = model_desc;
	}

	public MstModel(String model_code, String model_desc) {
		super();
		this.model_code = model_code;
		this.model_desc = model_desc;
	}

	public MstModel() {
		super();
	}
	public MstModel(int sl_no,String model_code, String model_desc) {
		super();
		this.sl_no=sl_no;
		this.model_code = model_code;
		this.model_desc = model_desc;
	}
	
}
