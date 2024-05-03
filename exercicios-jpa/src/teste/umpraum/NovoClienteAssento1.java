package teste.umpraum;

import infra.DAO;
import modelo.umpraum.Assento;
import modelo.umpraum.Cliente;

public class NovoClienteAssento1 {

	public static void main(String[] args) {
		
		Assento assento = new Assento("16A", 1573.8);
		Cliente cliente = new Cliente("Carlos", assento);
		
		DAO<Object> dao = new DAO<>(); // tipo Object para poder usar tanto com Assento como com o Cliente
		
		dao.abrirT()
			.incluir(assento)
			.incluir(cliente)
			.fecharT()
			.fechar();
	}
}