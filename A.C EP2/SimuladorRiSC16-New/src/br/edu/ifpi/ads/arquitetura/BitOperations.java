package br.edu.ifpi.ads.arquitetura;

public class BitOperations {

	// TODO, sem usar a + b diretamente
	public static short sum(short a, short b) {
		return -1;
	}

	// TODO, sem usar a & b diretamente
	public static short and(short a, short b) {
		return -1;
	}

	// TODO
	public static short not(short a) {
		return -1;
	}

	public static short nand(short a, short b) {
		return not(and(a, b));
	}

	public static boolean getBitValue(short operand, int bit) {
		int position = 1 << bit;
		return (operand & position) == position;
	}

}
