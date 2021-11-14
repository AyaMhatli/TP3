package com.eya.demo;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.eya.demo.entities.Employee;
import com.eya.demo.entities.Entreprise;
import com.eya.demo.repos.EmployeeRepository;

@org.springframework.boot.test.context.SpringBootTest
class EmployeeApplicationTests {
	@Autowired
	private  EmployeeRepository employeeRepository;

	@Test
	public void testCreateEmployee() {
	Employee emp= new Employee("med ali",925.25,new Date());
	employeeRepository.save(emp);
	}
	@Test
	public void testFindEmployee()
	{ Employee e = employeeRepository.findById(1L).get();
	System.out.println(e);
	}
	@Test
	public void testUpdateEmployee()
	{ Employee e= employeeRepository.findById(1L).get();
	e.setSalaireEmployee(1000.0); employeeRepository.save(e);
	}
	
	
	public void testDeletetEmployee()
	{ employeeRepository.deleteById(1L);;
	}
	@Test
	public void testListerTousEmployees()
	{
	List<Employee> emps= employeeRepository.findAll();
	for (Employee e : emps)
	{
	System.out.println(e);
	}
	}
	@Test
	public void testFindByNomEmployee()
	{
	List<Employee> empls = employeeRepository.findByNomEmployee("ibrahim");
	for (Employee e : empls)
	{
	System.out.println(e);
	}
	}
	@Test
	public void testFindByNomEmployeeContains ()
	{
	List<Employee> empls=employeeRepository.findByNomEmployeeContains("ibrahim");
	for (Employee e : empls)
	{
	System.out.println(e);
	} }
	@Test public void testfindByNomSalaire()
	{
	List<Employee> empls = employeeRepository.findByNomSalaire("ibrahim", 1000.0);
	for (Employee e : empls)
	{
	System.out.println(e);
	}
	}
	@Test
	public void testfindByEntreprise()
	{
	Entreprise ent = new Entreprise();
	ent.setIdEnt(1L);
	List<Employee> empls = employeeRepository.findByEntreprise(ent);
	for (Employee e : empls)
	{
	System.out.println(e);
	}
	}  
	
	@Test
	public void findByEntrepriseIdEnt()
	{
	List<Employee> empls = employeeRepository.findByEntrepriseIdEnt(1L);
	for (Employee e : empls)
	{
	System.out.println(e);
	}
	}
	@Test
	public void testfindByOrderByNomEntrepriseAsc()
	{
	List<Employee> empls = employeeRepository.findByOrderByNomEmployeeAsc();
	for (Employee e : empls)
	{
	System.out.println(e);
	}
	}
	@Test public void testTrierEmployeesNomSalaire()
	{
	List<Employee> empls = employeeRepository.trierEmployeesNomSalaire ();
	for (Employee e : empls)
	{
	System.out.println(e);
	}
	}
	
	}
