<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!-- Navigation -->
 <nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
   <div class="container">
   	 <s:url value="/annonces/list.action" namespace="annonces" var="urlList">
   	 	<s:param name="idTypeAnnonce" value="1" />
   	 </s:url>
     <a class="navbar-brand" href="<s:if test="#session['userMail'] != null"><s:property value="urlList" /></s:if>">The Good Corner</a>
     <s:if test="#session['userMail'] != null">
	     <ul class="navbar-nav">
		     <li class="nav-item">
		      	<a class="nav-link ml-4" href="#"><i class="fas fa-search"></i>  Rechercher</a>
		     </li>
	     </ul>
     </s:if>
     <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
       <span class="navbar-toggler-icon"></span>
     </button>
     <div class="collapse navbar-collapse" id="navbarResponsive">
     	<s:if test="#session['userMail'] != null">
       <ul class="navbar-nav ml-auto">
       	 <li class="nav-item">
           	<a class="nav-link" href="<s:url value="/annonces/create.action" namespace="/annonces"/>"><i class="far fa-plus-square"></i>  Déposer une annonce</a>
         </li>
         <li class="nav-item">
           	<a class="nav-link" href="#"><i class="far fa-heart"></i>  Mes favoris</a>
         </li>
         <li class="nav-item">
         	<s:if test="#session['userMail'] != null">
           		<a class="nav-link" href="<s:url value="/profil/consult.action"/>"><i class="far fa-user"></i>  ${ sessionScope.userPrenom } ${ sessionScope.userNom }</a>
           	</s:if>
         </li>
       </ul>
       </s:if>
     </div>
   </div>
 </nav>