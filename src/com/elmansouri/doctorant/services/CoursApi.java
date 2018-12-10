package com.elmansouri.doctorant.services;

import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


import com.elmansouri.doctorant.dao.CoursDao;
import com.elmansouri.doctorant.entities.Cours;

@Path("/cours")
public class CoursApi {
	
	@EJB
	private CoursDao coursDao;
	
	public CoursApi() {}
	
	@GET
	@Path("/allCours")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Cours> getAll() {
		return coursDao.getAll();
	}
	
	@POST
	@Path("/addCours")
	@Produces(MediaType.APPLICATION_JSON)
	public void Ajouter(Cours C) {
		Cours cours = new Cours();
		cours.setTitre(C.getTitre());
		cours.setAuteur(C.getAuteur());
		cours.setDatePublication(C.getDatePublication());
		cours.setResume(C.getResume());
		cours.setProblematique(C.getProblematique());
		if(C.getTypeCours() != null) { cours.setTypeCours(C.getTypeCours()); }
		if(C.getCategorieCours() != null) { cours.setCategorieCours(C.getCategorieCours()); }
		coursDao.add(cours);
	}
	
	// Modifier
	@POST
	@Path("/updateCours")
	@Produces(MediaType.APPLICATION_JSON)
	public void Modifier(Cours C) {
		try {
			Cours cours = new Cours();
			if(C.getId() != null) {
				cours.setId(C.getId());
				cours.setTitre(C.getTitre());
				cours.setAuteur(C.getAuteur());
				cours.setDatePublication(C.getDatePublication());
				cours.setResume(C.getResume());
				cours.setProblematique(C.getProblematique());
				if(C.getTypeCours() != null) { cours.setTypeCours(C.getTypeCours()); }
				if(C.getCategorieCours() != null) { cours.setCategorieCours(C.getCategorieCours()); }
				coursDao.edit(cours);
			} else { System.out.println("Votre Operation est annulé"); } 
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	// Supprimer
	@POST
	@Path("/deleteCours")
	@Produces(MediaType.APPLICATION_JSON)
	public void Supprimer(Cours C) {
		try {
			coursDao.delete(C);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	

}
