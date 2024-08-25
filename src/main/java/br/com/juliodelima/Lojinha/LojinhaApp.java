package br.com.juliodelima.Lojinha;

import java.util.ArrayList;
import java.util.List;

import br.com.juliodelima.enums.Tamanho;
import br.com.juliodelima.pojo.ItemAdicional;
import br.com.juliodelima.pojo.Produto;

public class LojinhaApp {

	public static void main(String[] args) {
		
		Produto meuProduto = new Produto("PS5", "Sony", Tamanho.G);
		
		meuProduto.setValor(400.50);
		
		// ---------- inicio de adicionar item adicional
		List<ItemAdicional> itens = new ArrayList<>();
		
		ItemAdicional primeiroItem = new ItemAdicional("Controle", 2);
		ItemAdicional segundoItem = new ItemAdicional("Jogo", 3);		
		
		itens.add(primeiroItem);
		itens.add(segundoItem);
		
		meuProduto.setItensInclusos(itens);
		
		for(ItemAdicional itemAtual : meuProduto.getItensInclusos()) {
			System.out.println(itemAtual.getNome());
			System.out.println(itemAtual.getQuantidade());
		}
		// ---------- fim

	}

}
