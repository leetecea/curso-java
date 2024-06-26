package collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	// Last in, first out -> ultimo a entrar é o primeiro a sair 
	// ex: pilha de livros, o 1 livro da pilha é o primeiro a sair 
	public static void main(String[] args) {
		Deque<String> livros = new ArrayDeque<String>();
				
				livros.add("O Pequeno Príncipe"); // retorna valor booleano
				livros.push("Don Quixote");
				livros.push("O Hobbit");
				
				System.out.println(livros.peek()); // retorna ultimo elemento da pilha 
				System.out.println(livros.element());
				
				System.out.println("-----");
				for(String livro: livros) {
					System.out.println(livro);
				}
				System.out.println("-----");
				
				System.out.println(livros.pop());
				System.out.println(livros.poll());
				System.out.println(livros.poll());
				System.out.println(livros.poll());
				System.out.println(livros.poll());
				System.out.println(livros.pop()); //-> outra opção para remover
//				System.out.println(livros.remove());
				
				// livros.size();
				// livros.clear();
				// livros.contains();
				// livros.isEmpty();
			}
}
