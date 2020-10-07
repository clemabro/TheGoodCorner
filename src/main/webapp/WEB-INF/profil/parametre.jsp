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
	            <h3>Paramètres</h3>
	            <s:form action="saveProfil" namespece="/profil">
	                <div class="form-group">
	                    <input type="text" class="form-control" required id="email" disabled placeholder="<s:text name="Connexion.email" />" value="<s:property value="user.mail"/>" />
	                </div>
	                <div class="form-group">
	                    <input type="password" class="form-control" required id="mdp" name="user.motDePasse" placeholder="<s:text name="Connexion.motDePasse" />" value="<s:property value="user.motDePasse"/>" />
	                </div>
	                <div class="form-group">
	                    <input type="text" class="form-control" id="nom" name="user.nom" placeholder="<s:text name="Inscription.nom" />" value="<s:property value="user.nom"/>" />
	                </div>
	                <div class="form-group">
	                    <input type="text" class="form-control" id="prenom" name="user.prenom" placeholder="<s:text name="Inscription.prenom" />" value="<s:property value="user.prenom"/>" />
	                </div>
	                <div class="form-group">
	                    <input type="text" class="form-control" id="tel" name="user.telephone" placeholder="<s:text name="Inscription.tel" />" value="<s:property value="user.telephone"/>" />
	                </div>
	                <label for="typeUser"><s:text name="Inscription.typeUser" /></label>
	                <div class="form-group" id="groupTypeUser">	                	
		                <div class="form-check form-check-inline">
						  <input class="form-check-input" type="radio" name="user.typeUtilisateur.id" id="particulier" <s:if test="user.typeUtilisateur.id == 1">checked</s:if> value="1">
						  <label class="form-check-label" for="particulier"><s:text name="Inscription.particulier" /></label>
						</div>
						<div class="form-check form-check-inline">
						  <input class="form-check-input" type="radio" name="user.typeUtilisateur.id" id="pro" <s:if test="user.typeUtilisateur.id == 2">checked</s:if> value="2">
						  <label class="form-check-label" for="pro"><s:text name="Inscription.pro" /></label>
						</div>
					</div>
	                <div class="form-group">
	                    <input type="submit" class="btnSubmit" value="Enregistrer" />
	                </div>
	            </s:form>
	        </div>
		</div>
	</div>
	<form id="redirect" action="connexion.action" method="POST">
		<input id="mailHidden" type="hidden" name="mail" value="">
	</form>
	<jsp:include page="../footer.jsp"></jsp:include>
</body>
</html>