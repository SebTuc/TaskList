package com.seb.hibernate;

import javax.persistence.criteria.CriteriaBuilder;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private static SessionFactory sessionFactory;
	private static CriteriaBuilder builder;
	
	static {
		try {
			//Création de la session Hibernate et du criteriatBuilder a l'init (InitServlet)
			sessionFactory = new Configuration().configure().buildSessionFactory();
			
			builder = sessionFactory.getCriteriaBuilder();			
		
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	
	public static CriteriaBuilder getCriteriaBuilder() {
		return builder;
	}
	
	public static void init() {
		
		System.out.println("Initialization hibernate utils");
	}
	
}
