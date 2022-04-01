package com.iocl.cyro.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MST_STATE_DISTRICT")
public class MstStateDistrict {
	@Id
	@Column(name = "SL_NO")
	private int sl_no;
	
	@Column(name = "STATE_CODE")
	private String state_code;
	
	@Column(name = "STATE_NAME")
	private String state_name;
	
	@Column(name = "DISTRICT_CODE")
	private String district_code;
	
	@Column(name = "DISTRICT_NAME")
	private String district_name;
	
	public int getSl_no() {
		return sl_no;
	}
	public void setSl_no(int sl_no) {
		this.sl_no = sl_no;
	}
	public String getState_code() {
		return state_code;
	}
	public void setState_code(String state_code) {
		this.state_code = state_code;
	}
	public String getState_name() {
		return state_name;
	}
	public void setState_name(String state_name) {
		this.state_name = state_name;
	}
	public String getDistrict_code() {
		return district_code;
	}
	public void setDistrict_code(String district_code) {
		this.district_code = district_code;
	}
	public String getDistrict_name() {
		return district_name;
	}
	public void setDistrict_name(String district_name) {
		this.district_name = district_name;
	}
	@Override
	public String toString() {
		return "MstStateDistrict [sl_no=" + sl_no + ", state_code=" + state_code + ", state_name=" + state_name
				+ ", district_code=" + district_code + ", district_name=" + district_name + "]";
	}
	public MstStateDistrict(String state_code, String state_name) {
		super();
		this.state_code = state_code;
		this.state_name = state_name;
	}
	public MstStateDistrict(int sl_no, String state_code, String state_name, String district_code,
			String district_name) {
		super();
		this.sl_no = sl_no;
		this.state_code = state_code;
		this.state_name = state_name;
		this.district_code = district_code;
		this.district_name = district_name;
	}
	public MstStateDistrict() {
		super();
	}
	
	
}
