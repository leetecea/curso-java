package classe;

public class DesafioDataTeste {
	public static void main(String[] args) {
		
		DesafioData data = new DesafioData(25, 3, 2024);
		
		DesafioData dataAmanha = new DesafioData();
//		dataAmanha.dia = 26;
//		dataAmanha.mes = 03;
//		dataAmanha.ano = 2024;
		
		System.out.println(data.obterDataFormata());
		System.out.println(dataAmanha.obterDataFormata());
		
	}
}
