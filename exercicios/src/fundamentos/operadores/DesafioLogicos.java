package fundamentos.operadores;

public class DesafioLogicos {
	public static void main(String[] args) {
		// trabalho na terça 
		// trabalho na quinta
		
		// trabalho de terça OU quinta deu certo: tv de 32' + tomar sorvete
		// os dois deram certo: comprar tv 50' + sorvete
		
		// caso nenhum trabalho de certo: ficar em casa, sem tv e sorvete (mais saudavel por nao tomar sorvete - negação lógica)
		
		
		boolean trabalhoTerça = true;
		boolean trabalhoQuinta = false;
		
		boolean comprouTv50 = trabalhoQuinta && trabalhoTerça;
		boolean comprouTv32 = trabalhoQuinta ^ trabalhoTerça;
		boolean tomouSorvete = comprouTv32 || comprouTv50;
		
		
		System.out.println("Comprou TV 50\":" + comprouTv50);
		System.out.println("Comprou TV 32\":" + comprouTv32);
		System.out.println("Tomou sorvete? " + tomouSorvete);
		System.out.println("Mais saudável? " + !tomouSorvete);
		
	}
}
