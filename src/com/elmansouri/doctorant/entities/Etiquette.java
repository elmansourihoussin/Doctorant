package com.elmansouri.doctorant.entities;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;


@Entity
public class Etiquette implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private String couleur;
	private String description;
	
	@OneToMany(mappedBy="etiquette")
	private List<LigneEtiquette> ligneEtiquettes = new ArrayList<LigneEtiquette>();
	
	private static final long serialVersionUID = 1L;

	public Etiquette() {
		super();
	}   
	
	//Getters Setters
	
	public List<LigneEtiquette> getLigneEtiquettes() {
		return ligneEtiquettes;
	}

	public void setLigneEtiquettes(List<LigneEtiquette> ligneEtiquettes) {
		this.ligneEtiquettes = ligneEtiquettes;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}   
	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}   
	public String getCouleur() {
		return this.couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}   
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
   
}
