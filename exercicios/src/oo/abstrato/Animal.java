package oo.abstrato;

public abstract class Animal {
	
	public String respirar(){
		return "CO2";
	}
// é como se voce conseguisse implementar o método respirar, mas não o método mover	
	public abstract String mover(); // só consegue aplicar abstract ao método 
									// se a classe também ssfor abstract
}
