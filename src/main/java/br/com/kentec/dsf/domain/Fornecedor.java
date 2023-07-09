package br.com.kentec.dsf.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="fornecedor")
@SuppressWarnings("serial")
public class Fornecedor implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", nullable = false, length = 20)
	private Long id;
	
	@Column(name="nome", nullable = false, length = 150)
	private String nome;
	
	@Column(name="razao_social", nullable = true, length = 200)
	private String razaoSocial;
	
	@Column(name="cnpj_cpf", nullable = true, length = 14)
	private String cnpjCpf;
	
	@Column(name="fone", nullable = true, length = 12)
	private String fone;
	
	@Column(name="whatsapp", nullable = true, length = 12)
	private String whatsapp;
	
	@Column(name="status", nullable = false, length = 25)
	private String status;
	
	public Fornecedor() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getCnpjCpf() {
		return cnpjCpf;
	}

	public void setCnpjCpf(String cnpjCpf) {
		this.cnpjCpf = cnpjCpf;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}

	public String getWhatsapp() {
		return whatsapp;
	}

	public void setWhatsapp(String whatsapp) {
		this.whatsapp = whatsapp;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Fornecedor [id=" + id + ", nome=" + nome + ", razaoSocial=" + razaoSocial + ", cnpjCpf=" + cnpjCpf
				+ ", fone=" + fone + ", whatsapp=" + whatsapp + ", status=" + status + "]";
	}
}
