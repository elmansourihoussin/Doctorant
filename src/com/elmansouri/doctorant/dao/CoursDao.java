package com.elmansouri.doctorant.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.elmansouri.doctorant.entities.Cours;

@Stateless
public class CoursDao extends LocalDaoImpl<Cours> {
	
	public CoursDao() {
		super(Cours.class);
	}
	
	public CoursDao(Class<Cours> entityClass) {
		super(entityClass);
	}

	@PersistenceContext(unitName = "doctorant")
	private EntityManager em;
	
	@Override
	protected EntityManager getEntityManager() {
		return em;
	}
	
	

}
