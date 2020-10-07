package org.cesi.GoodCorner.persistent;

public class Utilisateur {
	private String mail;
	private String motDePasse;
	private String nom;
	private String prenom;
	private String telephone;
	private TypeUtilisateur typeUtilisateur;
	
	/**
	 * @param mail
	 * @param motDePasse
	 * @param nom
	 * @param prenom
	 * @param telephone
	 * @param typeUtilisateur
	 */
	public Utilisateur(String mail, String motDePasse, String nom, String prenom, String telephone,
			TypeUtilisateur typeUtilisateur) {
		super();
		this.mail = mail;
		this.motDePasse = motDePasse;
		this.nom = nom;
		this.prenom = prenom;
		this.telephone = telephone;
		this.typeUtilisateur = typeUtilisateur;
	}

	/**
	 * 
	 */
	public Utilisateur() {
		super();
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public TypeUtilisateur getTypeUtilisateur() {
		return typeUtilisateur;
	}

	public void setTypeUtilisateur(TypeUtilisateur typeUtilisateur) {
		this.typeUtilisateur = typeUtilisateur;
	}
}
