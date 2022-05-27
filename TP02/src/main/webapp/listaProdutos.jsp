<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>CRUD</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
</head>
<body>

	<br>

	<table class="table table-hover">
		<thead>
			<tr>
				<th>ID</th>
				<th>Nome</th>
				<th>Unidade de Compra</th>
				<th>Descricao</th>
				<th>Qtd Previsto Mes</th>
				<th>Preco Max Comprado</th>
				<th>Actions</th>
			</tr>
		</thead>
		<tbody>

			<c:forEach items="${produtos}" var="produto">

				<tr>
					<td>${produto.id}</td>
					<td>${produto.nome}</td>
					<td>${produto.unidadeCompra}</td>
					<td>${produto.descricao}</td>
					<td>${produto.qtdPrevistoMes}</td>
					<td>${produto.precoMaxComprado}</td>
					<td><a href="/TP02/MostraProduto?id=${produto.id}">Editar</a>
						&nbsp;&nbsp;&nbsp;&nbsp; <a
						href="/TP02/RemoveProduto?id=${produto.id}">Delete</a></td>
				</tr>

			</c:forEach>
		</tbody>

	</table>
	
		</br>
	</br>
	<a class="btn btn-outline-primary" href="formNovoProduto.jsp" role="button">Adicionar Produto</a>
	<a class="btn btn-outline-primary" href="creditosAlunos.jsp" role="button">Creditos da dupla</a>
	
</body>
</html>
