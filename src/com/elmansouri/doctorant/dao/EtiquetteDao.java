package com.elmansouri.doctorant.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.elmansouri.doctorant.entities.Etiquette;


@Stateless
public class EtiquetteDao  extends LocalDaoImpl<Etiquette> {
	
	public EtiquetteDao() {
		super(Etiquette.class);
	}
	
	public EtiquetteDao(Class<Etiquette> entityClass) {
		super(entityClass);
	}

	@PersistenceContext(unitName = "doctorant")
	private EntityManager em;
	
	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

}
