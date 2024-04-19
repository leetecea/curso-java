package oo.heranca.desafio;

// implements -> usado quando se quer usar determinada Interface
public class Ferrari extends Carro implements Esportivo, Luxo  {
	
	private boolean ligarTurbo = false;
	private boolean ligarAr = false;
	
	public Ferrari(){
		this(315);
	}
	
	public Ferrari(int velocidadeMaxima){
		super(velocidadeMaxima);
		setDelta(15);
	}
	
	@Override
	public void ligarTurbo() {
		ligarTurbo = true;		
	}
	
	@Override
	public void desligarTurbo() {
		ligarTurbo = false;	
	}
	
	@Override
	public void ligarAr() {
		ligarAr = true;	
	}
	
	@Override
	public void desligarAr() {
		ligarAr = false;	
	}
	
	@Override
	public int getDelta() {
		if(ligarTurbo && !ligarAr) {
			return 35;
		} else if(ligarTurbo && ligarAr) {
			return 30;
		} else if(!ligarTurbo && !ligarAr) {
			return 20;
		} else {
			return 15;			
		}
	}
	
	// não preciso mais subsecrever, pois já defini o delta=15
	// se quiser sobrescrever, precisa manter public, não diminuir o nivel de acesso
//	@Override
//	public void acelerar() {
//		velocidadeAtual += 15;
//	}
}
