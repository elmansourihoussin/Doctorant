package com.elmansouri.doctorant.entities;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;

import javax.persistence.*;


@Entity
public class Fichier implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private String file;
	private String description;
	
	@ManyToOne
	private TypeFichier typeFichier;
	
	@ManyToOne
	private ExtencienFichier extencienFichier;
	
	@ManyToOne
	private Cours cours;
	
	private static final long serialVersionUID = 1L;

	public Fichier() {
		super();
	}   
	
	//Getters Setters
	
	public TypeFichier getTypeFichier() {
		return typeFichier;
	}

	public void setTypeFichier(TypeFichier typeFichier) {
		this.typeFichier = typeFichier;
	}

	public ExtencienFichier getExtencienFichier() {
		return extencienFichier;
	}

	public void setExtencienFichier(ExtencienFichier extencienFichier) {
		this.extencienFichier = extencienFichier;
	}

	public Cours getCours() {
		return cours;
	}

	public void setCours(Cours cours) {
		this.cours = cours;
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
	public String getFile() {
		return this.file;
	}

	public void setFile(String file) {
		this.file = file;
	}   
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
   
}
