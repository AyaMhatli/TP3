package com.eya.demo.service;

import java.util.List;

import com.eya.demo.entities.Employee;
import com.eya.demo.entities.Entreprise;

public interface EmployeeService {
	Employee saveEmployee(Employee e);
	Employee updateEmployee(Employee e);
	void deleteEmployee(Employee e);
	void deleteEmployeeById(Long id);
	Employee getEmployee(Long id);
	
	List<Employee> getAllEmployees();
	List<Employee> findByNomEmployee(String nom);
	List<Employee> findByNomEmployeeContains(String nom);
	List<Employee> findByNomSalaire (String nom, Double prix);
	List<Employee> findByEntreprise (Entreprise entreprise);
	List<Employee> findByEntrepriseIdEnt(Long id);
	List<Employee> findByOrderByNomEmployeeAsc();
	List<Employee> trierEmployeesNomsSalaire();

}
