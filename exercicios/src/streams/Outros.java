package streams;

import java.util.Arrays;
import java.util.List;

public class Outros {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Luna", 6.1);
		Aluno a3 = new Aluno("Gui", 8.1);
		Aluno a4 = new Aluno("Gabi", 10);
		Aluno a5 = new Aluno("Ana", 7.1);
		Aluno a6 = new Aluno("Pedro", 9.1);
		Aluno a7 = new Aluno("Gui", 8.1);
		Aluno a8 = new Aluno("Maria", 10);
		
		List<Aluno> alunos = 
				Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);
		
		System.out.println("distinct..."); // Para não pegar valor duplicado
		alunos.stream().distinct().forEach(System.out::println); 
		
		System.out.println("\nSkip/Limit");
		alunos.stream()
			.distinct() // apenas alunos distintos 
			.skip(2) // pula dois elementos
			.limit(2) // limita quantos elementos você quer pegar
			.forEach(System.out::println);
		
		System.out.println("\ntakeWhile");
		alunos.stream()
			.distinct()
			.skip(2) 
			.takeWhile(a -> a.nota >= 7) // pegue elementos enquanto acontecer determinada condição
			.forEach(System.out::println); // vai pegar os alunos aprovados até encontrar alguem que não foi aprovado
		// não pega TODOS aprovados
	}
	
}
