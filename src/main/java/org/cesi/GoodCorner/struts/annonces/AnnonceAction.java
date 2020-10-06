package org.cesi.GoodCorner.struts.annonces;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class AnnonceAction extends ActionSupport {
	
***REMOVED***
	 * 
***REMOVED***
	private static final long serialVersionUID = -2473313284113724600L;

	public String list() {
		HttpServletRequest request = ServletActionContext.getRequest();
		String userMail = (String) request.getSession().getAttribute("userMail");
		
		if(userMail != null) {
			return SUCCESS;
***REMOVED*** else {
			return "denied";
***REMOVED***
***REMOVED***
***REMOVED***
