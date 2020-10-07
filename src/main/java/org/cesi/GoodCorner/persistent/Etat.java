package org.cesi.GoodCorner.persistent;

public class Etat {
	public static final Integer VIDE = 1;
	public static final Integer NEUF = 2;
	public static final Integer TRES_BON_ETAT = 3;
	public static final Integer BON_ETAT = 4;
	public static final Integer ETAT_SATISFAISANT = 5;
	
	private Integer id;
	private String libelle;
	
	/**
	 * @param id
	 * @param libelle
	 */
	public Etat(Integer id, String libelle) {
		this.id = id;
		this.libelle = libelle;
	}
	
	/**
	 * @param libelle
	 */
	public Etat(String libelle) {
		this.libelle = libelle;
	}
	
	/**
	 * 
	 */
	public Etat() {
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
}
