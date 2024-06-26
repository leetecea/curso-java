package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	public static void main(String[] args) {
			
			Map<Integer, String> usuarios = new HashMap<>();
			
			usuarios.put(1, "Roberto"); // put -> adiciona/substitui o valor caso já exista a chave no map
			usuarios.put(20, "Ricardo");
			usuarios.put(3, "Rafaela");
			usuarios.put(4, "Rebeca");
			
			System.out.println(usuarios.size());
			System.out.println(usuarios.isEmpty());
			
			System.out.println(usuarios.keySet()); // retorna as chaves
			System.out.println(usuarios.values()); // retorna os valores
			System.out.println(usuarios.entrySet());// retorna chave=valor
			
			System.out.println(usuarios.containsKey(20));
			System.out.println(usuarios.containsValue("Rebeca"));
			
			System.out.println(usuarios.get(4));
			System.out.println(usuarios.remove(1));
			System.out.println(usuarios.remove(4, "Gui")); // remove passando chave, valor
			
			for(int chave: usuarios.keySet()) {
				System.out.println(chave);
			}
			
			for(String valor: usuarios.values()) {
				System.out.println(valor);
			}
// Para percorrer chave e valor ao mesmo tempo:			
			for(Entry<Integer, String> registro: usuarios.entrySet()) {
				System.out.print(registro.getKey() + " -> ");
				System.out.println(registro.getValue());
			}
		}
}
