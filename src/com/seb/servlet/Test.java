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
		String idButton = request.getParameter("buttonAdd");
		String inputType = request.getParameter("types");
		String inputTheme= request.getParameter("themes");
		String inputList= request.getParameter("listes");
		
		System.out.println(inputTheme);
		System.out.println(idButton);
		
		ThemeService themeService = new ThemeService();
		TypesService typeService = new TypesService();
		
		if(idButton!=null) {
			
			if(idButton.equals("add")) {
				
				typeService.addTypes(inputType);
				
			}else if(inputTheme!=null) {
				
				themeService.addTheme(inputTheme, idButton);
				
			}else if(inputList!=null) {
				
				System.out.println("Do nothing for the moment....");
				
			}
		}
		
		if(idTheme!=null) {
			
			themeService.deleteThemeById(idTheme);
			
		}
		
		if(idList!=null) {
			
			
		}
		
		doGet(request, response);
	}
}