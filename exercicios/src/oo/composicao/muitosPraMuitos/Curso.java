package oo.composicao.muitosPraMuitos;

import java.util.ArrayList;
import java.util.List;

public class Curso {
	final String nome;
// quando add final -> torna a lista constante
// significa que não pode mudar o endereço de memória da lista, embora o conteudo da lista seja variavel 
// ex: this.cursos = new ArrayList<>();
	final List<Aluno> alunos = new ArrayList<>();

	Curso(String nome) {
		this.nome = nome;
	}

	void adicionarAluno(Aluno aluno) {
		// relação bidirecional -> add aluno curso + add esse curso ao aluno
		this.alunos.add(aluno);
		aluno.cursos.add(this);
	}
}
