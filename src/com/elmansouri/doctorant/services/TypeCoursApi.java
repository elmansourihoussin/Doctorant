package com.elmansouri.doctorant.services;

import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.elmansouri.doctorant.dao.TypeCoursDao;
import com.elmansouri.doctorant.entities.TypeCours;

@Path("/type")
public class TypeCoursApi {
	
	@EJB
	private TypeCoursDao typeCoursDao;
	
	public TypeCoursApi() {
		// TODO Auto-generated constructor stub
	}
	
	//Methodes
	@GET
	@Path("/allTypeCours")
	@Produces(MediaType.APPLICATION_JSON)
	public List<TypeCours> getAll() {
		try {
		  return typeCoursDao.getAll();
		} catch (Exception e) {
			System.out.println("Erreur : " + e.getMessage());
			return null;
		}
	}
	
	
	
	

}
