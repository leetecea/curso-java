package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {
	public static void main(String[] args) {
		System.out.println("2" == "2");

		String s1 = new String("2");
		System.out.println("2" == s1);
		System.out.println("2".equals(s1)); // compara apenas os conteúdos 
		
		Scanner entrada = new Scanner(System.in);
		
		String s2 = entrada.next();
		System.out.println("2" == s2.trim()); // trim() tira espaços em brancos -> caso usuário dê espaço
		System.out.println("2".equals(s2.trim()));
		
		// quando for comparar Strings utilize o equals e não == 
		
		entrada.close();
	}
}
