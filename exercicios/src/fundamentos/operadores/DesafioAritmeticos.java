package fundamentos.operadores;

public class DesafioAritmeticos {
	public static void main(String[] args) {
//		int a = 3 * 4 - 10;
//		
//		int b = (int) Math.pow(a, 3); // para fazer a^3 (a elevado a 3)
//		double c = Math.pow(a,3);
//		
//		System.out.println(b);
//		System.out.println(c);
		

		int numAElevado = (int) Math.pow(6 * (3 + 2), 2);
		
		int denA = 3 * 2;
		
		int superiorA = numAElevado / denA;
		
		int numB = (1-5) * (2-7);
		int superiorB = numB /2;
		
		int superiorBElevado = (int) Math.pow(superiorB, 2);
	
		int parteDeCima = superiorA - superiorBElevado;
		int parteDeCimaElevado = (int) Math.pow(parteDeCima, 3);
		
		int parteDeBaixo = (int) Math.pow(10, 3); 
		
		
		int resultado = parteDeCimaElevado / parteDeBaixo;
		
		System.out.println("O resultado é" + resultado);
		
		
		
		
		
}
}
