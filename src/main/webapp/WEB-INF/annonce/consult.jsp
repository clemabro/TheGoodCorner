<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<jsp:include page="../header.jsp" >
  <jsp:param name="title" value="Annonce" />
</jsp:include>

<link rel="stylesheet" href="<s:url value="/css/connexion.css" />">
<script type="text/javascript">

</script>
<body>
	<jsp:include page="../navbar.jsp"></jsp:include>
	
	<div class="row justify-content-center">
		<div class="col-md-6 login-form">
			<h3 class="my-4"><s:property value="annonce.titre" /></h3>
			<div class="row">
				<img src="<s:url value="%{annonce.listePhotos.get(0).chemin***REMOVED***" />" class="img-fluid" alt="" onerror="$(this).attr('src','<s:url value="/img/not-found.png"/>')">
			</div>
			<div class="row justify-content-between">
				<p><s:property value="annonce.prix" /> €</p><p>Créé le <s:property value="annonce.dateCreation" /> par <s:property value="annonce.utilisateur.nom" /> <s:property value="annonce.utilisateur.prenom" /></p>
			</div>
			<hr>
			<div class="row">
				<div class="col-4">
					<i class="fas fa-map-marked-alt"></i>&nbsp;&nbsp;<s:property value="annonce.ville" />
				</div>
				<div class="col-4">
					<i class="fas fa-align-justify"></i>&nbsp;&nbsp;<s:property value="annonce.categorie.libelle"/>
				</div>
			</div>
			<hr>
			<h2 class="my-4">Description</h2>
			<div class="row">
				<p class="lead"><s:property value="annonce.description"/></p>
			</div>
		</div>
	</div>
	
	<jsp:include page="../footer.jsp"></jsp:include>
</body>
</html>