package com.seb.model;


import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "Theme" )
public class Theme {

	@Id
	@GeneratedValue(generator="increment")
	@GenericGenerator(name="increment", strategy = "increment")
	private int id_theme;
	private String nom;
	
	@ManyToOne()
	@JoinColumn(name="id_types")
	private Types id_type;
	
	@OneToMany(mappedBy = "Theme", cascade = CascadeType.REMOVE, orphanRemoval = true)
	private Set<Liste> listes = new HashSet<Liste>(0);
	
	public int getId_theme() {
		return id_theme;
	}

	public void setId_theme(int id_theme) {
		this.id_theme = id_theme;
	}
	
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	

	public Types getId_type() {
		return id_type;
	}

	public void setId_type(Types id_type) {
		this.id_type = id_type;
	}
	
	
}
