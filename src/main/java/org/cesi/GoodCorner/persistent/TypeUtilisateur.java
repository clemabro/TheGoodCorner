package org.cesi.GoodCorner.persistent;

public class TypeUtilisateur {
	public final static Integer PARTICULIER = 1;
	public final static Integer PROFESSIONEL = 2;
	private Integer id;
	private String libelle;

	public TypeUtilisateur(Integer id, String libelle) {
		this.id = id;
		this.libelle = libelle;
	}

	public TypeUtilisateur(String libelle) {
		this.libelle = libelle;
	}

	public TypeUtilisateur() {
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
