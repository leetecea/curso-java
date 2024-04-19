package generics;

public class CaixaObjeto {
	
	private Object coisa; // atributo privado com tipo mais generico do Java -> Object
	// atributo de instancia do objeto CaixaObjeto
	
	public void guardar(Object coisa) { // set
		this.coisa = coisa; // this.coisa recebe a coisa recebida pelo parametro
	}
	
	public Object abrir() { // get
		return coisa; 
	}
}
