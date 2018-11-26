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


public class TestAffichageMessage extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public TestAffichageMessage() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		TypesService typesService = new TypesService();
		List<Types> allTypes = typesService.getAllType();

		request.setAttribute("allTypes", allTypes);	
		
		this.getServletContext().getRequestDispatcher("/ressource/jsp/Test.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String idTheme = request.getParameter("deleteTheme");
		String idList = request.getParameter("deleteList");
		String idButton = request.getParameter("buttonAdd");
		String inputType = request.getParameter("type");
		String inputTheme= request.getParameter("theme");
		String inputList= request.getParameter("liste");
		System.out.println(inputTheme);
		System.out.println(idButton);
		
		ListeService ls = new ListeService();
		ThemeService themeService = new ThemeService();
		TypesService ts = new TypesService();
		
		if(idButton!=null) {
			if(idButton.equals("add")) {
				
				ts.addTypes(inputType);
				
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
