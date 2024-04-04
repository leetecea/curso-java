package oo.composicao.umPraMuitos;

import java.util.ArrayList;

public class Compra {
	
	String cliente;
	// lista homogenea: só tem itens do tipo Item na lista
	ArrayList<Item> itens = new ArrayList<Item>();
	
// esse metodo chama o metodo de baixo e cria um novo objeto Item com os paramentros fornecidos 
	// chama o metodo adicionarItem() com novo objeto Item como argumento
	void adicionarItem(String nome, int quantidade, double preco) {
		this.adicionarItem(new Item(nome, quantidade, preco));
	}
	
// Criar relação bidirecional entre item e compra
	void adicionarItem(Item item) {
		this.itens.add(item); // adiciona o item na lista itens
		item.compra = this; // quem é a compra associada a esse item? -> é a classe atual (class Compra)
		// ao mesmo tempo que adiciona o item a lista, faz o contrario que é associar a compra ao item 
	}
	
	double obterValorTotal(){
		double total = 0;
		for (Item item: itens) {
			total += item.quantidade * item.preco;
		}
		return total;
	}
	
}