package fundamentos.exercicios;

import java.util.Scanner;

public class Bhaskara {
	
/** 6. Criar um programa que resolve equações do segundo grau (ax2 + bx + c = 0) utilizando a fórmula de Bhaskara. 
 * 	   Use como exemplo a = 1, b = 12 e c = -13. Encontre o delta*/
	
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
