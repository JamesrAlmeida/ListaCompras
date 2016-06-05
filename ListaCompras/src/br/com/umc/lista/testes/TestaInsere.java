package br.com.umc.lista.testes;

import br.com.umc.lista.dao.ProdutoDao;
import br.com.umc.lista.modelo.Produto;

public class TestaInsere {

	public static void main(String[] args) {
		
		//construindo o objeto
	Produto produto = new Produto();
		
		//inserindo dados no objeto com a variavel de referencia
//		contato.setNome("Caelum");
//		contato.setEmail("contato@caelum.com.br");
//		contato.setEndereco("R. Vergueiro, 3185 cj57");
//		contato.setDataNascimento(Calendar.getInstance());	
	produto.setDescricaoProduto("teste");
	
		
		//grave nessa conexão
//		ContatoDAO dao = new ContatoDAO();
	ProdutoDao dao = new ProdutoDao();	
		//metodo elegante
//		dao.adiciona(contato);
		dao.adiciona(produto);
		
		System.out.println("Gravado");
		
	}
}
