package com.mainclass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.config.EmployeeConfig;
import com.entities.Employee;

public class EmployeeMain {
	
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(EmployeeConfig.class);
		Employee e=context.getBean( Employee.class);
		Employee e1=context.getBean(Employee.class);
		System.out.println(e.hashCode());
		System.out.println(e1.hashCode());
		System.out.println(e==e1);
		
	}
}
		