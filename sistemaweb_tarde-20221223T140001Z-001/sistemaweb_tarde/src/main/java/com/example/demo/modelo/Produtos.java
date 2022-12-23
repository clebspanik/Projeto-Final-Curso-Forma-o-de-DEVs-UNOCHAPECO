package com.example.demo.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name ="Produtos")
public class Produtos {
		private Long id;
		@NotNull
		private String descricao;
		@NotNull	
		@NotNull
		private int qtd;
		@NotNull
		private double  vlrCompra;
		@NotNull
		private double  vlrVenda;
		@NotNull
		private String dtValidade;
		@NotNull
		private String fabricante;
		
		@Deprecated
		protected Produtos(){
		
		}
		
		public Produtos(String descricao){
			this.descricao =descricao;
		}
		
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
			public Long getId() {
			return id;
		}
		public void setId(Long idProduto) {
			this.id = idProduto;
		}

		@Column(name = "descricao", nullable = false)
		public String getDescricao() {
			return descricao;
		}

		public void setDescricao(String desc) {
			this.descricao = desc;
		}
		
		@Column(name = "Qtd", nullable = false)
		public int getQtd() {
			return qtd;
		}

		public void setQtd(int qtd) {
			this.qtd = qtd;
		}
		
		@Column(name = "vlrCompra", nullable = false)
		public double getVlrCompra() {
			return vlrCompra;
		}

		public void setVlrCompra(double vlrCompra) {
			this.vlrCompra = vlrCompra;
		}
		
		@Column(name = "vlrVenda", nullable = false)
		public double getVlrVenda() {
			return vlrVenda;
		}

		public void setVlrVenda(double vlrVenda) {
			this.vlrVenda = vlrVenda;
		}
		
		@Column(name = "dtValidade", nullable = false)
		public String getDtValidade() {
			return dtValidade;
		}

		public void setDtValidade(String dtValidade) {
			this.dtValidade = dtValidade;
		}
		
		@Column(name = "fabricante", nullable = false)
		public String getFabricante() {
			return fabricante;
		}

		public void setFabricante(String fabricante) {
			this.fabricante = fabricante;
		}
		@Override
		public String toString() {
			return "Produto [descricao=" + descricao + "]";
		}
}