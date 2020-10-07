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

var seConnecter = function(e) {
	e.preventDefault();
	
	$('#email').removeClass("inputRequired");
	$('#mdp').removeClass("inputRequired");
	
	$('#mailExist').hide();
	$('#mdpExist').hide();
	
	mailAndMdpEmpty = false;
	
	if($('#email').val() == "") {
		$('#email').addClass("inputRequired")
	} else if($('#mdp').val() == "") {
		$('#mdp').addClass("inputRequired")
	} else {
		mailAndMdpEmpty = true;
	}
	
	if(mailAndMdpEmpty) {
		$.ajax({
			method : "POST",
			url : "<s:url value="seConnecter.action" />",
			data : {
				"userToCreate.mail" : $('#email').val(),
				"userToCreate.motDePasse" : $('#mdp').val()
			},
			success: function(data) {
				console.log(data);
				
				obj = JSON.parse(data);
				
				if(obj.exist) {
					if(obj.mdpOK) {
						$('#redirectList').submit();
					} else {
						$('#mdpExist').show();
						$('#mdp').addClass("inputRequired")
					}
				} else {
					$('#mailExist').show();
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
	            <h3><s:text name="Connexion.titre" /></h3>
	            <form id="loginForm">
	                <div class="form-group">
	                    <input type="text" class="form-control" required id="email" placeholder="<s:text name="Connexion.email" />" value="<s:property value="mail" />" />
	                    <p id="mailExist" class="text-danger" style="display:none;"><i class="fas fa-exclamation-circle"></i> Cette adresse mail est incorect</p>
	                </div>
	                <div class="form-group">
	                    <input type="password" class="form-control" required id="mdp" placeholder="<s:text name="Connexion.motDePasse" />" value="" />
	                    <p id="mdpExist" class="text-danger" style="display:none;"><i class="fas fa-exclamation-circle"></i> Mot de passe incorect</p>
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
	<s:form id="redirectList" action="list" namespace="/annonces">
		<input type="hidden" name="idTypeAnnonce" value="1">
	</s:form>
	<jsp:include page="../footer.jsp"></jsp:include>
</body>
</html>