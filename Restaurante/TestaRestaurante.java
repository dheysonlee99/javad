

public class TestaRestaurante {

	public static void main(String[] args) {
		Restaurante restaurante = new Restaurante("Cajuina", 10);
		
		Pedido p1 = new Pedido("Agua s/ gas", 2);
		Mesa x = restaurante.abrirMesa(10);
		
		x.adicionarPedido(p1);
		p1 = new Pedido("bananada", 20);
		x.adicionarPedido(p1);
		p1 = new Pedido("ovos estrelados", 30);
		x.adicionarPedido(p1);
		p1 = new Pedido("feijoada", 2);
		x.adicionarPedido(p1);
		p1 = new Pedido("pao com leite", 80);
		x.adicionarPedido(p1);
		p1 = new Pedido("salada ", 100);
		x.adicionarPedido(p1);
		x.setComTaxa(true);
		
		x.setRateio(2);

		x.juntarMesa(y);
		
		Mesa y = restaurante.abrirMesa(2);
		p2 = new Pedido("caipirinha", 220);
		y.adicionarPedido(p2);
		p2 = new Pedido("estrogonofe", 320);
		y.adicionarPedido(p2);
		p2 = new Pedido("copo de chop", 20);
		y.adicionarPedido(p2);
		p2 = new Pedido("farofa de ovo", 99);
		y.adicionarPedido(p2);
		p2 = new Pedido("", 2);
		y.adicionarPedido(p2);
		y.setComTaxa(false);
		y.setRateio(4);

		x.j

		
		System.out.println(restaurante);
		
		for (Mesa mesa : restaurante.getMesas()) {
			if (mesa.getStatus() == Mesa.OCUPADA)
				System.out.println(mesa);
		}
		
	}

}