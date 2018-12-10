package com.elmansouri.doctorant.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.elmansouri.doctorant.entities.LigneEtiquette;

@Stateless
public class LigneEtiquetteDao extends LocalDaoImpl<LigneEtiquette> {
	
	public LigneEtiquetteDao() {
		super(LigneEtiquette.class);
	}
	
	public LigneEtiquetteDao(Class<LigneEtiquette> entityClass) {
		super(entityClass);
	}

	@PersistenceContext(unitName = "doctorant")
	private EntityManager em;
	
	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

}
