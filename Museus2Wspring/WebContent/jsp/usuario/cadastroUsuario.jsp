<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ include file="/jsp/includes/topo.jsp" %>

	<div><h2>Cadastro de usuarios</h2></div>

	<div><form action="/Museus2W/inclui.do" method="get">
		<div>Nome: <input type="text" name="login"></div>
		<div>Senha: <input type="password" name="senha"></div>
		<input type="hidden" name="metodo" value="inclui"> 
		<input type="submit" value="Cadastrar">
	</form></div>