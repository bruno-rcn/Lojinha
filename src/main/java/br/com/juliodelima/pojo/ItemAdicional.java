package br.com.juliodelima.pojo;

public class ItemAdicional {

	private String nome;
	private int quantidade;
	
	public ItemAdicional(String novoNome, int novaQuantidade) {
		this.nome = novoNome;
		this.quantidade = novaQuantidade;
	}
	
	// Nome
	public String getNome() {
		return nome;
	}
	public void setNome(String novoNome) {
		this.nome = novoNome;
	}
	
	// Quantidade
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int novaQuantidade) {
		this.quantidade = novaQuantidade;
	}
}
