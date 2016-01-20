package br.edu.ifpi.modelo;

public class Conta {
	protected double saldo;
	
	public void deposita(double valor){
		this.saldo += valor;
		}
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