package com.seb.daoHibernate;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;

import com.seb.dao.TypesDAO;
import com.seb.hibernate.HibernateUtil;
import com.seb.model.Types;

public class TypesHibernateDAO implements TypesDAO {

	
	@SuppressWarnings({ "deprecation", "unchecked" })
	public List<Types> getAllTypes() {
		Session session = HibernateUtil.createSession();
		
		Criteria crit = session.createCriteria(Types.class);
		List<Types> types = crit.list();
		session.close();
		if(types.isEmpty()) {
			
			return null;
			
		}else {
			return types;
		}
	}

}
