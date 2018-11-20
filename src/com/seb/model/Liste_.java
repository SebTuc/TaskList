package com.seb.model;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Liste.class)
public class Liste_ {
	
	public static volatile SingularAttribute<Liste, Integer>id_liste;
	public static volatile SingularAttribute<Liste, Theme >id_theme;
	public static volatile SingularAttribute<Liste, String> message;

	
}
