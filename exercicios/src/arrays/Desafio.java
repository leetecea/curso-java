package arrays;

import java.util.Scanner;

public class Desafio {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quantas notas você deseja informar?");
		
		int qtdNotas = entrada.nextInt();
		
		double[] notas = new double[qtdNotas];
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Informe a nota " + (i + 1) + ": ");
			notas[i] = entrada.nextDouble();
			
		}
		
		double totalNotas = 0;
		for(double nota: notas) {
			totalNotas += nota;
		}
		System.out.println( "Média do total das notas: " + totalNotas / notas.length);
		
		entrada.close();
		
		
	}
}
