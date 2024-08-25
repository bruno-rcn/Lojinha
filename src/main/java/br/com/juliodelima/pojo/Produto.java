package br.com.juliodelima.pojo;

import java.util.List;

import br.com.juliodelima.enums.Tamanho;

public class Produto {

	private String nome;
	private String marca;
	protected double valor;
	private Tamanho tamanho;
	private List<ItemAdicional> itensInclusos;
	
	public Produto(String novoNome, String novaMarca, Tamanho novoTamanho) {
		this.nome = novoNome;
		this.marca = novaMarca;
		this.tamanho = novoTamanho;
	}
	
	
	// Valor
	public double getValor() {
		return valor;
	}
	
	public void setValor(double novoValor) {
		if(novoValor > 0) {
			this.valor = novoValor;
		}
		else {
			throw new IllegalArgumentException("Valores  devem ser maior que 0");
		}
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

	// Tamanho
	public Tamanho getTamanho() {
		return tamanho;
	}

	public void setTamanho(Tamanho novoTamanho) {
		this.tamanho = novoTamanho;
	}

	// Itens Inclusos
	public List<ItemAdicional> getItensInclusos() {
		return itensInclusos;
	}

	public void setItensInclusos(List<ItemAdicional> novoItem) {
		this.itensInclusos = novoItem;
	}
	
	
}
