package collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
// Offer e Add -> os dois adicionam elementos na fila
// Diferença está no comportamento que ocorre quando a fila está CHEIA!
		
		fila.add("Ana"); // -> lançará uma exceção caso a fila esteja cheia
		fila.offer("Bia"); // -> retorna falso caso a fila esteja cheia e nao adiciona o elemento na fila
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
// Peek() e Element() -> obter o próximo elemento da fila (sem remover)
// Diferença está no comportamento que ocorre quando a fila está VAZIA!
		
 		System.out.println(fila.peek()); 
		System.out.println(fila.peek());// se fila estiver VAZIA, retorna NULL
		System.out.println(fila.element());
		System.out.println(fila.element()); // se fila estiver VAZIA, dá um erro NoSuchElemenException
		
//		fila.size(); -> mostra o tamanho da fila
//		fila.clear(); // -> limpa a fila
//		fila.isEmpty(); -> diz se a fila está vazia
//		fila.contains(...)
		
		
// Poll() e Remove() -> Pega o próximo elemento e o remove
// Diferença está no comportamento que ocorre quando a fila está VAZIA!
		System.out.println(fila.poll()); //-> retorna o 1 elemento e o remove
		System.out.println(fila.poll());
		System.out.println(fila.remove()); //-> também remove o 1 elemento - Carlos
		System.out.println(fila.peek());
		fila.clear();
		System.out.println(fila.poll()); //-> retorna null, pois a fila está vazia
		System.out.println(fila.remove()); //  se fila estiver VAZIA, dá um erro NoSuchElemenException
		
	}
	
}