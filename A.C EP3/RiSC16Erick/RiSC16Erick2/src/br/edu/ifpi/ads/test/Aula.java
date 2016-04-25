package br.edu.ifpi.ads.test;

public class Aula {

	public static void main(String[] args) {
		
		boolean[] one = {false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,true};
		//0000000000000001
		
		short a = somar((short) 1, (short) 1);
		System.out.println(a);

	}
	
	public static short somar(short variavel1, short variavel2){
		short resultado = (short) (variavel1 + variavel2);
		return resultado;
	}
	
	

}
