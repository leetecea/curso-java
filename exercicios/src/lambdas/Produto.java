package lambdas;

<<<<<<< HEAD
// A classe mãe de todas classes no Java é o Object 
//Por padrão toda classe tem extends Object de forma implicita
// por isso não precisa adicionar super() no construtor
 public class Produto extends Object {	
=======
public class Produto extends Object {
>>>>>>> 34891fdfb7f42ee02e3dcb48adda6a6c0b28674b
	final String nome;
	final double preco;
	final double desconto;
	
	public Produto(String nome, double preco, double desconto) {
<<<<<<< HEAD
//		super();
=======
>>>>>>> 34891fdfb7f42ee02e3dcb48adda6a6c0b28674b
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}
	
	public String toString() {
		double precoFinal = preco * (1 - desconto);
		return nome + " tem preço de R$" + precoFinal; 
	}
}
