package com.seb.model;


import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "theme" )
public class Theme {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_theme")
	private int id_theme;
	private String nom;
	
	@ManyToOne()
	@JoinColumn(name="id_type")
	private Types type;
	
	

	@OneToMany(mappedBy = "theme", cascade = CascadeType.PERSIST, orphanRemoval = true)
	private Set<Liste> listes = new HashSet<Liste>(0);
	
	public Set<Liste> getListes() {
		return listes;
	}

	public void setListes(Set<Liste> listes) {
		this.listes = listes;
	}

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
	
	public Types getType() {
		return type;
	}

	public void setType(Types type) {
		this.type = type;
	}
	

	
	
}
