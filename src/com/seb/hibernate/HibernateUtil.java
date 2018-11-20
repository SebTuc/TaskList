package com.seb.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {

	private  static SessionFactory sessionFactory;
	private  static ServiceRegistry serviceRegistry;
	private final static String APP_FILE = "hibernate.cfg.xml";
	
	static {
		try {
			
			Configuration conf = new Configuration();
			conf.configure(APP_FILE);
			
			serviceRegistry = new StandardServiceRegistryBuilder().applySettings(conf.getProperties()).build();
			
			sessionFactory = conf.buildSessionFactory(serviceRegistry);
		
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	public static void init() {
		System.out.println("Initialization hibernate utils");
	}
	
}
