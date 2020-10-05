package org.cesi.GoodCorner.persistent;

public class Etat {
	public static final Integer VIDE = 1;
	public static final Integer NEUF = 2;
	public static final Integer TRES_BON_ETAT = 3;
	public static final Integer BON_ETAT = 4;
	public static final Integer ETAT_SATISFAISANT = 5;
	
	private Integer id;
	private String libelle;
	
***REMOVED***
	 * @param id
	 * @param libelle
***REMOVED***
	public Etat(Integer id, String libelle) {
		this.id = id;
		this.libelle = libelle;
***REMOVED***
	
***REMOVED***
	 * @param libelle
***REMOVED***
	public Etat(String libelle) {
		this.libelle = libelle;
***REMOVED***
	
***REMOVED***
	 * 
***REMOVED***
	public Etat() {
***REMOVED***
	
	public Integer getId() {
		return id;
***REMOVED***
	public void setId(Integer id) {
		this.id = id;
***REMOVED***
	public String getLibelle() {
		return libelle;
***REMOVED***
	public void setLibelle(String libelle) {
		this.libelle = libelle;
***REMOVED***
***REMOVED***
