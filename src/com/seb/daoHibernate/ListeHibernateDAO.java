package com.seb.daoHibernate;

import org.hibernate.Session;

import com.seb.dao.ListeDAO;
import com.seb.hibernate.HibernateUtil;
import com.seb.model.Liste;

public class ListeHibernateDAO implements ListeDAO {

	public void addListe(Liste liste) {
		Session session = HibernateUtil.getSession();
		
		session.saveOrUpdate(liste);
		
		session.getTransaction().commit();
		HibernateUtil.restartSession();
	}
	
}
