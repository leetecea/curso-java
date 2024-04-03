package controle.exercicios;

import java.util.Scanner;

public class NumeroParOuImpar {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um número:");
		int numero = entrada.nextInt();
		
		if (numero >= 0 && numero <= 10) {
			if (numero % 2 == 0) {
				System.out.printf("%d é par e está entre 0 e 10.", numero);
			} else {
				System.out.printf("%d não é par e está entre 0 e 10.", numero);
			}
		} else {
			System.out.printf("%d não está entre 0 e 10.", numero);
		}
		

		entrada.close();
	}
}
