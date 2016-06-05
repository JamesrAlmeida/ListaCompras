<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<link rel="stylesheet" type="text/css" href="css/tarefas.css">

	<script type="text/javascript" src="resources/js/jquery.js"></script>	
</head>
<body>
	<h3>Alterar Produto - ${produto.id}</h3>
	<form action="alteraProduto" method="post">
		<input type="hidden" name="id" value="${produto.id}"/>
		
		Categoria:<br>
		<input type="text" name="categoriaProduto" value="${produto.categoriaProduto}"/><br>
		
		Descrição:<br />
		<textarea rows="5" cols="100" name="descricaoProduto">${produto.descricaoProduto}
		</textarea>
		<br />
		
<!-- 		Finalizado? <input type="checkbox" name="finalizado"  -->
<%-- 			value="true" ${tarefa.finalizado? 'checked' : '' }/> <br /> --%>
			
<!-- 		Data de finalização: <br/> -->
<%-- 		<input type="text" name="dataFinalizacao" value="<fmt:formatDate value="${tarefa.dataFinalizacao.time }" pattern="dd/MM/yyyy/" />"/> --%>
<!-- 		<br />		 -->
		
		<input type="submit" value="Alterar"/>
	</form>
	
	
</body>
</html>