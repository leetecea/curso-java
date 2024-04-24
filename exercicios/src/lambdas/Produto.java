package lambdas;

// A classe mãe de todas classes no Java é o Object 
//Por padrão toda classe tem extends Object de forma implicita
// por isso não precisa adicionar super() no construtor
 public class Produto extends Object {	
	final String nome;
	final double preco;
	final double desconto;
	
	public Produto(String nome, double preco, double desconto) {
//		super();
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}


	public String toString() {
		double precoFinal = preco * (1 - desconto);
		return nome + " tem preço de R$" + precoFinal; 
	}
}
