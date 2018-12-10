package com.elmansouri.doctorant.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.elmansouri.doctorant.entities.Fichier;

@Stateless
public class FichierDao extends LocalDaoImpl<Fichier> {
	
	public FichierDao() {
		super(Fichier.class);
	}
	
	public FichierDao(Class<Fichier> entityClass) {
		super(entityClass);
	}

	@PersistenceContext(unitName = "doctorant")
	private EntityManager em;
	
	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

}
