package fundamentos.exercicios;

import java.util.Scanner;

public class AreaTriangulo {
	
	/** 5. Criar um programa que leia o valor da base e da altura de um triângulo e calcule a área. */
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o valor da base do triângulo: ");
		double baseTriangulo = entrada.nextDouble();
		System.out.println("Informe o valor da altura do triângulo: ");
		double alturaTriangulo = entrada.nextDouble();
		
				
		double areaTriangulo = (baseTriangulo * alturaTriangulo) / 2;
		
		System.out.printf("O valor da área do triângulo é %.2f", areaTriangulo);
		
		entrada.close();
	}
}
