package com.seb.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "Liste")
public class Liste {
	
	@Id
	@GeneratedValue(generator="increment")
	@GenericGenerator(name="increment", strategy = "increment")
	private int id_liste;
	
	@ManyToOne()
	@JoinColumn(name="id_theme")
	private Theme id_theme;
	private String message;

	
	/*GETTER SETTER*/
	public int getId_liste() {
		return id_liste;
	}

	public void setId_liste(int id_liste) {
		this.id_liste = id_liste;
	}

	public Theme getId_theme() {
		return id_theme;
	}

	public void setId_theme(Theme id_theme) {
		this.id_theme = id_theme;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
