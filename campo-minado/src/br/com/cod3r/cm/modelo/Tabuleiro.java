package br.com.cod3r.cm.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import br.com.cod3r.cm.excecao.ExplosaoException;

public class Tabuleiro {
	private int linhas;
	private int colunas;
	private int minas;
	
	private final List<Campo> campos = new ArrayList<>();

	public Tabuleiro(int linhas, int colunas, int minas) {
		this.linhas = linhas;
		this.colunas = colunas;
		this.minas = minas;
		
	// inicializar tabuleiro
		gerarCampos();
		associarVizinhos();
		sortearMinas();
	}

	public void abrir(int linha, int coluna) {
		try {
			campos.parallelStream()
				.filter(c -> c.getLinha() == linha && c.getColuna() == coluna)
				.findFirst()
				.ifPresent(c -> c.abrir());
		} catch (ExplosaoException e) {
			campos.forEach(c -> c.setAberto(true)); // todos os campos serão abertos
			throw e; // relança a exceção pra que seja propagada para outras classes (classe que usa Tabuleiro vai precisar para encerrar o jogo)
		}
	}

	public void alternarMarcacao(int linha, int coluna) {
		campos.parallelStream()
			.filter(c -> c.getLinha() == linha && c.getColuna() == coluna)
			.findFirst()
			.ifPresent(c -> c.alternarMarcacao());
	}

	private void gerarCampos() {
		for (int linha = 0; linha < linhas; linha++) {
			for (int coluna = 0; coluna < colunas; coluna++) {
				campos.add(new Campo(linha, coluna));
			}
		}
	}
	
// irá percorrer a lista 2x, e a partir dai associar todo mundo com quem deve ser vizinho pela função adicionarVizinho()
	private void associarVizinhos() {
		for(Campo c1: campos) {
			for(Campo c2: campos) {
				c1.adicionarVizinho(c2);
			}
		}
	}
	
	private void sortearMinas() {
		long minasArmadas = 0;
		Predicate<Campo> minado = c -> c.isMinado(); // retorna todos os campos minados
		
		do {
			int aleatorio = (int) (Math.random() * campos.size()); // valor aleatorio vai variando atraves do Math.random. multiplica pelo tamanho da lista (0 até tamnho do array -1)
			campos.get(aleatorio).minar(); // sorteia uma mina no campo com index aleatorio
			minasArmadas = campos.stream().filter(minado).count(); // count retorna long, calcula a qtd de minas armadas nos campos. filtra minado e faz o count (retorna qtd de elementos na stream minado)
			
		} while(minasArmadas < minas); // faz isso enquanto minas armadas for menor que a qtd de minas
	}
	
	public boolean objetivoAlcancado() {
		return campos.stream().allMatch(c -> c.objetivoAlcancado());  // todos dão match com -> campo tem o objetico alcançado (
	} // todos campos tem objetivo alcançado? retorne true.
	
	public void reiniciar() {
		campos.stream().forEach(c -> c.reiniciar()); // para cada um dos campos reincialize (aberto, minado e marcado ficam false)
		sortearMinas(); // sortear as minas novamente
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder(); // quando tiver uma quantidade muito grande de concatenação, pode utilizar o StringBuilder
	
		
		sb.append("  ");
		for (int c = 0; c < colunas; c++) {
			sb.append(" ");
			sb.append(c);
			sb.append(" ");
		}
		
		sb.append("\n");
		
		int i = 0;
		for (int l = 0; l < linhas; l++) {
			sb.append(l);
			sb.append(" ");
			for (int c = 0; c < colunas; c++) {
				sb.append(" ");				
				sb.append(campos.get(i));
				sb.append(" ");
				i++;
			}
			sb.append("\n");
		}
		
		return sb.toString(); // converte tudo que foi concatenado em uma string
	}
}
