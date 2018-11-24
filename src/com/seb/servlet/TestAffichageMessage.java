package com.seb.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.seb.model.Types;
import com.seb.service.ThemeService;
import com.seb.service.TypesService;


public class TestAffichageMessage extends HttpServlet {
<<<<<<< HEAD
	private static final long serialVersionUID = 1L;   
	
    /**
     * @see HttpServlet#HttpServlet()
     */
=======
	private static final long serialVersionUID = 1L;

>>>>>>> develop
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
		System.out.println(idList);
		System.out.println(idTheme);
		ThemeService themeService = new ThemeService();
		
		
		if(idTheme!=null) {
			
			themeService.deleteThemeById(idTheme);
			
		}
		
		doGet(request, response);
	}

}
