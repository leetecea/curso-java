package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		//Informações do funcionario
		
		// Tipos numéricos int
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 54;
		int id = 5859595;
		long pontosAcumulados = 3_234_845_223L; 
		// colocar L no final sinaliza que é um literal
		// do tipo Long
		// se o literal passa do range/capacidade um int
		// você coloca L no final
		
		// Tipos numéricos reais
		float salario = 11_445.44F;
		// para colocar um literal dentro do float:
		// adicionar um F no final
		double vendasAcumuladas = 2_991_797_103.01;
		
		// Tipo booleano
		boolean estaDeFerias = false;
		char status = 'A'; // ativo
		
		//Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		//Numero de viagens
		System.out.println(numeroDeVoos / 2);
		
		//Ponto por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": ganha -> " + salario);
		System.out.println("Férias? " + estaDeFerias);
		System.out.println("Status: " + status);
	}
}
