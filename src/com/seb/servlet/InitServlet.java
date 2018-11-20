package com.seb.servlet;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import com.seb.generic.dao.DAOFactory;
import com.seb.hibernate.HibernateUtil;

public class InitServlet extends HttpServlet  {
    
	private static final long serialVersionUID = -4811561033631751819L;
    
    
    public void init() throws ServletException {

    	
    	HibernateUtil.init();
		ResourceBundle servicesBundle = ResourceBundle.getBundle("dao");
		Map<String, String> daosMap = new HashMap<String, String>();
		String element = "";
		Enumeration<String> e = servicesBundle.getKeys();
		while (e.hasMoreElements()) {
		    element = e.nextElement();
		    daosMap.put(element, servicesBundle.getString(element));
		}
		DAOFactory.setDaosMap(daosMap);
    }
        
}    
        
        
        
        
