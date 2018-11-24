package com.seb.service;

import java.util.List;

<<<<<<< HEAD
import com.seb.dao.TypesDAO;
=======
>>>>>>> develop
import com.seb.daoHibernate.TypesHibernateDAO;
import com.seb.model.Types;

public class TypesService {
	
<<<<<<< HEAD
=======
	
>>>>>>> develop
	public List<Types> getAllType(){
		
		TypesHibernateDAO typesDAO = new TypesHibernateDAO();
		List<Types> types = typesDAO.getAllTypes();
		return types;
	}
}
