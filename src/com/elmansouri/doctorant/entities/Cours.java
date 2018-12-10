package com.elmansouri.doctorant.entities;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

import org.codehaus.jackson.annotate.JsonIgnore;


@Entity
public class Cours implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String titre;
	private String auteur;
	
	@Temporal(TemporalType.DATE)
	private Date datePublication;
	private String resume;
	private String problematique;
	
	@ManyToOne
	private TypeCours typeCours;
	
	@ManyToOne
	private CategorieCours categorieCours;
	
	@OneToMany(mappedBy="cours")
	@JsonIgnore
	private List<Fichier> fichiers = new ArrayList<Fichier>();
	
	@OneToMany(mappedBy="cours")
	@JsonIgnore
	private List<LigneEtiquette> ligneEtiquettes = new ArrayList<LigneEtiquette>();
	
	private static final long serialVersionUID = 1L;

	public Cours() {
		super();
	}   
	
	//Getters Setters
	
	public TypeCours getTypeCours() {
		return typeCours;
	}

	public void setTypeCours(TypeCours typeCours) {
		this.typeCours = typeCours;
	}

	public CategorieCours getCategorieCours() {
		return categorieCours;
	}

	public void setCategorieCours(CategorieCours categorieCours) {
		this.categorieCours = categorieCours;
	}

	public List<Fichier> getFichiers() {
		return fichiers;
	}

	public void setFichiers(List<Fichier> fichiers) {
		this.fichiers = fichiers;
	}

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
	public String getTitre() {
		return this.titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}   
	public String getAuteur() {
		return this.auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}   
	public Date getDatePublication() {
		return this.datePublication;
	}

	public void setDatePublication(Date datePublication) {
		this.datePublication = datePublication;
	}   
	public String getResume() {
		return this.resume;
	}

	public void setResume(String resume) {
		this.resume = resume;
	}   
	public String getProblematique() {
		return this.problematique;
	}

	public void setProblematique(String problematique) {
		this.problematique = problematique;
	}
   
}
