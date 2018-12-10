package com.elmansouri.doctorant.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.Query;

@Stateless
public abstract class LocalDaoImpl<T> implements LocalDao<T> {

	private Class<T> entityClass;
	protected abstract EntityManager getEntityManager();
	
	public LocalDaoImpl(Class<T> entityClass){
		super();
		this.entityClass=entityClass;
	}
	
	
	//Methode Ajouter
	public void add(T t){
		try {
			 getEntityManager().persist(t);
		} catch (Exception e) {
		}
	}
	

	//Methode Modifier
		public void edit(T t){
			try {
				getEntityManager().merge(t);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	
	//Methode Supprimer
	public void delete(T t){
		try {
			t = getEntityManager().merge(t);
			getEntityManager().remove(t);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	//Methode Recherche
	public T find(long id){
		try {
			T t=getEntityManager().find(entityClass, id);
			if(t == null) throw new RuntimeException("Intrevable!");
			return t;
		} catch (Exception e) {
			return null;
		}
	}
	
	//Methode Affichage
	@SuppressWarnings("unchecked")
	public List<T> getAll(){
		try {
			Query query=getEntityManager().createQuery("Select u from " + entityClass.getName() + " u ");
			return query.getResultList();
		} catch (Exception e) {
			return null;
		}
	}
	
	
}
