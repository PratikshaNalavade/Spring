package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.entities.Country;

@Configuration
public class Config {

	@Bean("con")
	public Country conObj() {
		return new Country();
	}
	

}