package com.elmansouri.doctorant.entities;

import java.io.Serializable;
import java.lang.Long;
import java.util.Date;
import javax.persistence.*;



@Entity
public class LigneEtiquette implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private Date dateAffectation;
	
	@ManyToOne
	private Cours cours;
	
	@ManyToOne
	private Etiquette etiquette;
	
	private static final long serialVersionUID = 1L;

	public LigneEtiquette() {
		super();
	}   
	
	//Getters Setters
	
	public Cours getCours() {
		return cours;
	}

	public void setCours(Cours cours) {
		this.cours = cours;
	}

	public Etiquette getEtiquette() {
		return etiquette;
	}

	public void setEtiquette(Etiquette etiquette) {
		this.etiquette = etiquette;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}   
	public Date getDateAffectation() {
		return this.dateAffectation;
	}

	public void setDateAffectation(Date dateAffectation) {
		this.dateAffectation = dateAffectation;
	}
   
}
