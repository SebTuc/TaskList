package com.seb.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {

	private static SessionFactory sessionFactory;
	private static ServiceRegistry serviceRegistry;
	private static Session serviceSession;
	
	public static Session createSession() {
		
		Configuration conf = new Configuration();
		conf.configure("hibernate.cfg.xml");
		
		serviceRegistry = new StandardServiceRegistryBuilder().applySettings(conf.getProperties()).build();
		
		sessionFactory = conf.buildSessionFactory(serviceRegistry);
		
		serviceSession = sessionFactory.openSession();
		
		return serviceSession;
	}
	
}
