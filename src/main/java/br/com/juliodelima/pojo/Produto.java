package br.com.juliodelima.pojo;

public class Produto {

	private String nome;
	private String marca;
	private double valor;
	private String tamanho;
	private String itensInclusos;
	
	
	// Valor
	public double getValor() {
		return valor;
	}
	
	public void setValor(double novoValor) {
		this.valor = novoValor;
	}

	// Nome
	public String getNome() {
		return nome;
	}

	public void setNome(String novoNome) {
		this.nome = novoNome;
	}

	// Marca
	public String getMarca() {
		return marca;
	}

	public void setMarca(String novaMarca) {
		this.marca = novaMarca;
	}

	// Marca
	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String novoTamanho) {
		this.tamanho = novoTamanho;
	}

	// Itens Inclusos
	public String getItensInclusos() {
		return itensInclusos;
	}

	public void setItensInclusos(String novoItem) {
		this.itensInclusos = novoItem;
	}
	
	
}
