package collections;

import java.util.ArrayList;
import java.util.List;

public class Lista {
	public static void main(String[] args) {
		List<Usuario> lista = new ArrayList<>();
		
		Usuario u1 = new Usuario("Ana"); // instanciou uma variavel u1 e adicionou um elemento
		lista.add(u1); // adicionou essa variavel no conj. lista
		
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Lia"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Manu"));
		lista.add(new Usuario("Manu"));
		
		System.out.println(lista.get(3)); // acessar pelo índice
		
		System.out.println(">>>> " + lista.remove(1)); // retorna o valor do objeto que você excluiu -> Meu nome é Carlos
		System.out.println(lista.remove(new Usuario("Manu"))); // retorna true/false -> se removeu ou nao a Manu
		System.out.println(lista.remove(new Usuario("Manu")));
		System.out.println(lista.remove(new Usuario("Manu")));
		
		System.out.println("Tem? " + lista.contains(new Usuario("Lia"))); // funciona devido ao EQUALS e HASHCODE
		System.out.println("Tem? " + lista.contains(u1));
		
		for(Usuario u: lista) {
			System.out.println(u.nome);
		}
	}
}
