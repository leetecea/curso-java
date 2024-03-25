package controle;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		double valor = 0;
		double total = 0;
		int qtdNotas = 0;
		
		while(valor != -1) {
			System.out.println("Digite uma nota ou -1 p/ sair: ");
			valor = entrada.nextDouble();
			
			if (valor <= 10 && valor >= 0) {
				total += valor;
				qtdNotas++;
			}else if (valor != -1) {
				System.out.println("Digite uma nota válida!");
			}
		}
		
		double media = total / qtdNotas;
		
		System.out.printf("A média do aluno foi %.2f", media);

		entrada.close();
	}
}
