package generics;

public class Caixa<T> { // <T> notação de generics
// Igual a classe CaixaObjeto, mas trocando Object por T
// Tipo generico -> Tipo que nao foi definido ainda
	private T coisa;
	
	public void guardar(T coisa) {
		this.coisa = coisa;
	}
	
	public T abrir() {
		return coisa;
	}
}
