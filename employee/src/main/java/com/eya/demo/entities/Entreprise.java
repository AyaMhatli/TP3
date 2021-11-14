package com.eya.demo.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Entreprise {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long idEnt;
	private String nomEnt;
	private String descriptionEnt;
	
	
	@OneToMany(mappedBy = "entreprise")
	@JsonIgnore
	private List<Employee> employees;


	

	public Entreprise(String nomEnt, String descriptionEnt, List<Employee> employees) {
		
		this.nomEnt = nomEnt;
		this.descriptionEnt = descriptionEnt;
		this.employees = employees;
	}

	public Long getIdEnt() {
		return idEnt;
	}

	public void setIdEnt(Long idEnt) {
		this.idEnt = idEnt;
	}

	public String getNomEnt() {
		return nomEnt;
	}

	public void setNomEnt(String nomEnt) {
		this.nomEnt = nomEnt;
	}

	public String getDescriptionEnt() {
		return descriptionEnt;
	}

	public void setDescriptionEnt(String descriptionEnt) {
		this.descriptionEnt = descriptionEnt;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}	
	
	
	
}