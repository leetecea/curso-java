package lambdas;

public class CalculoTeste2 {
	public static void main(String[] args) {
// função/método que não tem nome:
// associei o resultado da função numa variável soma do tipo Calculo
		Calculo calc = (x, y) -> { return x + y; };
		
		System.out.println(calc.executar(2, 5));
		
		calc = (x,y) -> x * y; 
		System.out.println(calc.executar(2, 5));
		// implicitamente ja existe um return associado
// quando tira o par de chaves, é assumido que terá apenas 1 sentença de código
		
		System.out.println(calc.legal(2,3));
		System.out.println(Calculo.muitoLegal());
		
	}
}
