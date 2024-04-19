package excecao.personalizadaB;

// validação que não deixa um número ser negativo
@SuppressWarnings("serial")
public class NumeroForaIntervaloException extends Exception {
	
	private String nomeDoAtributo;
	
	public NumeroForaIntervaloException(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	
	public String getMessage() {
		return String.format("O atributo '%s' está fora do intervalo.",
				nomeDoAtributo);
	}
	
}
