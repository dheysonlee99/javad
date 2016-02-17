package br.edu.ifpi.aplicacao;

import br.edu.ifpi.modelo.Conta;
import br.edu.ifpi.modelo.ContaPoupanca;
import br.edu.ifpi.modelo.ValorInvalidoException;

public class TestaDeposita {
	public static void main(String[] args) throws ValorInvalidoException {
//		Conta cp = new ContaPoupanca();
//		try {
//			cp.deposita(-1100);
//		} catch (IllegalArgumentException e) {
//			System.out.println(e.getMessage());
//		}
//		
		Conta pp = new ContaPoupanca();
		try {
			pp.deposita(-1100);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
