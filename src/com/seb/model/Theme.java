package com.seb.model;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table( name = "Theme" )
public class Theme {

	private int id_theme;
	
	private String nom;
	
	private Types id_type;
	
	public Theme() {
		
	}
	
	public Theme(String nom, Types id_type) {
		this.id_type=id_type;
		this.nom=nom;
	}

	@Id
	@GeneratedValue(generator="increment")
	@GenericGenerator(name="increment", strategy = "increment")
	public int getId_theme() {
		return id_theme;
	}

	public void setId_theme(int id_theme) {
		this.id_theme = id_theme;
	}
	
	@Column(name = "nom",length=50)
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
	@OneToMany(cascade = CascadeType.ALL)
	public Types getId_type() {
		return id_type;
	}

	public void setId_type(Types id_type) {
		this.id_type = id_type;
	}
	
	
}
