
public class Mesa {
	
	public final static String DISPONIVEL = "Disponivel";
	public final static String OCUPADA = "Ocupada";
	public final static String RESERVADA = "Reservada";
	private static final int MAX_PEDIDOS = 4;
	private static final String PRINCIPAL = "Principal";
	private static final String SECUNDARIA = "Secundaria";

	private int numero;
	private String status;
	private Pedido[] pedidos;
	private int qtdMaximaDePedidosAtual = MAX_PEDIDOS;
	private int contadorDePedido = 0;
	private boolean comTaxa;
	private int rateio;
	private Mesa mesaJuntada;
	private String tipo;

	public Mesa(int numero) {
		this.numero = numero;
		this.status = Mesa.DISPONIVEL;
		this.pedidos = new Pedido[qtdMaximaDePedidosAtual];
		this.comTaxa = true;
		this.tipo = Mesa.PRINCIPAL;
	}
	
	public void juntar(Mesa mesa){
		this.mesaJuntada = mesa;
		mesa.mesaJuntada = this;
		mesa.tipo = Mesa.SECUNDARIA;
		
		if (mesa.getStatus() != Mesa.OCUPADA)
			mesa.setStatus(Mesa.OCUPADA);
	}

	
	public void adicionarPedido(Pedido pedido){
		if (this.status != Mesa.OCUPADA){
			System.out.println("Favor abrir mesa primeiro");
			return;
		}
		
		pedidos[contadorDePedido++] = pedido;
		
		if (contadorDePedido == qtdMaximaDePedidosAtual){
			qtdMaximaDePedidosAtual += MAX_PEDIDOS;
			
			Pedido[] temp = this.pedidos;
			
			this.pedidos = new Pedido[qtdMaximaDePedidosAtual];
			
			for (int i = 0; i < temp.length; i++) {
				this.pedidos[i] = temp[i];
			}
			
			
		}
		
	}
	
	public double conta(){
		double valor = 0;
		if ((this.tipo == Mesa.PRINCIPAL && mesaJuntada != null) || (this.tipo == Mesa.SECUNDARIA)){
			for (Pedido pedido : this.pedidos) {
				if (pedido == null) break;
				valor += pedido.getValor();
			}
			for (Pedido pedido : mesaJuntada.pedidos) {
				if (pedido == null) break;
				valor += pedido.getValor();
			}
		}else{
			for (Pedido pedido : this.pedidos) {
				if (pedido == null) break;
				valor += pedido.getValor();
			}
		}
		
		if (comTaxa) valor = valor*1.1;
		
		return valor;
	}

	public int getNumero() {
		return numero;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getStatus() {
		return status;
	}
	
	public Pedido[] getPedidos() {
		return pedidos;
	}
	
	public void setComTaxa(boolean comTaxa) {
		this.comTaxa = comTaxa;
	}
	
	public void setRateio(int rateio) {
		this.rateio = rateio;
	}
	
	@Override
	public String toString() {
		String str = "\n\nMesa " +numero 
				+ " - Pedidos Realizados: " + this.contadorDePedido + "\n"
				+ " Descricao \t\t Valor \n ------------------------- \n";
				for (Pedido pedido : pedidos) {
					if (pedido==null) break;
					str+=pedido.getDescricao()+"\t\t"+pedido.getValor()+"\n";
				}
				str += "-------------------------\n";
				str += "Valor Conta R$ " + conta();
				
				if (this.rateio > 1){
					str += "\nRateio R$ " + conta()/rateio;
				}
		
		return str;
	} 

}