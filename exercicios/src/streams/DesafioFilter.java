package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {
	// 2 funções lambdas para fazer 2 filtros diferentes
	// usar map no final
	// filter().filter().map()
	
	public static void main(String[] args) {
		
		Voluntario v1 = new Voluntario("Roberta", 5, "BA");
		Voluntario v2 = new Voluntario("Monica", 6, "SE");
		Voluntario v3 = new Voluntario("Carlos", 7, "BA");
		Voluntario v4 = new Voluntario("Humberto", 8, "BA");
		Voluntario v5 = new Voluntario("Robson", 1, "RJ");

		
		List<Voluntario> voluntarios = Arrays.asList(v1, v2, v3, v4, v5);
		
	// voluntarios com mais de 6 trabalhos voluntarios realizados
	// voluntarios da BA
		
		Predicate<Voluntario> trabalhoVoluntario = t -> t.qtdVoluntariados >= 5;
		Predicate<Voluntario> voluntariosDaBA = v -> v.estado == "BA";
		Function<Voluntario, String> apresentacao = 
				v -> v.nome + " é da BA e tem " + v.qtdVoluntariados + " trabalhos voluntários realizados.";
		
		voluntarios.stream()
			.filter(trabalhoVoluntario)
			.filter(voluntariosDaBA)
			.map(apresentacao)
			.forEach(System.out::println);
	}
}
