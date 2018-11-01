package com.seb.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.seb.model.Types;
import com.seb.service.TypesService;

/**
 * Servlet implementation class TestAffichageMessage
 */
@WebServlet("/TestAffichageMessage")
public class TestAffichageMessage extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private static TypesService typesService;   
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestAffichageMessage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Types> allTypes = typesService.getAllType();
		/*System.out.println("////////////////////////////////////////////////////////////////////////////////////////////////////");
		for(Types type : allTypes) {
			
			System.out.println(type.getNom());
			
		}
		System.out.println("////////////////////////////////////////////////////////////////////////////////////////////////////");*/
		request.setAttribute("allTypes", allTypes);
		
		this.getServletContext().getRequestDispatcher("/ressource/jsp/Test.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
