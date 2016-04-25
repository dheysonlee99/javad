package com.gildaswise.risc16.classes;

import com.gildaswise.risc16.interfaces.TickBased;
import com.gildaswise.risc16.util.BitOperations;

public class ALU implements TickBased{

	private short operand1;
	private short operand2;
	private Boolean branchTaken;
	
	public static boolean getBitValue(short operand, int bit) {
		int position = 1 << bit;
		return (operand & position) == position;
	}
	
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

	public short execute(Instruction ri) {
		
		short result = 0;
		
		operand1 = ri.getOperand1();
		operand2 = ri.getOperand2();
		
		switch(ri.getOpCode()){
			case ADD:
				result = BitOperations.sum(operand1, operand2);
				break;
			case NAND:
				result = BitOperations.nand(operand1, operand2);
				break;
			case BEQ:
				int count = 0;
				for (int i = 0; i < 16; i++) {
					
					boolean Bit1 = BitOperations.getBitValue(operand1, i);
					boolean Bit2 = BitOperations.getBitValue(operand2, i);
					
					if(Bit1 == Bit2)
						count++;
				}
				if(count == 16){
					branchTaken = true;
				}else{
					branchTaken = false;
				}
				break;
			case PASS1:
				result = operand1;
			default:
				System.out.println("ALU | Invalid opCode");
				break;
		}
		
		System.out.println("\nALU | Executed operation (" + ri.getOpCode() + ") and resulted: " + result + "\n");
		
		return result;
		
	}

	public boolean isBranchTaken() {
		return branchTaken;
	}

	@Override
	public void tick() {
		//
	}


}
