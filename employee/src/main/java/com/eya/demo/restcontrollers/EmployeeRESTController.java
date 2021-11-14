package com.eya.demo.restcontrollers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.eya.demo.entities.Employee;
import com.eya.demo.service.EmployeeService;

@RestController
@RequestMapping("/api")
@CrossOrigin

public class EmployeeRESTController {
	@Autowired
	EmployeeService employeeService;
	@RequestMapping(method = RequestMethod.GET)
	 public List<Employee> getAllEmployees() {
	 return employeeService.getAllEmployees();
	}
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Employee getEmployeeById(@PathVariable("id") Long id)
	{ return employeeService.getEmployee(id);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public Employee createEmployee(@RequestBody Employee employee) {
	return employeeService.saveEmployee(employee);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public Employee updateEmployee(@RequestBody Employee employee) {
	return employeeService.updateEmployee(employee);
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteEmployee(@PathVariable("id") Long id)
	{
	employeeService.deleteEmployeeById(id);
	}
	
	@RequestMapping(value="/emplscat/{idEnt}",method = RequestMethod.GET)
	public List<Employee> getEmployeesByEntId(@PathVariable("idEnt") Long idEnt) {
	return employeeService.findByEntrepriseIdEnt(idEnt);
	}
	}    
	
	
	
	
	

