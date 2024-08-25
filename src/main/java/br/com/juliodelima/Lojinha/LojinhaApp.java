package br.com.juliodelima.Lojinha;

import br.com.juliodelima.pojo.Produto;

public class LojinhaApp {

	public static void main(String[] args) {
		
		Produto meuProduto = new Produto();
		
		meuProduto.setNome("PS5");
		meuProduto.setMarca("Sony");
		meuProduto.setValor(400.50);
		meuProduto.setTamanho("G");
		meuProduto.setItensInclusos("Dois controles");

	}

}
