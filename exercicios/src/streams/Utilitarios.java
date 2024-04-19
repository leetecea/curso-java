package streams;

import java.util.function.UnaryOperator;

// mudar de classe para interface
//caso não queira que Utilitarios seja instanciado um novo Utilitarios
public class Utilitarios {
// ou pode indicar que o construtor é privado:
	private Utilitarios() {
	// não vai poder usar  new Utilitarios()
	}
	
	public final static UnaryOperator<String> maiuscula = 
			n -> n.toUpperCase();
			
	public final static UnaryOperator<String> primeiraLetra = 
			n -> n.charAt(0) + "";		
// não pode ter um método final que seja escrito a partir de uma interface
	public static String grito(String n)  {
			return n + "!!! ";
	}
<<<<<<< HEAD
}
=======
}
>>>>>>> 34891fdfb7f42ee02e3dcb48adda6a6c0b28674b
