package org.cesi.GoodCorner.persistent;

public class Categorie {
	private Integer id;
	private String libelle;

	public Categorie(Integer id, String libelle) {
		this.id = id;
		this.libelle = libelle;
	}

	public Categorie(String libelle) {
		this.libelle = libelle;
	}

	public Categorie() {
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
