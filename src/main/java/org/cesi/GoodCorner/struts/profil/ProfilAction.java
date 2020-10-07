package org.cesi.GoodCorner.struts.profil;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.cesi.GoodCorner.dao.DAOUtilisateur;
import org.cesi.GoodCorner.persistent.Utilisateur;

import com.opensymphony.xwork2.ActionSupport;

public class ProfilAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6688367970112940796L;
	private Utilisateur user;
	
	public String consult() {
		HttpServletRequest request = ServletActionContext.getRequest();
		String userMail = (String) request.getSession().getAttribute("userMail");
		
		if(userMail != null) {
			user = new DAOUtilisateur().getByMail(userMail);
			
			return SUCCESS;
		} else {
			return "denied";
		}
	}
	
	public String parametre() {
		HttpServletRequest request = ServletActionContext.getRequest();
		String userMail = (String) request.getSession().getAttribute("userMail");
		
		if(userMail != null) {
			user = new DAOUtilisateur().getByMail(userMail);
			
			return SUCCESS;
		} else {
			return "denied";
		}
	}
	
	public String saveProfil() {
		HttpServletRequest request = ServletActionContext.getRequest();
		String userMail = (String) request.getSession().getAttribute("userMail");
		
		if(userMail != null) {
			user.setMail(userMail);
			if(user != null && user.getMail() != null && !user.getMail().isEmpty()) {
				new DAOUtilisateur().update(user);
				
				HttpSession session = request.getSession();
				session.setAttribute("userNom", user.getNom());
				session.setAttribute("userPrenom", user.getPrenom());
			}
			
			return SUCCESS;
		} else {
			return ERROR;
		}
	}

	public Utilisateur getUser() {
		return user;
	}

	public void setUser(Utilisateur user) {
		this.user = user;
	}
}
