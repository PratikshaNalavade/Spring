package com.entities;

public class Employee {
	
	private int emp_id;
	private String ename;
	private int salary;
	
	private Country con;
	
	
	public Country getCon() {
		return con;
	}
	public void setCon(Country country) {
		this.con = country;
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
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int emp_id, String ename, int salary, Country con) {
		super();
		this.emp_id = emp_id;
		this.ename = ename;
		this.salary = salary;
		this.con = con;
	}
	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", ename=" + ename + ", salary=" + salary + ", country=" + con + "]";
	}
	
	

}
