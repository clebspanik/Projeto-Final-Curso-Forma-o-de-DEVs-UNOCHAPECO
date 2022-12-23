package com.example.demo.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "vendas")
public class Vendas {
	@Id
	@Column(name = "id")
	@GeneratedValue
	public Long id;
	@ManyToOne 
	private Produtos produtos; 
	private String descricao_produto;
	@ManyToOne 
	private Pessoas pessoas;
	private String nome_pessoa;
	@Column(name = "quantidade")
	private int quantidade;  
	@Column(name = "total")
	private double total;
	public Produtos getProduto() {
	return produtos;
	}
	public void setProduto(Produtos produtos) {
		this.produtos = produtos;
	}
	public Pessoas getCliente() {
		return pessoas;
	}
	public void setCliente(Pessoas pessoas) {
		this.pessoas = pessoas;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getTotal() {
		return total = quantidade * produtos.getVlrVenda();
	}
	public String getNome_produto() {
		return descricao_produto = produtos.getDescricao();
	}
	public String getNome_Pessoas() {
		return nome_pessoa = pessoas.getNome();
	}
}
