<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<jsp:include page="../header.jsp" >
  <jsp:param name="title" value="Annonces" />
</jsp:include>

<link rel="stylesheet" href="<s:url value="/css/connexion.css" />">
<script type="text/javascript">

</script>
<body>
	<jsp:include page="../navbar.jsp"></jsp:include>
	
	<!-- Page Content -->
  <div class="container">

    <div class="row">

      <div class="col-lg-3 my-4">
      
        <div class="list-group mb-4">
        	<a href="<s:url value="list" />" class="list-group-item <s:if test="idCategorie == null || idCategorie == 0">active</s:if>">Tout</a>
        	<s:iterator value="listeCategorie" var="cat">
        		<s:url value="list" method="get" var="urlCat">
	        		<s:param name="idCategorie" value="#cat.id" />
	       		</s:url>
        		<a href="<s:property value="#urlCat"/>" class="list-group-item
        		<s:if test="idCategorie == #cat.id">active</s:if>
        		"><s:property value="libelle" /></a>
        	</s:iterator>          
        </div>

      </div>
      <!-- /.col-lg-3 -->

      <div class="col-lg-9">
      <h3 class="my-4">
      	<s:if test="selectedCat != null">
      		<s:property value="selectedCat.libelle"/>
      	</s:if>
      	<s:else>
      		Tout
      	</s:else>
      </h3>
        <div class="row">        	
        	<s:iterator value="listeAnnonces" var="annonce">
        		<s:url value="consult" method="get" var="urlAnnonce">
        			<s:param name="idAnnonce" value="#annonce.id" />
        		</s:url>
        		<div class="col-lg-4 col-md-6 mb-4 my-4">
		            <div class="card h-100">
		              <a href="<s:property value="#urlAnnonce"/>"><img class="card-img-top" src="<s:url value="%{#annonce.listePhotos.get(0).chemin***REMOVED***" />" 
		              	alt="" onError="$(this).attr('src','<s:url value="/img/not-found.png"/>')"></a>
		              <div class="card-body">
		                <h4 class="card-title">
		                  <a href="<s:property value="#urlAnnonce"/>"><s:property value="titre"/></a>
		                </h4>
		                <h5><s:property value="prix"/> €</h5>
		                <p class="card-text">
		                	<i class="fas fa-map-marked-alt"></i> <s:property value="ville" /><br>
		                	<s:property value="categorie.libelle"/>
		                </p>
		              </div>
		              <div class="card-footer">
		              	 <small class="text-muted"><s:property value="dateCreation"/></small>
		              </div>
		            </div>
		          </div>
        	</s:iterator>
        </div>
        <!-- /.row -->
        
        <s:if test="listeAnnonces.isEmpty()">
			<p class="my-4">Il n'y a pas d'annonces :(</p>
		</s:if>

      </div>
      <!-- /.col-lg-9 -->

    </div>
    <!-- /.row -->

  </div>
  <!-- /.container -->
	
	<jsp:include page="../footer.jsp"></jsp:include>
</body>
</html>