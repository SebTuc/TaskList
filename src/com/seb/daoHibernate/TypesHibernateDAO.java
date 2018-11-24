package com.seb.daoHibernate;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

<<<<<<< HEAD
import org.hibernate.Criteria;
=======
>>>>>>> develop
import org.hibernate.Session;

import com.seb.dao.TypesDAO;
import com.seb.hibernate.HibernateUtil;
import com.seb.model.Types;

public class TypesHibernateDAO implements TypesDAO {

	
	public List<Types> getAllTypes() {
		//On recupere la session et le criteria builder génerer au moment de l'init
		Session session = HibernateUtil.getSession();

		CriteriaBuilder builder = HibernateUtil.getCriteriaBuilder();
		
		session.getTransaction();
		
		CriteriaQuery<Types> crit = builder.createQuery(Types.class);
		
		Root<Types> TypesRoot = crit.from(Types.class);
		
		crit.select(TypesRoot);
		
		List<Types> types = session.createQuery(crit).getResultList();
		
<<<<<<< HEAD
		CriteriaBuilder builder = session.getCriteriaBuilder();
		
		CriteriaQuery<Types> crit = builder.createQuery(Types.class);
		
//		List<Types> types = crit.list();
		
		 Root<Types> typeRoot = crit.from(Types.class);

		 crit.select(typeRoot);
		 List<Types> types = session.createQuery(crit).getResultList();
		 
		session.close();
		
=======
>>>>>>> develop
		if(types.isEmpty()) {
			
			return null;
			
		}else {
			return types;
		}
	}

}
