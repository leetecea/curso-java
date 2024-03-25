package controle;

import javax.swing.JOptionPane;

public class IfElse {
	public static void main(String[] args) {
		
		String valor = JOptionPane.showInputDialog("Informe o número");
		
		int numero = Integer.parseInt(valor);
		
		// COM ELSE
		
		if (numero % 2 == 0 ) { // a expressão sempre deve retornar TRUE ou FALSE
			System.out.println("Número par!");
		} else {
			System.out.println("Número ímpar!");
		}
	}
}
