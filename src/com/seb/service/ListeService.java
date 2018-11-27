package com.seb.service;

import com.seb.daoHibernate.ListeHibernateDAO;
import com.seb.daoHibernate.ThemeHibernateDAO;
import com.seb.model.Liste;
import com.seb.model.Theme;

public class ListeService {

	public Liste addListe(String message , String id_Theme) {
		
		ThemeHibernateDAO themeDAO = new ThemeHibernateDAO();
		Theme theme = themeDAO.getThemeById(Integer.parseInt(id_Theme));
		ListeHibernateDAO ls = new ListeHibernateDAO();
		
		
		Liste liste = new Liste();
		liste.setTheme(theme);
		liste.setMessage(message);
		ls.addListe(liste);
		
		return liste;
		
	}
}
