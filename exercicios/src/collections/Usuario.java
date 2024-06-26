package collections;

public class Usuario {
	String nome;
		
		Usuario(String nome) { // obrigatoriamente construtor deve ser chamado 
			this.nome = nome; // para poder criar um usuário, esse usuario recebe o nome dele
		} 
		
		public String toString() {
			return "Meu nome é " + this.nome + ".";
		}
		
		// EQUALS E HASHCODE -> para comparar objetos
	
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((nome == null) ? 0 : nome.hashCode());
			return result;
		}
		
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Usuario other = (Usuario) obj;
			if (nome == null) {
				if (other.nome != null)
					return false;
			} else if (!nome.equals(other.nome))
				return false;
			return true;
		}
}
