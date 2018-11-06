package com.seb.daoHibernate;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Criteria;
import org.hibernate.Session;

import com.seb.dao.TypesDAO;
import com.seb.hibernate.HibernateUtil;
import com.seb.model.Types;

public class TypesHibernateDAO implements TypesDAO {

	
	public List<Types> getAllTypes() {
		Session session = HibernateUtil.createSession();
		
		CriteriaBuilder builder = session.getCriteriaBuilder();
		
		CriteriaQuery<Types> crit = builder.createQuery(Types.class);
		
//		List<Types> types = crit.list();
		
		 Root<Types> typeRoot = crit.from(Types.class);

		 crit.select(typeRoot);
		 List<Types> types = session.createQuery(crit).getResultList();
		 
		session.close();
		
		if(types.isEmpty()) {
			
			return null;
			
		}else {
			return types;
		}
	}

}
