package fundamentos.exercicios;

import java.util.Scanner;

public class TemperaturaCelsiusParaF {
	
	/** 2. Criar um programa que leia a temperatura em Celsius e converta para Fahrenheit. */
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a temperatura em Celsius: ");
		double celsius = entrada.nextDouble();
		
		double resultado = (celsius *  (9.0/5.0) + 32);
		
		System.out.printf("Temperatura em Fahrenheit é %.2f°F", resultado);
		entrada.close();
	}
}
