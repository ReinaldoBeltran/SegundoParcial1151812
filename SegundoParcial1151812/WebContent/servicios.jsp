<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">

	<link rel="stylesheet" type="text/css" href="css/card.css">
</head>
<body>
<div class="container">
        <h5 class="section-title h1">SERVICIOS</h5>        
        
        <div class="container">
			<c:forEach var="servicio" items="${listaS}">				
					<div class="card">						
					
					<h4><c:out value="${servicio.nombre}"/></h4>
					<label><c:out value="${servicio.descripcion}"/></label>		
				    </div>
			</c:forEach>
					
	</div>
</div>
</body>
</html>