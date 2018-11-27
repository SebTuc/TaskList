package com.seb.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.seb.model.Types;
import com.seb.service.ListeService;
import com.seb.service.ThemeService;
import com.seb.service.TypesService;


public class Test extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		TypesService typesService = new TypesService();
		
		List<Types> allTypes = typesService.getAllType();

		request.setAttribute("allTypes", allTypes);	
		
		request.getRequestDispatcher("/jsp/application/test.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String idTheme = request.getParameter("deleteTheme");
		String idList = request.getParameter("deleteList");
		String idButtonAdd = request.getParameter("buttonAdd");
		String idButtonAddTheme = request.getParameter("buttonAddTheme");
		String idButtonAddListe = request.getParameter("buttonAddListe");
		String idThemeUpdate = request.getParameter("updateTheme");
		String inputType = request.getParameter("types");
		String Theme="";
		String List="";
		String[] inputList= request.getParameterValues("listes");
		String[] inputTheme = request.getParameterValues("themes");
		
		//La on gere pas le fait d'inserer plusieur valeur et aucune vérification c'est juste des test
		for(String s : inputTheme) {
			if(!s.equals("")) {
				Theme = s;
			}
		}
		
		for(String s : inputList) {
			if(!s.equals("")) {
				List = s;
			}
		}
		
		ThemeService themeService = new ThemeService();
		ListeService ls = new ListeService();
		TypesService typeService = new TypesService();
		
		
		if(idButtonAdd!=null) {
			typeService.addTypes(inputType);
		}
		if(idButtonAddTheme!=null) {
			themeService.addTheme(Theme, idButtonAddTheme);
		}
		if(idButtonAddListe!=null) {
			
			ls.addListe(List, idButtonAddListe);
			//System.out.println("Do nothing for the moment....");
			
		}
		
		if(idThemeUpdate!=null) {
			themeService.updateTheme("Test!!", idThemeUpdate);
		}
			
		if(idTheme!=null) {
			
			themeService.deleteThemeById(idTheme);
			
		}
		
		if(idList!=null) {
			
			
		}
		
		doGet(request, response);
	}
}