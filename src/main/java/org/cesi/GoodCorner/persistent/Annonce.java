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

	public double getPrix() {
		return prix;
***REMOVED***

	public void setPrix(Integer prix) {
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

	public List<Photo> getListePhotos() {
		return listePhotos;
***REMOVED***

	public void setListePhotos(List<Photo> listePhotos) {
		this.listePhotos = listePhotos;
***REMOVED***
***REMOVED***
