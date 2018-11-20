package com.seb.model;


import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Theme.class)
public class Theme_ {

	public static volatile SingularAttribute<Liste, Integer>id_theme;
	
	public static volatile SingularAttribute<Liste, String>nom;
	
	public static volatile SingularAttribute<Liste, Types>id_type;
	
}
