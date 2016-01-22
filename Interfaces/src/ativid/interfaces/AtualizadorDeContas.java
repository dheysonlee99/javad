package ativid.interfaces;

public class AtualizadorDeContas {
	private double saldoTotal = 0;
	private double selic;
	public AtualizadorDeContas(double selic){
		this.selic = selic;
		}
	public void roda(Conta c){
		System.out.println("Saldo Anterior: "+c.getSaldo());
		c.atualiza(selic);
		System.out.println("Saldo Final: "+c.saldo);
		saldoTotal += c.saldo;
	
		}
	public double getSaldoTotal(){
		return  saldoTotal;
		}
	public void setSaldoTotal(double saldoTotal){
		this.saldoTotal = saldoTotal;
	}
	
	

}
