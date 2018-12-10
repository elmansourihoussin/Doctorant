package com.elmansouri.doctorant.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.elmansouri.doctorant.entities.TypeCours;


@Stateless
public class TypeCoursDao  extends LocalDaoImpl<TypeCours> {
	
	public TypeCoursDao() {
		super(TypeCours.class);
	}
	
	public TypeCoursDao(Class<TypeCours> entityClass) {
		super(entityClass);
	}

	@PersistenceContext(unitName = "doctorant")
	private EntityManager em;
	
	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

}
