package com.elmansouri.doctorant.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.elmansouri.doctorant.entities.Contact;


@Stateless
public class ContactDao  extends LocalDaoImpl<Contact> {
	
	public ContactDao() {
		super(Contact.class);
	}
	
	public ContactDao(Class<Contact> entityClass) {
		super(entityClass);
	}

	@PersistenceContext(unitName = "doctorant")
	private EntityManager em;
	
	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

}
