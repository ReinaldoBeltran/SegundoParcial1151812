<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">

	<link rel="stylesheet" type="text/css" href="css/registro.css">
</head>
<body>
<div class="container">	
					<div class="card" id="registrarDiv">	
					<img src="https://github.com/ReinaldoBeltran/imgTest/blob/master/IMG/img12.png?raw=true">		
				<br>
					<form action="ClienteServlet?action=nuevo" method="post">
						  <div class="form-group">
						    <label >Nombre:</label>
						    <input  name="nombre" value="<c:out value='${cliente.nombre}' />" required>
						  </div>
						  <div class="form-group">
						    <label >Email:</label>
						    <input  name="email" value="<c:out value='${cliente.email}' />" required>
						  </div>
						   <div class="form-group">
						    <label >Clave</label>
						    <input  name="clave" value="<c:out value='${cliente.clave}' />"required>
						  </div>					  
						  
						 						  
						<button type="submit" class="btn btn-primary" id="btnGuardar">Guardar</button>
						
						</form>
				
										
									
				    </div>			
					
				</div>

</body>
</html>