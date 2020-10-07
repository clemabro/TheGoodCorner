package org.cesi.GoodCorner.persistent;

import java.util.Date;
import java.util.List;

public class Annonce {
	private Integer id;
	private String titre;
	private String description;
	private Integer prix;
	private String ville;
	private Date dateCreation;
	private Date dateUpdate;
	private Utilisateur utilisateur;
	private TypeAnnonce typeAnnonce;
	private Categorie categorie;
	private Etat etat;
	private List<Photo> listePhotos;
	
	/**
	 * @param id
	 * @param titre
	 * @param description
	 * @param prix
	 * @param ville
	 * @param dateCreation
	 * @param dateUpdate
	 * @param utilisateur
	 * @param typeAnnonce
	 * @param categorie
	 * @param etat
	 */
	public Annonce(Integer id, String titre, String description, Integer prix, String ville, Date dateCreation,
			Date dateUpdate, Utilisateur utilisateur, TypeAnnonce typeAnnonce, Categorie categorie, Etat etat, List<Photo> listePhotos) {
		this.id = id;
		this.titre = titre;
		this.description = description;
		this.prix = prix;
		this.ville = ville;
		this.dateCreation = dateCreation;
		this.dateUpdate = dateUpdate;
		this.utilisateur = utilisateur;
		this.typeAnnonce = typeAnnonce;
		this.categorie = categorie;
		this.etat = etat;
		this.listePhotos = listePhotos;
	}
	
	/**
	 * @param titre
	 * @param description
	 * @param prix
	 * @param ville
	 * @param dateCreation
	 * @param dateUpdate
	 * @param utilisateur
	 * @param typeAnnonce
	 * @param categorie
	 * @param etat
	 */
	public Annonce(String titre, String description, Integer prix, String ville, Date dateCreation, Date dateUpdate,
			Utilisateur utilisateur, TypeAnnonce typeAnnonce, Categorie categorie, Etat etat, List<Photo> listePhotos) {
		this.titre = titre;
		this.description = description;
		this.prix = prix;
		this.ville = ville;
		this.dateCreation = dateCreation;
		this.dateUpdate = dateUpdate;
		this.utilisateur = utilisateur;
		this.typeAnnonce = typeAnnonce;
		this.categorie = categorie;
		this.etat = etat;
		this.listePhotos = listePhotos;
	}
	
	/**
	 * 
	 */
	public Annonce() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitre() {
		return this.titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(Integer prix) {
		this.prix = prix;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public Date getDateUpdate() {
		return dateUpdate;
	}

	public void setDateUpdate(Date dateUpdate) {
		this.dateUpdate = dateUpdate;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public TypeAnnonce getTypeAnnonce() {
		return typeAnnonce;
	}

	public void setTypeAnnonce(TypeAnnonce typeAnnonce) {
		this.typeAnnonce = typeAnnonce;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	public Etat getEtat() {
		return etat;
	}

	public void setEtat(Etat etat) {
		this.etat = etat;
	}

	public List<Photo> getListePhotos() {
		return listePhotos;
	}

	public void setListePhotos(List<Photo> listePhotos) {
		this.listePhotos = listePhotos;
	}
}
