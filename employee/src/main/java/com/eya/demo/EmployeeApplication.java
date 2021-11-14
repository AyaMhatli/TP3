package com.eya.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.eya.demo.entities.Employee;

@SpringBootApplication
public class EmployeeApplication {
	@Autowired
	private RepositoryRestConfiguration repositoryRestConfiguration;

	public static void main(String[] args) {
		SpringApplication.run(EmployeeApplication.class, args);}
	
		public void run(String... args) throws Exception {
			repositoryRestConfiguration.exposeIdsFor(Employee.class);
	
	
	}

}
