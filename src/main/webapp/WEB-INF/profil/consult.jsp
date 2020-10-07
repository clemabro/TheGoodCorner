<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<jsp:include page="../header.jsp" >
  <jsp:param name="title" value="Profil" />
</jsp:include>

<link rel="stylesheet" href="<s:url value="/css/connexion.css" />">
<script type="text/javascript">

</script>
<body>
	<jsp:include page="../navbar.jsp"></jsp:include>
	
	<div class="row justify-content-center my-4">
		<div class="col-md-6 login-form">
			<h3 class="my-4"><s:property value="user.prenom" /> <s:property value="user.nom" /></h3>
			<hr>
			<div class="row justify-content-center">
				<div class="col-4">
					<button type="button" class="btn btn-outline-primary"><i class="far fa-file"></i> Mes annonces</button>
				</div>
				<div class="col-4">
					<s:form action="parametre" namespace="/profil">
						<button type="submit" class="btn btn-outline-primary"><i class="fas fa-cogs"></i> Paramètres</button>
					</s:form>
				</div>
			</div>
			<hr>
			<div class="row justify-content-center">
				<s:form action="deconnexion" namespace="/connexion">
					<button type="submit" class="btn btn-light"><i class="fas fa-sign-out-alt"></i> Me déconnecter</button>
				</s:form>
			</div>
		</div>
	</div>
	
	<jsp:include page="../footer.jsp"></jsp:include>
</body>
</html>