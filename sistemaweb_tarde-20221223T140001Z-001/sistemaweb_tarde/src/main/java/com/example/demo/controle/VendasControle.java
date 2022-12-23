package com.example.demo.controle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.modelo.Pessoas;
import com.example.demo.modelo.Produtos;
import com.example.demo.modelo.Vendas;
import com.example.demo.repositorio.PessoasRepositorio;
import com.example.demo.repositorio.ProdutosRepositorio;
import com.example.demo.repositorio.VendasRepositorio;


@Controller
public class VendasControle {
	
	@Autowired
	private ProdutosRepositorio produtosrepositorio;
	
	@Autowired
	private VendasRepositorio vendasrepositorio;
	
	@Autowired
	private PessoasRepositorio pessoasrepositorio;
	
	  @GetMapping("/vendas/cadastrar")
	  public String cadastrar(@ModelAttribute("venda") Vendas venda) {
		  return "/vendas/cadastro";
	  }
	  
	  @GetMapping("/vendas/listar")
	  public String listar(ModelMap model) {
		  model.addAttribute("vendas", vendasrepositorio.findAll());
		  return "/vendas/listar";
	  }
	  
	  @PostMapping("/vendas/salvar")
	  public String salvar(@ModelAttribute("venda") Vendas venda, RedirectAttributes attr) {
		  vendasrepositorio.save(venda);
		  attr.addFlashAttribute("success", "Produto adicionado com sucesso");
		  return "redirect:/vendas/listar";
	  }

	  @ModelAttribute("pessoas")
	  public List<Pessoas> getPessoas(){
		 return pessoasrepositorio.findAll();
	  }
	  
	  @ModelAttribute("produtos")
	  public List<Produtos> getProdutos(){
		 return produtosrepositorio.findAll();
	  }
	  
}