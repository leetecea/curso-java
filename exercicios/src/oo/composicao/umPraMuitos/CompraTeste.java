package oo.composicao.umPraMuitos;

public class CompraTeste {
	public static void main(String[] args) {
		Compra compra1 = new Compra();
		compra1.cliente = "João";
		compra1.adicionarItem(new Item("Caneta", 12, 5.99));
		compra1.adicionarItem(new Item("Borracha", 5, 2.99));
		compra1.adicionarItem(new Item("Caderno", 3, 12.69)); 
		
		System.out.println(compra1.itens.size());
		System.out.println(compra1.obterValorTotal());
		
		
// Só pra mostrar a relação bidirecional!!! -> Isso não faz sentido na vida real
		double total = compra1.itens.get(0).compra.itens.get(1).compra.obterValorTotal();
				System.out.println("O total é R$" + total);
	}
}
