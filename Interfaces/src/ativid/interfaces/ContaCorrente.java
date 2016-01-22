package ativid.interfaces;
public class ContaCorrente implements Conta, ContaTributavel {
	private double saldo;

	@Override
	public double calculaTributos() {
		return this.saldo*0.01;
	}

	@Override
	public void deposita(double valor) {
		this.saldo += this.saldo-0.10;
		
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
		this.saldo += (this.saldo*(taxaSelic*2));
	}

}
