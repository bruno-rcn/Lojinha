package br.com.juliodelima.pojo;

import br.com.juliodelima.enums.Tamanho;
import interfaces.Favorito;

public class ProdutoNacional extends Produto implements Favorito {
	
	private double impostoNacional;

	public ProdutoNacional(String novoNome, String novaMarca, Tamanho novoTamanho) {
		super(novoNome, novaMarca, novoTamanho);
	}

	// Imposto
	public double getImpostoNacional() {
		return impostoNacional;
	}

	public void setImpostoNacional(double novoImposto) {
		this.impostoNacional = novoImposto;
	}

	@Override
	public String getDadosFavoritos() {
		return this.getNome() + ", " + this.getMarca() + ", " + this.getValor();
	}

}
