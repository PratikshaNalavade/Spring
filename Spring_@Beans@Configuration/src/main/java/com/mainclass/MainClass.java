package com.mainclass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.Config;
import com.entities.Country;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Country c = context.getBean("con",Country.class);
		System.out.println(c);

	}

}