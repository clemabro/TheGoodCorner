package org.cesi.GoodCorner.persistent;

import java.util.Date;

public class Annonce {
	private Integer id;
	private String titre;
	private String description;
	private Double prix;
	private String ville;
	private Date dateCreation;
	private Date dateUpdate;
	private Utilisateur utilisateur;
	private TypeAnnonce typeAnnonce;
	private Categorie categorie;
	private Etat etat;
	
***REMOVED***
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
***REMOVED***
	public Annonce(Integer id, String titre, String description, Double prix, String ville, Date dateCreation,
			Date dateUpdate, Utilisateur utilisateur, TypeAnnonce typeAnnonce, Categorie categorie, Etat etat) {
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
***REMOVED***
	
***REMOVED***
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
***REMOVED***
	public Annonce(String titre, String description, Double prix, String ville, Date dateCreation, Date dateUpdate,
			Utilisateur utilisateur, TypeAnnonce typeAnnonce, Categorie categorie, Etat etat) {
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
***REMOVED***
	
***REMOVED***
	 * 
***REMOVED***
	public Annonce() {
***REMOVED***

	public Integer getId() {
		return id;
***REMOVED***

	public void setId(Integer id) {
		this.id = id;
***REMOVED***

	public String getTitre() {
		return this.titre;
***REMOVED***

	public void setTitre(String titre) {
		this.titre = titre;
***REMOVED***

	public String getDescription() {
		return description;
***REMOVED***

	public void setDescription(String description) {
		this.description = description;
***REMOVED***

	public Double getPrix() {
		return prix;
***REMOVED***

	public void setPrix(Double prix) {
		this.prix = prix;
***REMOVED***

	public String getVille() {
		return ville;
***REMOVED***

	public void setVille(String ville) {
		this.ville = ville;
***REMOVED***

	public Date getDateCreation() {
		return dateCreation;
***REMOVED***

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
***REMOVED***

	public Date getDateUpdate() {
		return dateUpdate;
***REMOVED***

	public void setDateUpdate(Date dateUpdate) {
		this.dateUpdate = dateUpdate;
***REMOVED***

	public Utilisateur getUtilisateur() {
		return utilisateur;
***REMOVED***

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
***REMOVED***

	public TypeAnnonce getTypeAnnonce() {
		return typeAnnonce;
***REMOVED***

	public void setTypeAnnonce(TypeAnnonce typeAnnonce) {
		this.typeAnnonce = typeAnnonce;
***REMOVED***

	public Categorie getCategorie() {
		return categorie;
***REMOVED***

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
***REMOVED***

	public Etat getEtat() {
		return etat;
***REMOVED***

	public void setEtat(Etat etat) {
		this.etat = etat;
***REMOVED***
***REMOVED***
