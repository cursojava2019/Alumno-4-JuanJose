<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<%@include file="./WEB-INF/jsp/plantilla/head.jsp"%>
<body>

	<div class="container">
		<div class="row">
			<div class="col-lg-4 text-center">
				<form action="./login.html" method="post">
					<div class="form-group">
						<h2>Acceder</h2>
						<p><input class="form-control" name="usuario" type="text" placeholder="Usuario"></p>
						<p><input class="form-control" name="password" type="password" placeholder="Contraseña"></p>
						<button class="btn btn-primary" type="submit">Acceder</button>
					</div>
				</form>
			</div>
		</div>
	</div>

</body>
</html>