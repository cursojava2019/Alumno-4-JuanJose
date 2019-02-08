<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<%@include file="./WEB-INF/jsp/plantilla/head.jsp"%>
<body>

	<div class="container">
		
		<div class="modal-dialog text-center">
			<div class="main-section col-sm-8">
				<div class="modal-content">
				
					<form class="col-10" action="./j_spring_security_check" method="post">
						<div class="form-group">
							<h2 class="text-white">Identifícate</h2>
							<p><input class="form-control" name="j_username" type="text" placeholder="Usuario"></p>
							<p><input class="form-control" name="j_password" type="password" placeholder="Contraseña"></p>
							<button class="btn boton-login" type="submit">Acceder</button>
						</div>
					</form>
				
				</div>
			</div>
		</div>
		
	</div>

</body>
</html>