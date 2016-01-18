
public class Restaurante {
	
	private String nome;
	private Mesa[] mesas;
	
	public Restaurante(String nome, int qtdDeMesas) {
		this.nome = nome;
		this.mesas = new Mesa[qtdDeMesas];
		for (int i = 0; i < mesas.length; i++) {
			mesas[i] = new Mesa(i+1);
		}
	}
	
	public Mesa abrirMesa(int numero){
		Mesa m = this.mesas[numero-1];
		m.setStatus(Mesa.OCUPADA);
		return m;
	}

	public void juntarMesa(int w, int z){
		Mesa a = this.mesas[w-1];
		Mesa b = this.mesas[z-1];
		b = a;
	}
	
	public Mesa[] getMesas() {
		return mesas;
	}
	
	public String verSituacaoEValoresDasMesas(){
		int contDisponivel = 0;
		int contOcupada = 0;
		int contReservada = 0;
		double valorTotalAtual = 0;
		
		for (Mesa mesa : mesas) {
			if (mesa.getStatus() == Mesa.DISPONÍVEL)
				contDisponivel++;
			if (mesa.getStatus() == Mesa.OCUPADA)
				contOcupada++;
			if (mesa.getStatus() == Mesa.RESERVADA)
				contReservada++;
			
			valorTotalAtual += mesa.conta();
		}
		
		return "\n Mesas--> Ocupadas:  "+contOcupada+", Disponíveis:  "+contDisponivel
				+ ", Reservadas: " + contReservada
				+ "\n Valor Atual R$ " + valorTotalAtual;
	}
	
	@Override
	public String toString() {
		return "Restaurante: " + nome + ", Qtd Mesas: " + this.mesas.length + verSituacaoEValoresDasMesas();
	}

}
