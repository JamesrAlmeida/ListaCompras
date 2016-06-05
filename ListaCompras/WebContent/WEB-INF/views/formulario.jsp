<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %> 
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/tarefas.css">
<link rel="stylesheet" href="css/css/menusubmenu.css">

	<script type="text/javascript" src="resources/js/jquery.js"></script>
	
	<script type="text/javascript">
		function addAlert(){
			alert("Novo produto adicionado com sucesso");		
		}
	</script>
	
</head>

<body>
	<h3>Adicionar Produtos</h3>
<%-- 	<form:errors path="produto.descricaoProduto"/> --%>
	<form action="adicionaProduto" method="post">
	
		<div class="menu-container">
    		<ul class="menu clearfix">
        		<li><a href="#">Categorias</a>
		            <!-- Nível 1 -->
		            <!-- submenu -->
		            <ul class="sub-menu clearfix">
                		<li><a href="#">Feira</a>
                   			 <!-- Nível 2 -->
                   			 <!-- submenu do submenu -->
           				  <ul class="sub-menu">
                   		     <li><a href="#">Frutas</a>
                   		     <li><a href="#">Higienizados</a>
                   		     <li><a href="#">Legumes e Raizes</a>
                   		     <li><a href="#">Ovos</a>
                   		     <li><a href="#">Temperos</a>
                   		     <li><a href="#">Verduras</a>
                          		     <!-- Nível 3 -->
                           			 <!-- submenu do submenu do submenu -->
                          	  <ul class="sub-menu">
                                <li><a href="#">sub sub sub</a></li>
                                <li><a href="#">sub sub sub</a></li>
                                <li><a href="#">sub sub sub</a></li>
                                <li><a href="#">sub sub sub</a></li>
                                <li><a href="#">sub sub sub</a></li>
                                <li><a href="#">sub sub sub</a></li>
                            </ul><!-- submenu do submenu do submenu -->
                        </li>
                        
                    </ul><!-- submenu do submenu -->
                </li>
	                <li><a href="#">Queijos e Embutidos</a></li>
	                <li><a href="#">laticínios</a></li>
	                <li><a href="#">Açougue</a></li>
	                <li><a href="#">Padaria</a></li>
                	<li><a href="#">Mercearia</a></li>
                	<li><a href="#">Bebidas</a></li>
                	<li><a href="#">Bebidas Alcoólicas</a></li>
                	<li><a href="#">Limpeza</a></li>
                	<li><a href="#">Higiene e Perfumaria</a></li>
                	<li><a href="#">Categorias +</a></li>
            </ul><!-- submenu -->
       		 </li>
		      
		    </ul>
		</div>
				
		Descrição: <br />
		<textarea rows="5" name="descricaoProduto" cols="100"></textarea><br />
		Quantidade:
		<input type="text" name="quantidadeProduto" size="5"><br />
		<input type="submit" onclick="addAlert()" value="Gravar">
		
	</form>

	<a href="listaProdutos"> <img src="icons/lista.png"> Listar Produtos</a>
</body>
</html>