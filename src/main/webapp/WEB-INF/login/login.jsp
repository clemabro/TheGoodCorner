<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<jsp:include page="../header.jsp" >
  <jsp:param name="title" value="Connexion" />
</jsp:include>

<link rel="stylesheet" href="<s:url value="/css/connexion.css" />">
<script type="text/javascript">
$(document).ready(function() {
	
***REMOVED***);

var seConnecter = function(e) {
	e.preventDefault();
	
	mailAndMdpEmpty = false;
	
	if($('#email').val() == "") {
		$('#email').addClass("inputRequired")
***REMOVED*** else if($('#mdp').val() == "") {
		$('#mdp').addClass("inputRequired")
***REMOVED*** else {
		mailAndMdpEmpty = true;
***REMOVED***
	
	if(mailAndMdpEmpty) {
		$.ajax({
			method : "POST",
			url : "",
			data : {
				login : $('#email').val(),
				mdp : $('#mdp').val()
***REMOVED***,
			success: function() {
				
***REMOVED***
***REMOVED***)
***REMOVED***
***REMOVED***

</script>
<body>
	<jsp:include page="../navbar.jsp"></jsp:include>
	<div class="container login-container ">
		<div class="row justify-content-center">
	    	<div class="col-md-6 login-form ">
	            <h3><s:text name="Connexion.titre" /></h3>
	            <form id="loginForm">
	                <div class="form-group">
	                    <input type="text" class="form-control" required id="email" placeholder="<s:text name="Connexion.email" />" value="<s:property value="mail" />" />
	                </div>
	                <div class="form-group">
	                    <input type="password" class="form-control" required id="mdp" placeholder="<s:text name="Connexion.motDePasse" />" value="" />
	                </div>
	                <div class="form-group">
	                    <input type="submit" class="btnSubmit" onclick="seConnecter(event)" value="<s:text name="Connexion.submit" />" />
	                </div>
	                <div class="form-group">
	                    <a href="#" class="ForgetPwd"><s:text name="Connexion.mdpOublie" /></a>
	                </div>
	                <div class="form-group">
	                    Pas de compte ? <a href="<s:url value="inscription.action" />" class="ForgetPwd"><s:text name="Connexion.sinscrire" /></a>
	                </div>
	            </form>
	        </div>
		</div>
	</div>
	<jsp:include page="../footer.jsp"></jsp:include>
</body>
</html>