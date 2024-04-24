package generics;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Pares<C extends Number, V> {
	
	private final Set<Par<C, V>> itens = new LinkedHashSet<>();// LinkedHashSet -> garante ordem de inclusão
	
	public void adicionar(C chave, V valor) {
		if (chave == null) return; // se chave for null, ele sai do método. return = retorne 
		
		Par<C,V> novoPar = new Par<C, V>(chave, valor);
		
		if(itens.contains(novoPar)) { 
			itens.remove(novoPar); // se itens contém o novoPar (chave), ele exclui o novoPar. e no final ele irá adicionar, atualizando o mesmo
		}
		
		itens.add(novoPar);
	}

	public V getValor(C chave) { // pegar o valor a partir do parametro a chave
		if(chave == null) return null;
		
		Optional<Par<C, V>> parOpcional = itens.stream()
				.filter(par -> chave.equals(par.getChave())) //se a chave passada for igual a chave de algum dos pares, irá filtrar apenas os pares que tiver a mesma chave passada
				.findFirst(); // pega o primeiro par
		
		return parOpcional.isPresent() 
				? parOpcional.get().getValor() : null;
	}
	// não vale a pena implementar o comparable, pois estamos usando tipos genericos
	// nao tem como fazer comparação de forma eficiente no nivel de generalização utilizada 
}
