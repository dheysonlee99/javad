package br.edu.ifpi.aplicacao;

import br.edu.ifpi.modelo.AtualizadorDeContas;
import br.edu.ifpi.modelo.Banco;
import br.edu.ifpi.modelo.Conta;
import br.edu.ifpi.modelo.ContaCorrente;
import br.edu.ifpi.modelo.ContaPoupanca;

public class TestaContas {
	public static void main(String[] args) {
		
	
//	Conta c = new Conta();
//	ContaCorrente cc = new ContaCorrente();
//	ContaPoupanca cp = new ContaPoupanca();
//	
//	c.deposita(1000);
//	cc.deposita(1000);
//	cp.deposita(1000);
//	
//	AtualizadorDeContas adc = new AtualizadorDeContas(0.01);
	
//	adc.roda(c);
//	adc.roda(cc);
//	adc.roda(cp);
//	
//	System.out.println(c.getSaldo());
//	System.out.println(cc.getSaldo());
//	System.out.println(cp.getSaldo());
//
//	System.out.println("Saldo Total: "+ adc.getSaldoTotal());
	
	Banco banco = new Banco();
	
	Conta conta = new ContaPoupanca();
	banco.adiciona(conta);
	Conta conta2 = new ContaCorrente();
	banco.adiciona(conta2);
	Conta conta3 = new ContaPoupanca();
	banco.adiciona(conta3);
	Conta conta4 = new ContaPoupanca();
	banco.adiciona(conta4);
	Conta conta5 = new ContaCorrente();
	banco.adiciona(conta5);
	Conta conta6 = new ContaCorrente();
	banco.adiciona(conta6);
	
	for (Conta contas : banco.conta) {
		contas.deposita(3000);
		
	}
	
	AtualizadorDeContas adc2 = new AtualizadorDeContas(0.5);
	
	for (Conta contas: banco.conta) {
		adc2.roda(contas);
		
		
	}
	System.out.println("Saldo Total: "+ adc2.getSaldoTotal());
	
	
	
	}
	

	
	
}