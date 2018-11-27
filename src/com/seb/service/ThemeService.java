package com.seb.service;

import com.seb.daoHibernate.ThemeHibernateDAO;
import com.seb.model.Theme;
import com.seb.model.Types;

public class ThemeService {

	public void deleteThemeById(String id) {
		
		ThemeHibernateDAO themeDAO = new ThemeHibernateDAO();
		Theme theme = themeDAO.getThemeById(Integer.parseInt(id));
		themeDAO.deleteTheme(theme);
	}
	
	public Theme addTheme(String themeName,String id_type) {
		
		TypesService ts = new TypesService();
		ThemeHibernateDAO themeDAO = new ThemeHibernateDAO();
		Types type = ts.getTypesById(id_type);
		
		Theme theme = new Theme();
		theme.setNom(themeName);
		theme.setType(type);
		themeDAO.addTheme(theme);
		
		return theme;
		
	}
	
	public Theme updateTheme(String themeName, String id_type) {

		
		ThemeHibernateDAO themeDAO = new ThemeHibernateDAO();
		
		Theme theme = themeDAO.updateTheme(themeName,themeDAO.getThemeById(Integer.parseInt(id_type)));
		
		return theme;
		
	}
}
