package br.edu.ifpi.modelo;

public class Banco {
	public Conta conta[];
	private int contadorDeContas= 0;
	
	public Banco(){
		this.conta = new Conta[20];
		for (int i = 0; i < conta.length; i++) {
			conta[i] = new ContaCorrente();
			}
		}
	public void adiciona(Conta c){
		conta[contadorDeContas++] = c;
		}
	public Conta pegarConta(int x){
		return conta[x];
				
	}
	
	public int pegarTotalDeContas(){
		return contadorDeContas;
	}

}
