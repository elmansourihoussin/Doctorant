package com.elmansouri.doctorant.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.elmansouri.doctorant.entities.ExtencienFichier;

@Stateless
public class ExtencienFichierDao extends LocalDaoImpl<ExtencienFichier> {
	
	public ExtencienFichierDao() {
		super(ExtencienFichier.class);
	}
	
	public ExtencienFichierDao(Class<ExtencienFichier> entityClass) {
		super(entityClass);
	}

	@PersistenceContext(unitName = "doctorant")
	private EntityManager em;
	
	@Override
	protected EntityManager getEntityManager() {
		return em;
	}
   
}
