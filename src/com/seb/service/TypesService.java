package com.seb.service;

import java.util.List;

import com.seb.dao.TypesDAO;
import com.seb.model.Types;

public class TypesService {
	
	private static TypesDAO typesDAO;
	
	public List<Types> getAllType(){
		
		List<Types> types = typesDAO.getAllTypes();
		return types;
		
	}
}
