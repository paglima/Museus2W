<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Museus Do Estado do Rio de Janeiro</title>
</head>
<body>
<%@ include file="/jsp/includes/topo.jsp" %>

	<div><form action="inclui" method="get">
		<input type="hidden" name="metodo" value="inclui"> 
		<input type="submit" value="teste"> 
	</form></div>
	<a href="jsp/usuario/cadastroUsuario.jsp">Cadastrar</a>
</body>
</html>