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
@Table(name="produto")
@SuppressWarnings("serial")
public class Produto implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", nullable = false, length = 20)
	private Long id;
	
	@Column(name="codigo_produto", nullable = true, length = 200)
	private String codigoProduto;
	
	@Column(name="descricao", nullable = true, length = 250)
	private String descricao;
	
	@Column(name="fabricante", nullable = true, length = 100)
	private String fabricante;
	
	@Column(name="observacao", nullable = true, length = 300)
	private String observacao;
	
	@ManyToOne
	@JoinColumn(name="id_categoria", nullable = true)
	private Categoria categoria = new Categoria();
	
	@ManyToOne
	@JoinColumn(name="id_fornecedor", nullable = true)
	private Fornecedor fornecedor = new Fornecedor();
	
	@Column(name="status", nullable = false, length = 25)
	private String status;
	
	public Produto() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodigoProduto() {
		return codigoProduto;
	}

	public void setCodigoProduto(String codigoProduto) {
		this.codigoProduto = codigoProduto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Produto [id=" + id + ", codigoProduto=" + codigoProduto + ", descricao=" + descricao + ", fabricante="
				+ fabricante + ", observacao=" + observacao + ", categoria=" + categoria + ", fornecedor=" + fornecedor
				+ ", status=" + status + "]";
	}
}
