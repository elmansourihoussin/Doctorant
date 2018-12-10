package com.elmansouri.doctorant.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.elmansouri.doctorant.entities.TypeFichier;


@Stateless
public class TypeFichierDao extends LocalDaoImpl<TypeFichier> {
	
	public TypeFichierDao() {
		super(TypeFichier.class);
	}
	
	public TypeFichierDao(Class<TypeFichier> entityClass) {
		super(entityClass);
	}

	@PersistenceContext(unitName = "doctorant")
	private EntityManager em;
	
	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

}
