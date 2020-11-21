<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">

	<link rel="stylesheet" type="text/css" href="css/card.css">
</head>
<body>
<div class="container">
        <h5 class="section-title h1">SERVICIOS</h5>
        <div >
  			<br><br>
            <div>
            <form action="ClienteServlet?action=login" method="post">
					<button  type="submit"  class="btn btn-primary">Login</button>
					</form>
            	 
            </div>
            <br>

            <div >
            	<form action="ClienteServlet?action=registro" method="post">
					<button  type="submit"  class="btn btn-primary">Registro</button>
					</form>
            </div>
        </div>
        
        <div class="container">
			<c:forEach var="tienda" items="${lista}">				
					<div class="card">						
					<img src="<c:out value="${tienda.imagen}"/>">
					<h4><c:out value="${tienda.nombre}"/></h4>
					<label><c:out value="${tienda.lema}"/></label>
					
					<a href="https://www.facebook.com/">FaceBook</a>				
						
					
				
										
									
				    </div>
			</c:forEach>
					
	</div>
</div>




       <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
</body>
</html>