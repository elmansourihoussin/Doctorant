package com.elmansouri.doctorant.services;

import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.elmansouri.doctorant.dao.ContactDao;
import com.elmansouri.doctorant.entities.Contact;

@Path("/contact")
public class ContactApi {
	
	@EJB
	private ContactDao contactDao;
	
	public ContactApi() { }
	
	//Methodes
	
	@GET
	@Path("/allContact")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Contact> getAll() {
		try {
			return contactDao.getAll();
		} catch (Exception e) {
			System.out.println("Erreur : " + e.getMessage());
			return null;
		}
	}


	
	

}
