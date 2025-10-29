package com.entities;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Country {
	
	@Value("+91")
	int c_id;
	@Value("IND")
	String cname;
	public int getC_id() {
		return c_id;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	@Override
	public String toString() {
		return "Country [c_id=" + c_id + ", cname=" + cname + "]";
	}
	
	
	
	
	
	

}
