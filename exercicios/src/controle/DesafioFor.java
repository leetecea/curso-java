package controle;

public class DesafioFor {
	public static void main(String[] args) {
		
//		String valor = "#";
//		for (int i = 1; i <= 5; i++) {
//			System.out.println(valor);
//			valor += "#";
//		}
		
		// Não pode usar valor numérico para controlar o laço.
		
		for(String degrau = "#"; !degrau.equals("######"); degrau += "#" ) {
			System.out.println(degrau);
		}
		
	}
}
