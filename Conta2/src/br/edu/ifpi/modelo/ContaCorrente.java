package br.edu.ifpi.modelo;

public class ContaCorrente extends Conta {
	public void atualiza(double taxa){
		super.atualiza(taxa*2);
	}
	public void deposita(double valor){
		super.deposita(valor-0.10);
	}

}
