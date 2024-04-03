package classe;

public class ValorVsReferencia {
	public static void main(String[] args) {
	
		double a = 2;
		double b = a; // atribuição por valor (Tipo primitivo: int, double...) 
		
		a++;
		b--;
		
		System.out.println(a + " " + b);
		
		DesafioData d1 = new DesafioData(1,6, 2022);
		DesafioData d2 = d1; // atribuição por referencia (Objeto) 
		
		d1.dia = 25;		
		d2.ano = 2026;
		System.out.println(d1.obterDataFormata());
		System.out.println(d2.obterDataFormata());
		
		voltarDataParaValorPadrao(d1);
		System.out.println(d1.obterDataFormata());
		System.out.println(d2.obterDataFormata());
		
		int c = 5;
		alterarPrimitivo(c);
		System.out.println(c);
	
	}
	
	static void voltarDataParaValorPadrao (DesafioData d) {
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
	}
	
	static void alterarPrimitivo(int a) { // nao gera impacto no c, pois cria uma cópia
		a++;
		a = 2;
	}
}
