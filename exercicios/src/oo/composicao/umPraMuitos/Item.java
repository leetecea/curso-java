package oo.composicao.umPraMuitos;

public class Item {
	
	String nome;
	int quantidade;
	double preco;
// Para criar relação bidirecional:
	Compra compra;
	// criar um construtor que já recebe os 3 atributos acima
	
	Item(String nome, int quantidade, double preco) {
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
	}
}
