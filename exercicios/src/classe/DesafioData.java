package classe;

// crie classe com 3 atributos - mes, dia e ano
// dentro da ClasseDataTeste instancie 2 datas

public class DesafioData {
	int dia;
	int mes;
	int ano;
	
	// Objetos por padrão recebem -> null
	String s = null; // nao aponta pra nenhum local de memória
	
	DesafioData(){
//		dia = 1;
//		mes = 1;
//		ano = 1970;
		this(1, 1, 1970); // esta chamando o construtor debaixo 
		
//		int a; // define variavel local (dentro de construtor/metodo) e voce não inicializar essa variavel
//		a = 0; // variavel INICIALIZADA
//		System.out.println(a); // nao podera utiliza-la, pois ela não sera inicializada por padrao.
		// Quando criar uma constante -> precisa definir até o objeto ter sido criado
	}

	DesafioData(int dia, int mes, int ano){
		this.dia = dia;
		this.mes =  mes;
		this.ano = ano;
		
		// 1º uso do THIS -> usar para referenciar o objeto atual 
	}
	
//	String formato = "%s/%s/%s"; // caso queira utilizar a variavel em outros metodos, declare fora
	// se tornara uma VARIAVEL DE INSTÂNCIA/CLASSE
	String obterDataFormata () {
		String formato = "%s/%s/%s"; // VARIAVEL LOCAL -> definida dentro de um metodo
									// só estara disponível a partir da definição da mesma pra baixo 
		 return String.format(formato, dia, mes, ano);
	}
	
	static void teste() {
//		this.dia = 3;
	// não é possível utilizar o THIS em um método static, pois o THIS é uma das instancias da classe
	}
	
}
