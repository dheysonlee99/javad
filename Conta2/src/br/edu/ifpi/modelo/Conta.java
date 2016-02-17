package br.edu.ifpi.modelo;

public class Conta {
	protected double saldo;
	
	public void deposita(double valor){
//		if(valor < 0){
//			throw new IllegalArgumentException("voce tentou depositar um valor negativo");
//		}
		if(valor < 0){
			throw new ValorInvalidoException(valor);
		}
		else{
			this.saldo += valor;
		}
	}

	//opcional 7
	//public void deposita(double valor) throws ValorInvalidoException{
	//	if(valor < 0){
	//		throw new ValorInvalidoException(valor);
	//	}
	//	else{
	//		this.saldo += valor;
	//	}
	//}

	public void saca(double valor){
		this.saldo -= valor;
	}
	public double getSaldo(){
		return  saldo;
	}
	public void setSaldo(double saldo){
		this.saldo = saldo;
	}
	public void atualiza(double taxa){
		this.saldo += this.saldo*taxa;
	}

}