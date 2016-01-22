package br.edu.ifpi.modelo;

public class ContaPoupanca extends Conta {
	public void atualiza(double taxa){
		setSaldo(this.getSaldo()+(this.getSaldo()*(taxa*3)));
		}

}
