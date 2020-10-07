package org.cesi.GoodCorner.struts.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.cesi.GoodCorner.dao.DAOUtilisateur;
import org.cesi.GoodCorner.persistent.Utilisateur;
import org.json.JSONObject;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
***REMOVED***
	 * 
***REMOVED***
	private static final long serialVersionUID = -2402013622636318013L;
	private Utilisateur userToCreate;
	private String mail;

	public String connexion() {
		HttpServletRequest request = ServletActionContext.getRequest();
		String userMail = (String) request.getSession().getAttribute("userMail");
		
		if(userMail != null) {
			return "list";
***REMOVED***
		
		if(mail == null) {
			setMail("");
***REMOVED***
		return SUCCESS;
***REMOVED***
	
	public String seConnecter() throws IOException {
		HttpServletResponse response = ServletActionContext.getResponse();
		HttpServletRequest request = ServletActionContext.getRequest();
		DAOUtilisateur user_dao = new DAOUtilisateur();
		
		JSONObject jsObject = new JSONObject();
		if(userToCreate != null) {
			Utilisateur user =  user_dao.getByMail(userToCreate.getMail());
			if(user != null) {
				jsObject.put("exist", true);
				
				if(user.getMotDePasse().equals(userToCreate.getMotDePasse())) {
					jsObject.put("mdpOK", true);
					HttpSession session = request.getSession();
					session.setAttribute("userMail", user.getMail());
					session.setAttribute("userNom", user.getNom());
					session.setAttribute("userPrenom", user.getPrenom());
	***REMOVED*** else {
					jsObject.put("mdpOK", false);
	***REMOVED***
***REMOVED*** else {
				jsObject.put("exist", false);
***REMOVED***
			
***REMOVED*** else {
			jsObject.put("exist", false);
***REMOVED***
		
		PrintWriter out = response.getWriter();
		jsObject.write(out);
		
		return null;
***REMOVED***
	
	public String inscription() {		
		return SUCCESS;
***REMOVED***
	
	public String sinscrire() throws IOException {
		HttpServletResponse response = ServletActionContext.getResponse();
		
		DAOUtilisateur dao_user = new DAOUtilisateur();
		Utilisateur exist_user = dao_user.getByMail(userToCreate.getMail());
		
		JSONObject jsObject = new JSONObject();
		if(exist_user == null) {
			dao_user.create(userToCreate);
			jsObject.put("Statut", "OK");
			jsObject.put("mail", userToCreate.getMail());
***REMOVED*** else {
			jsObject.put("Statut", "EXIST");
***REMOVED***
		
		
		PrintWriter out = response.getWriter();
		jsObject.write(out);
		
		return null;
***REMOVED***
	
	public String deconnexion() {
		HttpServletRequest request = ServletActionContext.getRequest();
		String userMail = (String) request.getSession().getAttribute("userMail");
		
		if(userMail != null) {
			HttpSession session = request.getSession();
			session.invalidate();
			
			if(mail == null) {
				setMail("");
***REMOVED***
			
			return SUCCESS;
***REMOVED*** else {
			return ERROR;
***REMOVED***
***REMOVED***

	public Utilisateur getUserToCreate() {
		return userToCreate;
***REMOVED***

	public void setUserToCreate(Utilisateur userToCreate) {
		this.userToCreate = userToCreate;
***REMOVED***

	public String getMail() {
		return mail;
***REMOVED***

	public void setMail(String mail) {
		this.mail = mail;
***REMOVED***
***REMOVED***
