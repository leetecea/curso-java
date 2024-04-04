package oo.composicao.umPraUm;

// Relacionamento -> 1 para 1
public class Motor {
	
// Para criar uma relação bidirecional-> cria-se uma instancia carro na classe do Motor:
	Carro carro;
	boolean ligado = false;
	double fatorInjecao = 1;
	
// Nessa linha, cria-se um construtor que recebe um objeto do tipo Carro
// como parametro 
	Motor(Carro carro){
		this.carro = carro; //e atribui ao uma variavel de instância chamada carro
	}
	
	int giros() {
		if (!ligado) {
			return 0;
		}else {
			return (int) Math.round(fatorInjecao * 3000);			
		}
	}
	
}
