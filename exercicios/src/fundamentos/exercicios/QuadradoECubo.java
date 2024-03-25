package fundamentos.exercicios;

import java.util.Scanner;

public class QuadradoECubo {
	
	/** 4. Criar um programa que leia um valor e apresente os resultados ao quadrado e ao cubo do valor. */
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe um número: ");
		double valor = entrada.nextDouble();
		
		double aoQuadrado = Math.pow(valor, 4);
		double aoCubo = Math.pow(valor, 3);
		
		
		System.out.printf("Valor ao quadrado é %.0f e ao cubo é %.0f", aoQuadrado, aoCubo);
	
		entrada.close();
		
	}
}
