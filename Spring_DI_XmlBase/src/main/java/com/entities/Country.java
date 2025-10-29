package com.entities;

public class Country {
	
	private String c_id;
	private String cname;
	
	public String getC_id() {
		return c_id;
	}
	public void setC_id(String c_id) {
		this.c_id = c_id;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Country(String c_id, String cname) {
		super();
		this.c_id = c_id;
		this.cname = cname;
	}
	
	public Country() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Country [c_id=" + c_id + ", cname=" + cname + "]";
	}
	
	

}
