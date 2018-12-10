package com.elmansouri.doctorant.services;

import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.elmansouri.doctorant.dao.CategorieCoursDao;
import com.elmansouri.doctorant.entities.CategorieCours;

@Path("/categorie")
public class CategorieCoursApi {
	
	@EJB
	private CategorieCoursDao categorieCoursDao;
	
	public CategorieCoursApi() {
		// TODO Auto-generated constructor stub
	}
	
	//Methodes
	@GET
	@Path("/allCategorieCours")
	@Produces(MediaType.APPLICATION_JSON)
	public List<CategorieCours> getAll() {
		try {
			return categorieCoursDao.getAll();
		} catch (Exception e) {
			System.out.println("Erreur : "+ e.getMessage());
			return null;
		}
	}

	
	

}
