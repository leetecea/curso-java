package br.com.cod3er.cm.modelo;

import java.util.ArrayList;
import java.util.List;

import br.com.cod3er.cm.excecao.ExplosaoException;

public class Campo {
	private final int linha;
	private final int coluna;
	
	private boolean aberto = false;
	private boolean minado = false;
	private boolean marcado = false;
	
	private List<Campo> vizinhos = new ArrayList<>();
	
	Campo(int linha, int coluna) {
		this.linha = linha;
		this.coluna = coluna;
	}
	
	boolean adicionarVizinho(Campo vizinho) {
		boolean linhaDiferente = linha != vizinho.linha;
		boolean colunaDiferente = coluna != vizinho.coluna;
		boolean diagonal = linhaDiferente && colunaDiferente;
		
		int deltaLinha = Math.abs(linha - vizinho.linha);
		int deltaColuna = Math.abs(coluna - vizinho.coluna);
		int detalGeral = deltaColuna + deltaLinha;
		
		if(detalGeral == 1 && !diagonal) {
			vizinhos.add(vizinho);
			return true;
		} else if(detalGeral == 2 && diagonal) {
			vizinhos.add(vizinho);
			return true;
		} else {
			return false;
		}
	}
	
	void alternarMarcacao() {
		if(!aberto) {
			marcado = !marcado;
		}
	}
	
	boolean abrir() {
		
		if(!aberto && !marcado) {
			aberto = true;
			
			if(minado) {
				throw new ExplosaoException(); // uma excecao será gerada e será o fluxo do usuário perdendo o jogo
			}
			
			if(vizinhancaSegura()) {
				vizinhos.forEach(v -> v.abrir()); // chamada recursiva: chamando o método abrir dentro dele mesmo (método chamando a si mesmo)
			} // irá abrir todos os vizinhos, desde que se tenha uma vizinhança segura
			
			return true;
		} else {
			return false;			
		}
	}
	
	boolean vizinhancaSegura() {
		return vizinhos.stream().noneMatch(v -> v.minado); // nenhum vizinho pode bater com esse predicato (v -> v.minado)
	} // (v -> v.minado) : se nenhum vizinho estiver minado, entao a vizinhança é segura
	
	void minar() {
		minado = true;
	}
	
	public boolean isMinado() {
		return minado;
	}
	
	public boolean isMarcado() {
		return marcado;
	}
	
	void setAberto(boolean aberto) {
		this.aberto = aberto;
	}

	public boolean isAberto() {
		return aberto;
	}

	public boolean isFechado() {
		return !isAberto();
	}

	public int getLinha() {
		return linha;
	}

	public int getColuna() {
		return coluna;
	}
	
	boolean objetivoAlcancado() {
		boolean desvendado = !minado && aberto;
		boolean protegido = minado && marcado;
		return desvendado || protegido;
	}
	
	long minasNaVizinhanca() {
		return vizinhos.stream().filter(v -> v.minado).count();
	}
	
	void reiniciar() {
		aberto = false;
		minado = false;
		marcado = false;
	}
	
	public String toString() {
		if(marcado) {
			return "x";
		} else if(aberto && minado) { // perdeu o jogo
			return "*";	 // bomba
		} else if(aberto && minasNaVizinhanca() > 0) { // campo aberto e com minas na vizinhaça
			return Long.toString(minasNaVizinhanca()); // retorna a qtd de minas na vizinhaça
		} else if(aberto) { // qtd de minas é 0
			return " ";
		} else { // mina fechada
			return "?"; 
		}
	}
	
	
}
