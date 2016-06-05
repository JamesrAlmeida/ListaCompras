<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
	<link rel="stylesheet" type="text/css" href="css/tarefas.css">
	<script type="text/javascript" src="resources/js/jquery.js"></script>
</head>
<body>
	<script type="text/javascript">
		function finalizaAgora(id){
			$.post("finalizaTarefa", {'id' : id}, function(){
				//selecionando o elemento html através da
				// ID e alterando o html dele
				$("#tarefa_"+id).html("Finalizado");
				});
			}
	</script>
	
	<a href="novoProduto">Criar novo Produto</a>
	
	<br /><br />
	
	<table border="2px">
	<tr>
		<th>Id</th>
		<th>Categoria</th>
		<th>Descrição</th>
		<th>Quantidade</th>
<!-- 		<th>Finalização</th> -->
<!-- 		<th>Data de finalização</th> -->
	</tr>
	<c:forEach items="${produtos}" var="produto">
		<tr>
			<td>${produto.id}</td>
			<td>${produto.categoriaProduto}</td>
			<td>${produto.descricaoProduto}</td>
			<td>${produto.quantidadeProduto}</td>
<%-- 			<c:if test="${tarefa.finalizado eq false}"> --%>
<%-- 				<td id="tarefa_${tarefa.id}"> --%>
<%-- 					<a href="#" onClick="finalizaAgora(${tarefa.id })"> --%>
<!-- 						Finalizar -->
<!-- 					</a> -->
<!-- 				</td> -->
<%-- 			</c:if> --%>
<%-- 			<c:if test="${tarefa.finalizado eq true}"> --%>
<!-- 				<td>Finalizado</td> -->
<%-- 			</c:if> --%>
			<td>
<%-- 				<fmt:formatDate value="${tarefa.dataFinalizacao.time }" pattern="dd/MM/yyyy"/> --%>
				<td><a href="removeProduto?id=${produto.id }">Remover</a></td>
				<td><a href="mostraProduto?id=${produto.id }">Alterar</a></td>
	</c:forEach>
	</table>
</body>
</html>