package org.cesi.GoodCorner.struts.login;

import org.cesi.GoodCorner.persistent.Utilisateur;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{
***REMOVED***
	 * 
***REMOVED***
	private static final long serialVersionUID = -2402013622636318013L;
	private Utilisateur userToCreate;

	public String connexion() {
		return SUCCESS;
***REMOVED***
	
	public String seConnecter() {
		return null;
***REMOVED***
	
	public String inscription() {
		return SUCCESS;
***REMOVED***
	
	public String sinscrire() {
		System.out.println(userToCreate.getMail());
		return null;
***REMOVED***

	public Utilisateur getUserToCreate() {
		return userToCreate;
***REMOVED***

	public void setUserToCreate(Utilisateur userToCreate) {
		this.userToCreate = userToCreate;
***REMOVED***
***REMOVED***
