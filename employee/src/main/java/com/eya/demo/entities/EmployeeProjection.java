package com.eya.demo.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "nomEmpl", types = { Employee.class })
public interface EmployeeProjection {

	public String getNomEmployee();
}
