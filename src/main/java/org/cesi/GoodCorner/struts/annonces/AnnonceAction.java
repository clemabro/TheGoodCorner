package org.cesi.GoodCorner.struts.annonces;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.cesi.GoodCorner.dao.DAOAnnonce;
import org.cesi.GoodCorner.dao.DAOCategorie;
import org.cesi.GoodCorner.persistent.Annonce;
import org.cesi.GoodCorner.persistent.Categorie;
import org.cesi.GoodCorner.persistent.Utilisateur;

import com.opensymphony.xwork2.ActionSupport;

public class AnnonceAction extends ActionSupport {
	
***REMOVED***
	 * 
***REMOVED***
	private static final long serialVersionUID = -2473313284113724600L;
	private List<Categorie> listeCategorie = new ArrayList<Categorie>();
	private List<Annonce> listeAnnonces = new ArrayList<Annonce>();
	private Integer idCategorie;
	private Categorie selectedCat;
	private Annonce annonce;

	public String list() {
		HttpServletRequest request = ServletActionContext.getRequest();
		String userMail = (String) request.getSession().getAttribute("userMail");
		
		if(userMail != null) {
			listeCategorie = new DAOCategorie().getAll();
			if(idCategorie != null && !idCategorie.equals(0)) {
				listeAnnonces = new DAOAnnonce().getByIdCategorie(idCategorie);
				selectedCat = new DAOCategorie().getById(idCategorie);
***REMOVED*** else {
				listeAnnonces = new DAOAnnonce().getAll();
***REMOVED***
			
			return SUCCESS;
***REMOVED*** else {
			return "denied";
***REMOVED***
***REMOVED***
	
	public String create() {
		HttpServletRequest request = ServletActionContext.getRequest();
		String userMail = (String) request.getSession().getAttribute("userMail");
		
		if(userMail != null) {
			listeCategorie = new DAOCategorie().getAll();
			return SUCCESS;
***REMOVED*** else {
			return "denied";
***REMOVED***		
***REMOVED***
	
	public String saveAnnonce() {
		HttpServletRequest request = ServletActionContext.getRequest();
		String userMail = (String) request.getSession().getAttribute("userMail");
		
		if(userMail != null) {
			if(annonce != null) {
				Utilisateur user = new Utilisateur();
				user.setMail(userMail);
				annonce.setUtilisateur(user);
				new DAOAnnonce().create(annonce);
				return SUCCESS;
***REMOVED*** else {
				return ERROR;
***REMOVED***
***REMOVED*** else {
			return "denied";
***REMOVED***
***REMOVED***

	public List<Categorie> getListeCategorie() {
		return listeCategorie;
***REMOVED***

	public void setListeCategorie(List<Categorie> listeCategorie) {
		this.listeCategorie = listeCategorie;
***REMOVED***

	public List<Annonce> getListeAnnonces() {
		return listeAnnonces;
***REMOVED***

	public void setListeAnnonces(List<Annonce> listeAnnonces) {
		this.listeAnnonces = listeAnnonces;
***REMOVED***

	public Integer getIdCategorie() {
		return idCategorie;
***REMOVED***

	public void setIdCategorie(Integer idCategorie) {
		this.idCategorie = idCategorie;
***REMOVED***

	public Categorie getSelectedCat() {
		return selectedCat;
***REMOVED***

	public void setSelectedCat(Categorie selectedCat) {
		this.selectedCat = selectedCat;
***REMOVED***

	public Annonce getAnnonce() {
		return annonce;
***REMOVED***

	public void setAnnonce(Annonce annonce) {
		this.annonce = annonce;
***REMOVED***
***REMOVED***
