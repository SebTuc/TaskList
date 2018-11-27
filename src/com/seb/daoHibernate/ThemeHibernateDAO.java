package com.seb.daoHibernate;

import org.hibernate.Session;

import com.seb.dao.ThemeDAO;
import com.seb.hibernate.HibernateUtil;
import com.seb.model.Theme;

public class ThemeHibernateDAO implements ThemeDAO {
	
	public Theme getThemeById(int ThemeId) {
		
		Session session = HibernateUtil.getSession();

		return session.find(Theme.class, ThemeId);
		
		
	}
	
	public void deleteTheme(Theme theme) {
		
		Session session = HibernateUtil.getSession();
		
		theme.getType().getThemes().remove(theme);
		
		session.delete(theme);
		
		session.getTransaction().commit();
		HibernateUtil.restartSession();
		
	}
	
	public void addTheme(Theme theme) {
		
		Session session = HibernateUtil.getSession();
		
		session.saveOrUpdate(theme);
		
		session.getTransaction().commit();
		HibernateUtil.restartSession();
		
	}
	
	public Theme updateTheme(String newValueForName,Theme theme) {
		
		Session session = HibernateUtil.getSession();
		
		theme.setNom(newValueForName);
		
		session.update(theme);;
		
		session.getTransaction().commit();
		HibernateUtil.restartSession();
		
		return theme;
		
	}
	
}
