<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:url value="/AlteraProduto" var="linkServletAlterarProduto" />

<html>
<head>
<title>CRUD</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
</head>
<body>
	<h2>Editar Produto</h2>

	<form action="${linkServletAlterarProduto}" method="POST">

		<fieldset class="form-group">
			<input class="form-control" type="hidden" name="id"
				value="${produto.id}">
		</fieldset>

		<fieldset class="form-group">
			<label>Nome</label> <input type="text" value="${produto.nome}"
				class="form-control" name="nome">
		</fieldset>

		<fieldset class="form-group">
			<label>Unidade</label> <input type="text"
				value="${produto.unidadeCompra}" class="form-control"
				name="unidadeCompra">
		</fieldset>

		<fieldset class="form-group">
			<label>Descrição</label> <input type="text"
				value="${produto.descricao}" class="form-control" name="descricao">
		</fieldset>

		<fieldset class="form-group">
			<label>Qtd por Mês</label> <input type="text"
				value="${produto.qtdPrevistoMes}" class="form-control"
				name="qtdPrevistoMes">
		</fieldset>

		<fieldset class="form-group">
			<label>Preço Maximo Comprado</label> <input type="text"
				value="${produto.precoMaxComprado}" class="form-control"
				name="precoMaxComprado">
		</fieldset>

		<button type="submit" class="btn btn-success">Salvar</button>
	</form>
	</br>
	</br>
	<a class="btn btn-outline-primary" href="creditosAlunos.jsp" role="button">Creditos da dupla</a>
	
</body>
</html>