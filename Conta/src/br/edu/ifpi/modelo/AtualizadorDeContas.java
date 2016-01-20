package br.edu.ifpi.modelo;

public class AtualizadorDeContas {
	private double saldoTotal = 0;
	private double selic;
	public AtualizadorDeContas(double selic){
		this.selic = selic;
		}
	public void roda(Conta c){
		System.out.println(c.getSaldo());
		c.atualiza(selic);
		System.out.println(c.saldo);
		saldoTotal += c.saldo;
	
		}
	public double getSaldoTotal(){
		return this.saldoTotal = saldoTotal;
		}
	
	

}
