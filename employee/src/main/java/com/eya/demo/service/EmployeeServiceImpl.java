package com.eya.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eya.demo.entities.Employee;
import com.eya.demo.entities.Entreprise;
import com.eya.demo.repos.EmployeeRepository;

@Service

public class EmployeeServiceImpl implements EmployeeService {
  @Autowired

  
 EmployeeRepository employeeRepository;
  
  @Override
  public Employee saveEmployee(Employee e) { return employeeRepository.save(e);

}
  
  @Override
  public Employee updateEmployee(Employee e) { return employeeRepository.save(e);
  }
  @Override
  public void deleteEmployee(Employee e) { employeeRepository.delete(e);
  }
  @Override
  public void deleteEmployeeById(Long id) {
 employeeRepository.deleteById(id);
  }
  @Override
  public Employee getEmployee(Long id) { return employeeRepository.findById(id).get();
  }
  @Override
  public List<Employee> getAllEmployees() { return employeeRepository.findAll();
  }
  
  @Override
  public List<Employee> findByNomEmployee(String nom) {
  return employeeRepository.findByNomEmployee(nom);
  }
  @Override public List<Employee> findByNomEmployeeContains(String nom) {
	  return employeeRepository.findByNomEmployeeContains(nom);
	  }
	  @Override
	  public List<Employee> findByNomSalaire(String nom, Double prix) {
		  return employeeRepository.findByNomSalaire(nom, prix);
	  }
	  @Override
	  public List<Employee> findByEntreprise(Entreprise entreprise) {
	  return employeeRepository.findByEntreprise(entreprise);
	  }
	  @Override
	  public List<Employee> findByEntrepriseIdEnt(Long id) {
	  return employeeRepository.findByEntrepriseIdEnt(id);
	  }
	  @Override
	  public List<Employee> findByOrderByNomEmployeeAsc() {
	  return employeeRepository.findByOrderByNomEmployeeAsc();
	  }
	  @Override
	  public List<Employee> trierEmployeesNomsSalaire() {
	  return employeeRepository.trierEmployeesNomSalaire();}
	  }






