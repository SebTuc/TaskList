package com.seb.dao;

import com.seb.model.Theme;

public interface ThemeDAO {
	
	public void deleteTheme(Theme theme);
	public Theme getThemeById(int ThemeId);
	public void addTheme(Theme theme);
	public Theme updateTheme(String newValueForName,Theme theme);
}
