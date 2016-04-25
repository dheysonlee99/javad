package br.edu.ifpi.ads.test;

import br.edu.ifpi.ads.ALU;

public class RiSC16Tests {

	public static void main(String[] args) {
		
		ALU alu = new ALU();
		
		boolean[] ten = {false,false,false,false,false,false,false,false,false,true,false,false,true,true,false,false};
		
		boolean[] sete = {true, false, false, false, false, false, false};
		boolean[] dez = {true, false, false, false, false, false, false, false, false, false};
		
		boolean[] result = alu.convert10to16bits(dez);
		
		//short r = alu.convertBitsToShort(ten);
		System.out.println(alu.convertBinary(result));
		
//		boolean[] isTen = new boolean[16];
//		isTen = alu.convertShortToBits(r);
//		r = alu.convertBitsToShort(isTen);
//		System.out.println(r);
		

	}

}
