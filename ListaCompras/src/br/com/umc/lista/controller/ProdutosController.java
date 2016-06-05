package br.com.umc.lista.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.umc.lista.dao.ProdutoDao;
import br.com.umc.lista.modelo.Produto;

@Controller
public class ProdutosController {
	
	@RequestMapping("welcome")
	public String telaInicio(){
		return "menu";
	}
	
	@RequestMapping("/adicionaProduto")
	//public String adiciona(@Valid Produto produto, BindingResult result){
	public String adiciona(Produto produto){
		//if(result.hasFieldErrors("descricao")){
			//return "formulario";
		//}
		
		new ProdutoDao().adiciona(produto);
		return "formulario";
	}

	@RequestMapping("novoProduto")
	public String form(){
		return "formulario";
	}
	
	@RequestMapping("listaProdutos")
	public String lista(Model model){
		List<Produto> produtos = new ProdutoDao().lista();
		model.addAttribute("produtos", produtos);
		return "lista";
	}
	
	@RequestMapping("removeProduto")
	public String remove(Produto produto){
		new ProdutoDao().remove(produto);
		return "redirect:listaProdutos";
	}
	
	@RequestMapping("mostraProduto")
	public String mostra(Long id, Model model){
		ProdutoDao dao = new ProdutoDao();
		model.addAttribute("produto", dao.buscaPorId(id));
		return "mostra";
	}
	
	@RequestMapping("alteraProduto")
	public String altera(Produto produto){
		new ProdutoDao().altera(produto);
		return "redirect:listaProdutos";
	}
	
//	@ResponseBody
//	@RequestMapping("finalizaTarefa")
//	public void finaliza(Long id){
//		new JdbcTarefaDao().finaliza(id);
//	}
}
