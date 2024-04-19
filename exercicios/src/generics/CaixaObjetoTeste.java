package generics;

public class CaixaObjetoTeste {
	public static void main(String[] args) {
		
		CaixaObjeto caixaA = new CaixaObjeto();
		caixaA.guardar(2.3); // double -> Double
		
		Double coisaA = (Double) caixaA.abrir(); // se usasse o cast (Integer) daria erro, pois o retorno de caixaA seria um double
		System.out.println(coisaA);
		
		CaixaObjeto caixaB = new CaixaObjeto();
		caixaB.guardar("Olá");
		
		String coisaB = (String) caixaB.abrir(); // é preciso fazer o cast, pois o java nao deixa retornar um valor do tipo CaixaObjeto pra uma String
		System.out.println(coisaB);
		
		// Se voce tem uma classe que precisa trabalhar com tipos diferentes, pode utilizar o generics
	}
}
