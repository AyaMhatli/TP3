package com.eya.demo.repos;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.eya.demo.entities.Employee;
import com.eya.demo.entities.Entreprise;

@RepositoryRestResource(path = "rest")
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	List<Employee> findByNomEmployee(String nom);
	List<Employee> findByNomEmployeeContains(String nom);
	
	List<Employee> findByEntrepriseIdEnt(Long id);
	List<Employee> findByOrderByNomEmployeeAsc();
	
	@Query("select e from Employee e where e.nomEmployee like %?1 and e.salaireEmployee > ?2") 
	List<Employee> findByNomSalaire (String nom, Double salaire);
	
	@Query ("select e from Employee e where e.entreprise = ?1") 
	List<Employee> findByEntreprise (Entreprise entreprise);
	
	@Query("select e from Employee  e order by e.nomEmployee ASC, e.salaireEmployee DESC")
	List<Employee> trierEmployeesNomSalaire ();
 


}
