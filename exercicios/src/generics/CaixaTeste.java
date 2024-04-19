package generics;

public class CaixaTeste {
	public static void main(String[] args) {
		
		Caixa<String> caixaA = new Caixa<>(); //Caixa<> -> infere o tipo passado do outro lado 
		caixaA.guardar("Segredo!");
		
		String coisaA = caixaA.abrir();
		System.out.println(coisaA);

		Caixa<Double> caixaB = new Caixa<>(); // quando instanciar a caixaB, é definido o tipo generico que será adotado
		caixaB.guardar(3.1415);
		
		Double coisaB = caixaB.abrir();
		System.out.println(coisaB);
	}
}
