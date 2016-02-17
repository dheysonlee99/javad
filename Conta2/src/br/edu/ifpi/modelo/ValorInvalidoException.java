package br.edu.ifpi.modelo;

public class ValorInvalidoException extends RuntimeException {
	
	public ValorInvalidoException(double valor){
		super("Valor invalido: " + valor);
	}

}

//opcional 7
//public class ValorInvalidoException extends Exception {
	
//	public ValorInvalidoException(double valor){
//		super("Valor invalido: " + valor);
//	}

//}