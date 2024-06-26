package arrays;

import java.util.Arrays;

public class ExercicioForeach {
	public static void main(String[] args) {
		
		double[] notasAlunoA = new double[3];
		System.out.println(Arrays.toString(notasAlunoA));
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		
		
		System.out.println(Arrays.toString(notasAlunoA));
		System.out.println(notasAlunoA[notasAlunoA.length - 1]); // pegar a ultima nota do aluno, ou seja, o ultimo indice do array 
		
		double totalAlunoA = 0;
		for (double nota: notasAlunoA) {
			totalAlunoA += nota;
		}
		System.out.println("resultado: " + totalAlunoA / notasAlunoA.length);
		
		double notaArmazenada = 5.9;
		double[] notasAlunoB = { 6.9, 8.9, notaArmazenada, 10 };
		
		double totalAlunoB = 0;
		for (double nota: notasAlunoB) {
			totalAlunoB += nota;
		}
		System.out.println(totalAlunoB / notasAlunoB.length); // LENGTH -> é um atributo e nao um comportamento
	}
}
