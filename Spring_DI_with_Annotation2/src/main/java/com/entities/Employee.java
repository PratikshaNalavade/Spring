package com.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")  //this is used when we want to create multiple objects of employee. by default singleton is called
public class Employee {
	
	@Value("101")
	 int emp_id;
	@Value("Avishkar")
	 String ename;
	@Value("30000")
	 int salary;
	
	@Autowired
	private Country con;
	
	
	public Country getCon() {
		return con;
	}
	public void setCon(Country con) {
		this.con = con;
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", ename=" + ename + ", salary=" + salary + ", con=" + con + "]";
	}
	
	
	

}
