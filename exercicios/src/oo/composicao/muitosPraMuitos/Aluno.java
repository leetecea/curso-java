package oo.composicao.muitosPraMuitos;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	
	final String nome;
	final List<Curso> cursos = new ArrayList<>();
	
	Aluno(String nome){
		this.nome = nome;
	}
	
	void adicionarCurso(Curso curso) {
		//relação bidirecional -> add aluno curso + add esse curso ao aluno
		this.cursos.add(curso);
		curso.alunos.add(this);
	}
	
	Curso obterCursoPorNome(String nome) {
// for para percorrer todos os cursos de um aluno em busca de um
		for(Curso curso: this.cursos) {
//se nome do curso for igual nome retorne o curso	
			if(curso.nome.equalsIgnoreCase(nome)) {
				return curso;
			}
		}
		
		return null;
	}
	
// método usado para converter um obj em uma string 
	public String toString() {
		return nome;
	}
}
