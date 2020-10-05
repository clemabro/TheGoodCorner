package org.cesi.GoodCorner.struts.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.cesi.GoodCorner.dao.DAOUtilisateur;
import org.cesi.GoodCorner.persistent.Utilisateur;
import org.json.JSONObject;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{
***REMOVED***
	 * 
***REMOVED***
	private static final long serialVersionUID = -2402013622636318013L;
	private Utilisateur userToCreate;
	private String mail;

	public String connexion() {
		if(mail == null) {
			setMail("");
***REMOVED***
		return SUCCESS;
***REMOVED***
	
	public String seConnecter() {
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
