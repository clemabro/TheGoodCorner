package org.cesi.GoodCorner.struts.profil;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.cesi.GoodCorner.dao.DAOUtilisateur;
import org.cesi.GoodCorner.persistent.Utilisateur;

import com.opensymphony.xwork2.ActionSupport;

public class ProfilAction extends ActionSupport {

***REMOVED***
	 * 
***REMOVED***
	private static final long serialVersionUID = -6688367970112940796L;
	private Utilisateur user;
	
	public String consult() {
		HttpServletRequest request = ServletActionContext.getRequest();
		String userMail = (String) request.getSession().getAttribute("userMail");
		
		if(userMail != null) {
			user = new DAOUtilisateur().getByMail(userMail);
			
			return SUCCESS;
***REMOVED*** else {
			return "denied";
***REMOVED***
***REMOVED***

	public Utilisateur getUser() {
		return user;
***REMOVED***

	public void setUser(Utilisateur user) {
		this.user = user;
***REMOVED***
***REMOVED***
