package ativid.interfaces;
public class ContaPoupanca implements Conta {
	private double saldo;

	@Override
	public void deposita(double valor) {
		this.saldo += valor;
		
	}

	@Override
	public void saca(double valor) {
		this.saldo -= valor;
	}

	@Override
	public double getSaldo() {
		return this.saldo;
	}

	@Override
	public void atualiza(double taxaSelic) {
		this.saldo += (this.saldo*(taxaSelic*3));
		
	}

}
