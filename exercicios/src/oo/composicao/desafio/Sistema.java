package oo.composicao.desafio;

public class Sistema {
	public static void main(String[] args) {
				
		Compra compra1 = new Compra();
		compra1.adicionarItem("Caneta", 12, 5);
		compra1.adicionarItem("Caderno", 3, 14); 
		
		Compra compra2 = new Compra();
		compra2.adicionarItem("Borracha", 5, 500);
		compra2.adicionarItem("Caderno", 3, 185); 
		
		Cliente cliente = new Cliente("Maria Júlia");
		cliente.adicionarCompra(compra1);
		cliente.compras.add(compra2);
		System.out.println(cliente.obterValorTotal());
	}
}
