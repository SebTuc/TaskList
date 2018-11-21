package com.seb.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import com.seb.hibernate.HibernateUtil;

public class InitServlet extends HttpServlet  {
    
	private static final long serialVersionUID = -4811561033631751819L;
    
    public void init() throws ServletException {
    	//On lance la création de la session hibernate
    	HibernateUtil.init();
		
    }
        
}    
        
        
        
        
