package classe;

public class PrimeiroTrauma { 
	// COMUNICAÇÃO ENTRE STATIC - INSTANCIA
	// 1 - caso queira que o membro continue sendo um membro de instancia,
	//     será necessário criar uma instancia.
	// 2 - transforma a variavel em uma variavel static
	
	int a = 3;
	static int c = 4; // 2- criar a variavel de forma static
	public static void main(String[] args) {
		
		PrimeiroTrauma b = new PrimeiroTrauma(); //1- instanciar para conseguir acessar
		
		System.out.println(b.a);
		//dá erro, pois você nao pode acessar uma variavel de instancia a partir de um membro estatico
		
		System.out.println(c);
	}

}
