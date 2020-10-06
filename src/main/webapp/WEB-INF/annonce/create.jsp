<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<jsp:include page="../header.jsp" >
  <jsp:param name="title" value="Déposer annonce" />
</jsp:include>

<link rel="stylesheet" href="<s:url value="/css/connexion.css" />">
<script type="text/javascript">

</script>
<body>
	<jsp:include page="../navbar.jsp"></jsp:include>
	
	<div class="row justify-content-center">
		<div class="col-md-6 login-form">
			<h3 class="my-4">Déposer une annonce</h3>
			<s:form action="saveAnnonce" namespace="/annonces">
			  <div class="form-group">
			    <label for="exampleFormControlInput1">Titre de l'annonce</label>
			    <input type="text" class="form-control" name="annonce.titre" required id="titre" placeholder="Ma super annonce">
			  </div>
			  <label for="typeAnnonce">Type d'annonce</label>
			  <div class="form-group" id="groupTypeAnnonce">	                	
	              <div class="form-check form-check-inline">
				  <input class="form-check-input" type="radio" name="annonce.typeAnnonce.id" name="typeAnnonce" id="offre" checked value="1">
				  <label class="form-check-label" for="offre">Offre</label>
				</div>
				<div class="form-check form-check-inline">
				  <input class="form-check-input" type="radio" name="annonce.typeAnnonce.id" id="demande" value="2">
				  <label class="form-check-label" for="demande">Demande</label>
				</div>
			</div>
			  <div class="form-group">
			    <label for="categorie">Catégorie de l'annonce</label>
			    <select class="form-control" id="categorie" name="annonce.categorie.id">
			    	<s:iterator value="listeCategorie">
			    		<option value="<s:property value="id" />"><s:property value="libelle" /></option>
			    	</s:iterator>
			    </select>
			  </div>
			  <div class="form-row">
			    <div class="col">
			      <label for="prix">Prix</label>
			      <input type="number" step="1" min="0" class="form-control" name="annonce.prix" required id="prix" placeholder="">
			    </div>
			    <div class="col">
			      <label for="ville">Ville</label>
			      <input type="text" class="form-control" name="annonce.ville" required id="ville" placeholder="Paris">
			    </div>
			  </div>
			  <div class="form-group">
			    <label for="description">Description de l'annonce</label>
			    <textarea class="form-control" id="description" rows="3" name="annonce.description" placeholder="Description de ma super annonce" maxlength="255"></textarea>
			  </div>
			  <div class="form-group">
                   <input type="submit" class="btnSubmit" value="Déposer" />
               </div>
			</s:form>
		</div>
	</div>
	<jsp:include page="../footer.jsp"></jsp:include>
</body>
</html>