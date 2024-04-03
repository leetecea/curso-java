package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
	public static void main(String[] args) {
		
//		Set<String> listaAprovados = new HashSet<>(); // <String> -> define qual é o tipo
													// que o conjunto vai ter
		SortedSet<String> listaAprovados = new TreeSet<>(); // garante a ordem de inserção dos elementos
		listaAprovados.add("Ana");		// SortedSet: ordena por ordem alfabetica					
		listaAprovados.add("Carlos");	
		listaAprovados.add("Lucas");	
		listaAprovados.add("João");
		
		for (String candidato: listaAprovados) {
			System.out.println(candidato);
		}
		
		Set<Integer> nums = new HashSet<>();
		nums.add(1);		 						
		nums.add(20);	
		nums.add(150);	
		nums.add(13);
		
//		nums.get(2); -> não é possível acessar pelo índice, já que ele não existe no SET
		
		for (Integer n: nums) {
			System.out.println(n);
		}
	}

}
