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
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2473313284113724600L;
	private List<Categorie> listeCategorie = new ArrayList<Categorie>();
	private List<Annonce> listeAnnonces = new ArrayList<Annonce>();
	private Integer idCategorie;
	private Categorie selectedCat;
	private Annonce annonce;
	private Integer idAnnonce;
	private Integer idTypeAnnonce;

	public String list() {
		HttpServletRequest request = ServletActionContext.getRequest();
		String userMail = (String) request.getSession().getAttribute("userMail");
		
		if(userMail != null) {
			listeCategorie = new DAOCategorie().getAll();
			if(idCategorie != null && !idCategorie.equals(0) && idTypeAnnonce != null && !idTypeAnnonce.equals(0)) {
				listeAnnonces = new DAOAnnonce().getByIdCategorieAndTypeAnnonce(idCategorie, idTypeAnnonce);
				selectedCat = new DAOCategorie().getById(idCategorie);
			} else {
				listeAnnonces = new DAOAnnonce().getAllByTypeAnnonce(idTypeAnnonce);
			}
			
			return SUCCESS;
		} else {
			return "denied";
		}
	}
	
	public String create() {
		HttpServletRequest request = ServletActionContext.getRequest();
		String userMail = (String) request.getSession().getAttribute("userMail");
		
		if(userMail != null) {
			listeCategorie = new DAOCategorie().getAll();
			return SUCCESS;
		} else {
			return "denied";
		}		
	}
	
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
			} else {
				return ERROR;
			}
		} else {
			return "denied";
		}
	}
	
	public String consult() {
		HttpServletRequest request = ServletActionContext.getRequest();
		String userMail = (String) request.getSession().getAttribute("userMail");
		
		if(userMail != null) {
			if(idAnnonce != null) {
				annonce = new DAOAnnonce().getById(idAnnonce);
				
				return SUCCESS;
			} else {
				return ERROR;
			}
		} else {
			return "denied";
		}
	}

	public List<Categorie> getListeCategorie() {
		return listeCategorie;
	}

	public void setListeCategorie(List<Categorie> listeCategorie) {
		this.listeCategorie = listeCategorie;
	}

	public List<Annonce> getListeAnnonces() {
		return listeAnnonces;
	}

	public void setListeAnnonces(List<Annonce> listeAnnonces) {
		this.listeAnnonces = listeAnnonces;
	}

	public Integer getIdCategorie() {
		return idCategorie;
	}

	public void setIdCategorie(Integer idCategorie) {
		this.idCategorie = idCategorie;
	}

	public Categorie getSelectedCat() {
		return selectedCat;
	}

	public void setSelectedCat(Categorie selectedCat) {
		this.selectedCat = selectedCat;
	}

	public Annonce getAnnonce() {
		return annonce;
	}

	public void setAnnonce(Annonce annonce) {
		this.annonce = annonce;
	}

	public Integer getIdAnnonce() {
		return idAnnonce;
	}

	public void setIdAnnonce(Integer idAnnonce) {
		this.idAnnonce = idAnnonce;
	}

	public Integer getIdTypeAnnonce() {
		return idTypeAnnonce;
	}

	public void setIdTypeAnnonce(Integer idTypeAnnonce) {
		this.idTypeAnnonce = idTypeAnnonce;
	}
}
