package br.edu.ifpi.modelo;




import br.edu.ifpi.modelo.ContaCorrente;
import br.edu.ifpi.modelo.ContaPoupanca;

public class TestaContas {
	public static void main(String[] args) {
		
		Banco banco = new Banco();
		ContaCorrente cc1 = new ContaCorrente();
		ContaPoupanca cp1 = new ContaPoupanca();
		ContaCorrente cc2 = new ContaCorrente();
		ContaPoupanca cp2 = new ContaPoupanca();
		ContaCorrente cc3 = new ContaCorrente();
		ContaPoupanca cp3 = new ContaPoupanca();
		ContaCorrente cc4 = new ContaCorrente();
		ContaPoupanca cp4 = new ContaPoupanca();
		ContaCorrente cc5 = new ContaCorrente();
		ContaPoupanca cp5 = new ContaPoupanca();
		ContaCorrente cc6 = new ContaCorrente();
		ContaPoupanca cp6 = new ContaPoupanca();
		ContaCorrente cc7 = new ContaCorrente();
		ContaPoupanca cp7= new ContaPoupanca();

		cc1.deposita(1000);
		cp1.deposita(2000);
		cc2.deposita(2300);
		cp2.deposita(4500);
		cc3.deposita(6700);
		cp3.deposita(8900);
		cc4.deposita(3400);
		cp4.deposita(7900);
		cc5.deposita(3300);
		cp5.deposita(34600);
		cc6.deposita(24600);
		cp6.deposita(120);
		cc7.deposita(100);
		cp7.deposita(15000);
		banco.adiciona(cc1);
		banco.adiciona(cp1);
		banco.adiciona(cc2);
		banco.adiciona(cp2);
		banco.adiciona(cc3);
		banco.adiciona(cp3);
		banco.adiciona(cc4);
		banco.adiciona(cp4);
		banco.adiciona(cc5);
		banco.adiciona(cp5);
		banco.adiciona(cc6);
		banco.adiciona(cp6);
		banco.adiciona(cc7);
		banco.adiciona(cp7);

		AtualizadorDeContas adc2 = new AtualizadorDeContas(0.5);
		
		for (Conta contas : banco.conta) {
			adc2.roda(contas);
			
			
		}
		
		System.out.println("Saldo Total: "+ adc2.getSaldoTotal());
		System.out.println("Total de Contas: "+ banco.pegarTotalDeContas());
	
	}
		
}
