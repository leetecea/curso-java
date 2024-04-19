package lambdas;

public class CalculoTeste1 {
	public static void main(String[] args) {
		
		
		Calculo calculo = new Somar();
		System.out.println(calculo.executar(2, 3));

// como as 2 classes implementam a interface, existe um mecanismo de herança
// é possível usar o polimorfismo:
		calculo = new Multiplicar();
		System.out.println(calculo.executar(2, 3));
		
		
	}
}
