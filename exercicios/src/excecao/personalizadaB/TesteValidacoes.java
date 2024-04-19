package excecao.personalizadaB;

import excecao.Aluno;

public class TesteValidacoes {
	// quando é exception, você obrigatoriamente precisa tratar os erros:

	public static void main(String[] args) {
		
		try {
			Aluno aluno = new Aluno("Ana", 7);
			Validar.aluno(aluno);
			
			Validar.aluno(null);
		} catch (StringVaziaException e) {
			System.out.println(e.getMessage());
		} catch (NumeroForaIntervaloException | IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
//		Validar.aluno(null); -> nao pode fazer isso, pois é preciso tratar esse erro

		System.out.println("Fim :)");
	}
	
}
