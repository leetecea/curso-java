package controle;

public class Break { //Sai do laço de repetição
	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			
			if(i == 5) {
				break; // pode ser usado para encontrar algo dentro de uma lista e depois de encontrar sair da lista
						// para nao percorrer toda a lista
						// break faz mais sentido utilizar dentro de laços de repetição
			}
			
			System.out.println(i);
		}
		
		System.out.println("Fim!");
	}
}
