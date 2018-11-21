package com.seb.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.seb.model.Types;
import com.seb.service.TypesService;


public class TestAffichageMessage extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public TestAffichageMessage() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		TypesService typesService = new TypesService();
		List<Types> allTypes = typesService.getAllType();
		/*System.out.println("Test affichage :");
		for(Types t : allTypes) {
			System.out.println(t.getNom());
		}*/
		request.setAttribute("allTypes", allTypes);
		
		this.getServletContext().getRequestDispatcher("/ressource/jsp/Test.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
