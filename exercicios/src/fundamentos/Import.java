package fundamentos;

import java.util.Date;

// imports ficam fora da classe
// esta dentro do java.lang pode usar sem importar,
// mas qualquer outro precisa importar

// Ctrl + shif + O -> Organiza os imports, retira imports não usados e adiciona 
public class Import {
	public static void main(String[] args) {
		
		java.lang.String b = "boa tarde!";
		System.out.println(b);
		
		Date d = new Date();
		
		System.out.println(d);
		
//		JButton botao = new JButton();
	}
}
