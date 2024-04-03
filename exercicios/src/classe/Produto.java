package classe;

public class Produto {
	
	String nome;
	double preco;
	static double desconto = 0.25;
	
	Produto(String nomeInicial,
			double precoInicial){ // 1º construtor
		nome = nomeInicial;
		preco = precoInicial;
	}
	// quando cria construtor novo, voce perde o construtor default
	// mas voce pode setar novamente o construtor default:
	Produto(){ // 2º construtor - construtor default
	}
	
	double precoComDesconto () { // nao preciso declarar os parametros, pois já tenho eles declarados na classe
		return preco * (1 - desconto);
	}
	
	double precoComDesconto (double descontoDoGerente) { 
		return preco * (1 - desconto + descontoDoGerente); 
	} 	

}
	// é possível criar outro metodo com mesmo nome, mas a assinatura precisa ser diferente
	// ex: precoComDesconto () !== precoComDesconto (double descontoDoGerente)
