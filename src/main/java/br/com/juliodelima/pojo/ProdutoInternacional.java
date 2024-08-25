package br.com.juliodelima.pojo;

import br.com.juliodelima.enums.Tamanho;
import interfaces.Favorito;

public class ProdutoInternacional extends Produto implements Favorito {
	
	private double impostoInternacional;

	public ProdutoInternacional(String novoNome, String novaMarca, Tamanho novoTamanho) {
		super(novoNome, novaMarca, novoTamanho);
	}

	// Imposto
	public double getImpostoInternacional() {
		return impostoInternacional;
	}

	public void setImpostoInternacional(double novoImposto) {
		this.impostoInternacional = novoImposto;
	}
	
	@Override
	public void setValor(double novoValor) {
		if(novoValor > -100) {
			this.valor = novoValor;
		}
		else {
			throw new IllegalArgumentException("Valores  devem ser maior que -100");
		}
	}

	@Override
	public String getDadosFavoritos() {
		return this.getNome() + ", " + this.getMarca() + ", " + this.getValor();
	}

}
