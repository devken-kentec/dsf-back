package br.com.kentec.dsf.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="detalhamento_produto")
@SuppressWarnings("serial")
public class DetalhamentoProduto implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", nullable = false, length = 20)
	private Long id;
	
	@Column(name="codigo_detalhamento", nullable = true, length = 200)
	private String codigoDetalhamento;
	
	@Column(name="altura", nullable = true, length = 10)
	private String altura;
	
	@Column(name="comprimento", nullable = true, length = 10)
	private String comprimento;
	
	@Column(name="largura", nullable = true, length = 10)
	private String largura;
	
	@Column(name="peso", nullable = true, length = 10)
	private String peso;
	
	@Column(name="tamanho", nullable = true, length = 5)
	private String tamanho;
	
	@Column(name="unidade_medida", nullable = true, length = 15)
	private String unidadeMedida;
	
	@Column(name="unidade_venda", nullable = true, length = 15)
	private String unidadeVenda;
	
	@ManyToOne
	@JoinColumn(name="id_produto", nullable = true)
	private Produto produto = new Produto();
	
	@Column(name="status", nullable = false, length = 25)
	private String status;
	
	public DetalhamentoProduto() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodigoDetalhamento() {
		return codigoDetalhamento;
	}

	public void setCodigoDetalhamento(String codigoDetalhamento) {
		this.codigoDetalhamento = codigoDetalhamento;
	}

	public String getAltura() {
		return altura;
	}

	public void setAltura(String altura) {
		this.altura = altura;
	}

	public String getComprimento() {
		return comprimento;
	}

	public void setComprimento(String comprimento) {
		this.comprimento = comprimento;
	}

	public String getLargura() {
		return largura;
	}

	public void setLargura(String largura) {
		this.largura = largura;
	}

	public String getPeso() {
		return peso;
	}

	public void setPeso(String peso) {
		this.peso = peso;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public String getUnidadeMedida() {
		return unidadeMedida;
	}

	public void setUnidadeMedida(String unidadeMedida) {
		this.unidadeMedida = unidadeMedida;
	}

	public String getUnidadeVenda() {
		return unidadeVenda;
	}

	public void setUnidadeVenda(String unidadeVenda) {
		this.unidadeVenda = unidadeVenda;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	@Override
	public String toString() {
		return "DetalhamentoProduto [id=" + id + ", codigoDetalhamento=" + codigoDetalhamento + ", altura=" + altura
				+ ", comprimento=" + comprimento + ", largura=" + largura + ", peso=" + peso + ", tamanho=" + tamanho
				+ ", unidadeMedida=" + unidadeMedida + ", unidadeVenda=" + unidadeVenda + ", produto=" + produto + "]";
	}
	
}
