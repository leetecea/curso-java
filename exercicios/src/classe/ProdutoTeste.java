package classe;

public class ProdutoTeste {
	public static void main(String[] args) {
//		Scanner entrada = new Scanner(System.in); // new -> palavra reservada para chamar um construtor
												// nome do construtor: é exatamente o mesmo nome da classe
		Produto p1 = new Produto("Notebook", 4365.89); 
	// Produto -> nome da classe =  Produto() -> nome do construtor
		
		var p2 = new Produto(); // aqui o java infere o tipo pelo valor atribuido
		p2.nome ="Caneta azul";
		p2.preco = 12.56;
		Produto.desconto = 0.50;
		
		double precoFinal1 = p1.precoComDesconto(); // chamo com parenteses -> metodo / sem parenteses -> chama atributo
		double precoFinal2 = p2.precoComDesconto();
		
		System.out.printf("%s custa = R$ %.2f", p1.nome, precoFinal1);
		System.out.printf("\n%s custa = R$ %.2f", p2.nome, precoFinal2);
		
		
	}
}