package com.example.demo.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Student implements Serializable{
	

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	private String  name;
	private String cne;
	private double moyenne;
	private String resultat;
	
	public Student() {
		super();
		
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		this.Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCne() {
		return cne;
	}

	public void setCne(String cne) {
		this.cne = cne;
	}

	public double getMoyenne() {
		return moyenne;
	}

	public void setMoyenne(double moyenne) {
		this.moyenne = moyenne;
	}

	public String getResultat() {
		return resultat;
	}

	public void setResultat(String resultat) {
		this.resultat = resultat;
	}

	public Student(int id, String name, String cne, double moyenne, String resultat) {
		super();
		this.Id = id;
		this.name = name;
		this.cne = cne;
		this.moyenne = moyenne;
		this.resultat = resultat;
	}
	
	
	
	

}
