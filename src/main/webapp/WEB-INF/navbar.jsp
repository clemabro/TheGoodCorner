<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!-- Navigation -->
 <nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
   <div class="container">
     <a class="navbar-brand" href="<s:url value="list.action" namespace="/annonces"/>">The Good Corner</a>
     <ul class="navbar-nav">
	     <li class="nav-item">
	      	<a class="nav-link ml-4" href="#"><i class="fas fa-search"></i>  Rechercher</a>
	     </li>
     </ul>
     <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
       <span class="navbar-toggler-icon"></span>
     </button>
     <div class="collapse navbar-collapse" id="navbarResponsive"> 
       <ul class="navbar-nav ml-auto">
       	 <li class="nav-item">
           	<a class="nav-link" href="<s:url value="create.action" namespace="/annonces"/>"><i class="far fa-plus-square"></i>  Déposer une annonce</a>
         </li>
         <li class="nav-item">
           	<a class="nav-link" href="#"><i class="far fa-heart"></i>  Mes favoris</a>
         </li>
         <li class="nav-item">
         	<s:if test="#session['userMail'] != null">
           		<a class="nav-link" href="#"><i class="far fa-user"></i>  ${ sessionScope.userPrenom ***REMOVED*** ${ sessionScope.userNom ***REMOVED***</a>
           	</s:if>
         </li>
       </ul>
     </div>
   </div>
 </nav>