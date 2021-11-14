package com.eya.demo.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idEmployee;
	private String nomEmployee;
	private Double salaireEmployee;
	private Date dateEmbauche;
	
	@ManyToOne
	private Entreprise entreprise;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String nomEmployee, Double salaireEmployee, Date dateEmbauche) {
		super();
		this.nomEmployee = nomEmployee;
		this.salaireEmployee = salaireEmployee;
		this.dateEmbauche = dateEmbauche;
	}
	public Long getIdEmployee() {
		return idEmployee;
	}
	public void setIdEmployee(Long idEmployee) {
		this.idEmployee = idEmployee;
	}
	public String getNomEmployee() {
		return nomEmployee;
	}
	public void setNomEmployee(String nomEmployee) {
		this.nomEmployee = nomEmployee;
	}
	public Double getSalaireEmployee() {
		return salaireEmployee;
	}
	public void setSalaireEmployee(Double salaireEmployee) {
		this.salaireEmployee = salaireEmployee;
	}
	public Date getDateEmbauche() {
		return dateEmbauche;
	}
	public void setDateEmbauche(Date dateEmbauche) {
		this.dateEmbauche = dateEmbauche;
	}
	@Override
	public String toString() {
		return "Employee [idEmployee=" + idEmployee + ", nomEmployee=" + nomEmployee + ", salaireEmployee="
				+ salaireEmployee + ", dateEmbauche=" + dateEmbauche + "]";
	}

	
}
