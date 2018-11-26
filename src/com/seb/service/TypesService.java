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
	
	public Types getTypesById(String typesId) {
		
		TypesHibernateDAO typesDAO = new TypesHibernateDAO();
		
		return typesDAO.getTypesById(Integer.parseInt(typesId));
		
		
	}
	
	public Types addTypes(String nameType) {
		
		TypesHibernateDAO tyHDAO = new TypesHibernateDAO();
		Types types = new Types();
		types.setNom(nameType);
		tyHDAO.addTypes(types);
		
		return types;
	}
}
