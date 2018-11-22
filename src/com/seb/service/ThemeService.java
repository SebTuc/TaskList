package com.seb.service;

import com.seb.daoHibernate.ThemeHibernateDAO;
import com.seb.model.Theme;

public class ThemeService {

	public void deleteThemeById(String id) {
		
		ThemeHibernateDAO themeDAO = new ThemeHibernateDAO();
		Theme theme = themeDAO.getThemeById(Integer.parseInt(id));
		themeDAO.deleteTheme(theme);
	}
}
