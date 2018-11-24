package com.seb.daoHibernate;

import javax.persistence.EntityManager;

import org.hibernate.Session;

import com.seb.dao.ThemeDAO;
import com.seb.hibernate.HibernateUtil;
import com.seb.model.Theme;

public class ThemeHibernateDAO implements ThemeDAO {
	
	public Theme getThemeById(int ThemeId) {
		
		Session session = HibernateUtil.getSession();
		EntityManager entityManager = HibernateUtil.getEntityManager();
		session.getTransaction();
		
		Theme themeById = entityManager.find(Theme.class, ThemeId);
	
		return themeById;
		
		
	}
	
	public void deleteTheme(Theme theme) {
		
		Session session = HibernateUtil.getSession();
		session.getTransaction();
		
		session.save(theme);
		
		session.delete(theme);
		session.flush();
	}
}
