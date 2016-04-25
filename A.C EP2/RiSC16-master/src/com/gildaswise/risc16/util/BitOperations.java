package com.gildaswise.risc16.util;

public class BitOperations {
	
	public static short sum(short a, short b){
		
		boolean carry = false;
		short result = 0;
		
		for (int i = 0; i < 16; i++) {
			
			boolean bitA = getBitValue(a, i);
			boolean bitB = getBitValue(b, i);
			
			if(bitA && bitB){
				if(carry){
					result += 1 << i;
				}
				carry = true;
			}else if(bitA || bitB){
				if(!carry){
					result += 1 << i;
				}
			}else if(carry){
				result += 1 << i;
				carry = false;
			}
			
		}
		
		return result;
	}

	public static short and(short a, short b) {
		
		short result = 0;
		for(int i = 0; i < 16; i++){
			boolean bitA = getBitValue(a, i);
			boolean bitB = getBitValue(b, i);
			
			if(bitA && bitB){
				result += 1 << i;
			}
		}
		
		return result;
	}

	public static short not(short a) {
		short result = 0;
		for(int i = 0; i < 16; i++){
			boolean bitA = getBitValue(a, i);
			if(!bitA){
				result += 1 << i;
			}
		}
		return result;
	}

	public static short nand(short a, short b) {
		return not(and(a, b));
	}

	public static boolean getBitValue(short n, int bit) {
		int position = 1 << bit;
		return (n & position) == position;
	}
	
	public static boolean getBitValue(byte n, int bit) {
		int position = 1 << bit;
		return (n & position) == position;
	}
	
	public static void printBits(short a){
		for (int i = 15; i > -1 ; i--) {
			int n = 0;
			if(getBitValue(a, i)){
				n = 1;
			}
			System.out.print(n);
		}
		System.out.print("\n");
	}

}
