<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<jsp:include page="../header.jsp" >
  <jsp:param name="title" value="Connexion" />
</jsp:include>

<link rel="stylesheet" href="<s:url value="/css/connexion.css" />">
<script type="text/javascript">
$(document).ready(function() {
	
});

var inscription = function(e) {
	e.preventDefault();
	$('#email').removeClass("inputRequired");
	$('#mdp').removeClass("inputRequired");
	
	mailAndMdpEmpty = false;
	
	if($('#email').val() == "" || !$("#email").val().includes('@') || !$("#email").val().includes('.')) {
		$('#email').addClass("inputRequired")
	} else if($('#mdp').val() == "") {
		$('#mdp').addClass("inputRequired")
	} else {
		mailAndMdpEmpty = true;
	}
	
	if(mailAndMdpEmpty) {
		$.ajax({
			method : "POST",
			url : "<s:url value="sinscrire.action" />",
			data : {
				"userToCreate.mail" : $('#email').val(),
				"userToCreate.motDePasse" : $('#mdp').val(),
				"userToCreate.nom" : $('#nom').val(),
				"userToCreate.prenom" : $('#prenom').val(),
				"userToCreate.telephone" : $('#tel').val(),
				"userToCreate.typeUtilisateur.id" : $('#groupTypeUser').find('input:checked').val()
			},
			success: function(data) {
				
				obj = JSON.parse(data);
				
				if(obj.Statut == "EXIST") {
					$('#textExist').show();
				} else {
					$('#mailHidden').attr('value', obj.mail);
				
					$('#redirect').submit();
				}
			}
		})
	}
}

</script>
<body>
	<jsp:include page="../navbar.jsp"></jsp:include>
	<div class="container login-container ">
		<div class="row justify-content-center">
	    	<div class="col-md-6 login-form ">
	            <h3><s:text name="Connexion.sinscrire" /></h3>
	            <form id="loginForm">
	                <div class="form-group">
	                    <input type="text" class="form-control" required id="email" placeholder="<s:text name="Connexion.email" />" value="" />
	                    <p id="textExist" class="text-danger" style="display:none;"><i class="fas fa-exclamation-circle"></i> Cette adresse mail est déjà utilisée</p>
	                </div>
	                <div class="form-group">
	                    <input type="password" class="form-control" required id="mdp" placeholder="<s:text name="Connexion.motDePasse" />" value="" />
	                </div>
	                <div class="form-group">
	                    <input type="text" class="form-control" id="nom" placeholder="<s:text name="Inscription.nom" />" value="" />
	                </div>
	                <div class="form-group">
	                    <input type="text" class="form-control" id="prenom" placeholder="<s:text name="Inscription.prenom" />" value="" />
	                </div>
	                <div class="form-group">
	                    <input type="text" class="form-control" id="tel" placeholder="<s:text name="Inscription.tel" />" value="" />
	                </div>
	                <label for="typeUser"><s:text name="Inscription.typeUser" /></label>
	                <div class="form-group" id="groupTypeUser">	                	
		                <div class="form-check form-check-inline">
						  <input class="form-check-input" type="radio" name="typeUser" id="particulier" checked value="1">
						  <label class="form-check-label" for="particulier"><s:text name="Inscription.particulier" /></label>
						</div>
						<div class="form-check form-check-inline">
						  <input class="form-check-input" type="radio" name="typeUser" id="pro" value="2">
						  <label class="form-check-label" for="pro"><s:text name="Inscription.pro" /></label>
						</div>
					</div>
	                <div class="form-group">
	                    <input type="submit" class="btnSubmit" onclick="inscription(event)" value="<s:text name="Connexion.sinscrire" />" />
	                </div>
	                <div class="form-group">
	                    <s:text name="Connexion.dejaUnCompte" /> <a href="<s:url value="connexion.action" />" class="ForgetPwd"><s:text name="Connexion.titre" /></a>
	                </div>
	            </form>
	        </div>
		</div>
	</div>
	<form id="redirect" action="connexion.action" method="POST">
		<input id="mailHidden" type="hidden" name="mail" value="">
	</form>
	<jsp:include page="../footer.jsp"></jsp:include>
</body>
</html>