package br.edu.ifpi.ads.modelos;

public class ALU {
	
	private short operand1;
	private short operand2;
	private boolean branchTaken;
	
	public short execute(OperationCode opCode) {
		short result = 0;
		switch(opCode){
			case ADD:
				result = add(operand1, operand2);
				break;
			case NAND:
				result = nand(operand1, operand2);
				break;
			case BEQ:
				beq(operand1, operand2);
				break;
			case PASS1:
				return operand1;
			default:
				System.out.println("Invalid opCode");
				break;
		}
		
		return result;
	}
	
	public short add(short a, short b) {
		boolean rest = false;
		short add = 0;
		for(int i = 0; i < 16; i++){
			boolean bitA = getBitValue(a, i);
			boolean bitB = getBitValue(b, i);
			if(bitA && bitB){
				if(rest){
					add += 1 << i;
				}
				rest = true;
			}
			else if(bitA || bitB){
				if(!rest){
					add += 1 << i;
				}
			}
			else if(rest){
					add += 1 << i;
					rest = false;
				}
			}
		return add;
	}

	public short and(short a, short b) {
		short and = 0;
		for(int i = 0; i< 16; i++){
			boolean bitA = getBitValue(a, i);
			boolean bitB = getBitValue(b, i);
			if(bitA && bitB){
				and += 1 << i;
			}
		}
		return and;
	}

	public short not(short a) {
		short not = 0;
		for(int i = 0; i< 16; i++){
			boolean bitA = getBitValue(a, i);
				if(!bitA){
				not += 1 << i;
			}
		}
		return not;
	}

	public short nand(short a, short b) {
		return not(and(a, b));
	}
	
	public boolean beq(short a, short b){
		branchTaken = false;
		int count = 0;
		for (int i = 0; i < 16; i++){
			boolean bitA = getBitValue(a, i);
			boolean bitB = getBitValue(b, i);
			if (bitA == bitB){
				count++;
			}
		}
		if (count == 16){
			branchTaken = true;
		}
		return branchTaken;
	}
	
	public boolean getBitValue(short operand, int bit) {
		int position = 1 << bit;
		return (operand & position) == position;
	}
	
	public short getOperand1() {
		return operand1;
	}
	
	public void setOperand1(short operand1) {
		this.operand1 = operand1;
	}
	
	public short getOperand2() {
		return operand2;
	}
	
	public void setOperand2(short operand2) {
		this.operand2 = operand2;
	}
	
	public boolean isBranchTaken() {
		return branchTaken;
	}
	
}
