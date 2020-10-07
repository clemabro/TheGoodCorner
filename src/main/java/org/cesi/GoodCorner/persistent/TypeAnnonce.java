package org.cesi.GoodCorner.persistent;

public class TypeAnnonce {
	public static final Integer OFFRE = 1;
	public static final Integer DEMANDE = 2;
	
	private Integer id;
	private String libelle;
	
	/**
	 * @param id
	 * @param libelle
	 */
	public TypeAnnonce(Integer id, String libelle) {
		this.id = id;
		this.libelle = libelle;
	}
	/**
	 * @param libelle
	 */
	public TypeAnnonce(String libelle) {
		this.libelle = libelle;
	}
	
	/**
	 * 
	 */
	public TypeAnnonce() {
		super();
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
