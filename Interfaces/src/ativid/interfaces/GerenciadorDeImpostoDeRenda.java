package ativid.interfaces;
public class GerenciadorDeImpostoDeRenda {
	private double total;
	
	public void adiciona(Tributavel t){
		System.out.println("Adicionando Tributavel "+ t.calculaTributos());
		
		this.total += t.calculaTributos();
	}
	public double getTotal(){
		return this.total;
	}
}
