package org.cesi.GoodCorner.struts.annonces;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.cesi.GoodCorner.dao.DAOCategorie;
import org.cesi.GoodCorner.persistent.Categorie;

import com.opensymphony.xwork2.ActionSupport;

public class AnnonceAction extends ActionSupport {
	
***REMOVED***
	 * 
***REMOVED***
	private static final long serialVersionUID = -2473313284113724600L;
	private List<Categorie> listeCategorie = new ArrayList<Categorie>();

	public String list() {
		HttpServletRequest request = ServletActionContext.getRequest();
		String userMail = (String) request.getSession().getAttribute("userMail");
		
		if(userMail != null) {
			listeCategorie = new DAOCategorie().getAll();
			
			return SUCCESS;
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
***REMOVED***
