package com.seb.service;

import java.util.List;

import com.seb.daoHibernate.TypesHibernateDAO;
import com.seb.model.Types;

public class TypesService {
	
	
	public List<Types> getAllType(){
		
		TypesHibernateDAO typesDAO = new TypesHibernateDAO();
		List<Types> types = typesDAO.getAllTypes();
		return types;
		
	}
}
