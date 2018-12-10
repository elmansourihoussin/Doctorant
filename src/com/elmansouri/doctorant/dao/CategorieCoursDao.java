package com.elmansouri.doctorant.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.elmansouri.doctorant.entities.CategorieCours;


@Stateless
public class CategorieCoursDao extends LocalDaoImpl<CategorieCours> {
	
	public CategorieCoursDao() {
		super(CategorieCours.class);
	}
	
	public CategorieCoursDao(Class<CategorieCours> entityClass) {
		super(entityClass);
	}

	@PersistenceContext(unitName = "doctorant")
	private EntityManager em;
	
	@Override
	protected EntityManager getEntityManager() {
		return em;
	}
	

}
