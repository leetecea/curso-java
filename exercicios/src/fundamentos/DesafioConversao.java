package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		
		
		// pegar atraves do scanner 3 strings usando nextline
		// as 3 strings sao os ultimos 3 salarios
		//calcule a media desses 3 salarios
		// tem que funcionar com usuario digitando com . ou ,
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite seu 1° salário:");
		String salario1 = entrada.nextLine().replace(",", ".");
		
		System.out.print("Digite seu 2° salário:");
		String salario2 = entrada.nextLine().replace(",", ".");
		
		System.out.print("Digite seu 3° salário:");
		String salario3 = entrada.nextLine().replace(",", ".");
		
		
		double somaDosSalarios = Double.parseDouble(salario1) + 
				Double.parseDouble(salario2) +
				Double.parseDouble(salario3);
		
		System.out.print("Média dos salários é: " + somaDosSalarios / 3);
		
		entrada.close();
	}
}
