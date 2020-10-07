package org.cesi.GoodCorner.persistent;

public class AnnonceUtilisateur {
	private Annonce annonce;
	private Utilisateur utilisateur;
	/**
	 * @param annonce
	 * @param utilisateur
	 */
	public AnnonceUtilisateur(Annonce annonce, Utilisateur utilisateur) {
		this.annonce = annonce;
		this.utilisateur = utilisateur;
	}

	public AnnonceUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public AnnonceUtilisateur(Annonce annonce) {
		this.annonce = annonce;
	}

	public AnnonceUtilisateur() {
	}

	public Annonce getAnnonce() {
		return annonce;
	}

	public void setAnnonce(Annonce annonce) {
		this.annonce = annonce;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
}
