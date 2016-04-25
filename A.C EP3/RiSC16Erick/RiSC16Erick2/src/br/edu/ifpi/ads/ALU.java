package br.edu.ifpi.ads;

public class ALU {

	private boolean[] operand1;
	private boolean[] operand2;
	private boolean branchTaken;
	
	public String convertBinary(boolean[] bits){
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
	
	public boolean[] convert7to16bits(boolean[] sete_bits){
		
		boolean[] resultado = new boolean[16];
		
		for (int i = 0; i < 9; i++) {
			resultado[i] = sete_bits[0];
		}
		
		int count = 0;
		for (int i = 9; i < resultado.length; i++) {
			resultado[i] = sete_bits[count];
			count++;
		}
		
		return resultado;
	}
	
public boolean[] convert10to16bits(boolean[] dez_bits){
		
		boolean[] resultado = new boolean[16];
		
		for (int i = 0; i < 6; i++) {
			resultado[i] = dez_bits[0];
		}
		
		int count = 0;
		for (int i = 6; i < resultado.length; i++) {
			resultado[i] = dez_bits[count];
			count++;
		}
		
		return resultado;
	}
	
	public short convertBitsToShort(boolean[] bits){
		int result = 0;
		int count = bits.length-1;
		for (boolean bit : bits) {
			System.out.println("Poaição: " + count + " // Resultado: " + result);
			if(bit == true){
				result += Math.pow(2, count);
				System.out.println("Somou!");
				count--;
			}else{
				result += 0;
				count--;
			}
		
		}
		return (short) result;
	}
	
	public boolean[] convertShortToBits(short n){
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

	public boolean[] execute(OperationCode opCode) {
		boolean[] result = new boolean[16];
		short op1;
		short op2;
		switch(opCode){
			case ADD:
				op1 = convertBitsToShort(operand1);
				op2 = convertBitsToShort(operand2);
				result = convertShortToBits((short) (op1 + op2));
				return result;
			case NAND:
				op1 = convertBitsToShort(operand1);
				op2 = convertBitsToShort(operand2);
				if(op1 == (short) 1 && op2 == (short) 1)
					for (int i = 0; i < result.length; i++) {
						result[i] = false;
					}
				else
					for (int i = 0; i < result.length; i++) {
						result[i] = true;
					}
				return result;
			case BEQ:
				int count = 0;
				for (int i = 0; i < result.length; i++) {
					if(operand1[i] == operand2[i])
						count++;
				}
				if(count == 16){
					branchTaken = true;
				}else{
					branchTaken = false;
				}
			case PASS1:
				return operand1;
			default:
				System.out.println("Invalid opCode");
				break;
		}
		
		return null;
	}

	public boolean[] getOperand1() {
		return operand1;
	}

	public void setOperand1(boolean[] operand1) {
		this.operand1 = operand1;
	}

	public boolean[] getOperand2() {
		return operand2;
	}

	public void setOperand2(boolean[] operand2) {
		this.operand2 = operand2;
	}

	public boolean isBranchTaken() {
		return branchTaken;
	}

}
