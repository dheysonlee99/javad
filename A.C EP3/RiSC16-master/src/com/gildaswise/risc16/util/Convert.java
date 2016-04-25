package com.gildaswise.risc16.util;

public abstract class Convert {
	
	public static boolean[] SevenTo16(boolean[] data) {
		boolean[] resultado = new boolean[16];
		
		for (int i = 0; i < 9; i++) {
			resultado[i] = data[0];
		}
		
		int count = 0;
		for (int i = 9; i < resultado.length; i++) {
			resultado[i] = data[count];
			count++;
		}
		
		return resultado;
	}
	
	public static boolean[] TenTo16(boolean[] data) {
		
		boolean[] resultado = new boolean[16];
		
		for (int i = 0; i < 10; i++) {
			resultado[i] = data[i];
		}
		
		for (int i = 10; i < resultado.length; i++) {
			resultado[i] = false;
		}
		
		return resultado;
	}
	
	public static int FromOctal(byte octal){
		int result = 0;
		int count = 2;
		for (int i = 2; i > -1; i--) {
			
			boolean bitValue = BitOperations.getBitValue(octal, i);
			
			if(bitValue == true){
				result += Math.pow(2, count);
				count--;
			}else{
				result += 0;
				count--;
			}
		
		}
		return result;
	}
	
	public static short BitsToShort(boolean[] bits){
		
		short result = 0;
		short count = 0;
		
		for (int i = 15; i > -1; i--) {
			
			if(bits[i]){
				result += Math.pow((short) 2, (short) count);
			}else{
				result += 0;
			}
			
			count++;
		
		}
		
		return result;
	}
	
	public static boolean[] ShortToBits(short n){
		boolean[] result = new boolean[16];
		for (int i = 15; i > -1; i--) {
			short q = (short) (n/2);
			if(n%2 == 0){
				result[i] = false;
			}else{
				result[i] = true;
			}
			n = q;
		}
		return result;
	}
	
	public static String ToString(boolean[] bits){
		String str = "";
		for (int i = 0; i < bits.length; i++) {
			if(bits[i] == true){
				str += 1;
			}else{
				str += 0;
			}
		}
		return str;
	}

}
