package com.gildaswise.risc16.classes;

import com.gildaswise.risc16.util.OperationCode;

public class Instruction {

	private byte operation;
	private byte target;
	
	private short PC;
	
	private short operand1;
	private short operand2;
	private short result = -1;
	
	private short waitingPC1 = -1;
	private short waitingPC2 = -1;
	
	public boolean isIssued = false;
	public boolean isReadyToIssue = false;
	public boolean isReadyToWrite = false;
	
	public Instruction(){}
	
	//RRR/RRI
	public Instruction(byte op, byte tgt, short src1, short src2) {
		this.operation = op;
		this.target = tgt;
		this.operand1 = src1;
		this.operand2 = src2;
	}
			
	//RI
	public Instruction(byte op, byte tgt, short imm) {
		this.operation = op;
		this.target = tgt;
		this.operand1 = imm;
	}
	
	public String toString(){
		return "\nPC: " + this.getPC()
		+ " // Operation: " + this.getOperation()
		+ " // Target: " + this.getTarget()
		+ "\nOperand1: " + this.getOperand1()
		+ " // Operand2: " + this.getOperand2()
		+ " // WaitingPC1: " + this.getWaitingPC1()
		+ " // WaitingPC2: " + this.getWaitingPC2()
		+ "\nStatus: [Issued: " + this.isIssued
		+ " // ReadyToWrite: " + this.ReadyToWrite()
		+ " // ReadyToIssue: " + this.ReadyToIssue() + "]"
		+ "\nResult: " + this.getResult();
	}
	
	public short toShort(){
		short result = 0;
		
		result += Short.parseShort(Byte.toString(this.operation));
		result += Short.parseShort(Byte.toString(this.target));
		result += this.operand1;
		result += this.operand2;
		
		return result;
	}
	
	public boolean ReadyToIssue() {
		if(this.waitingPC1 == -1 && this.waitingPC2 == -1){
			this.isReadyToIssue = true;
		}
		return this.isReadyToIssue;
	}
	
	public boolean ReadyToWrite() {
		if(this.result != -1){
			this.isReadyToWrite = true;
		}

		return this.isReadyToWrite;
		
	}
	
	public OperationCode getOpCode(){
		switch(this.getOperation()){
			case 000: //ADD
				return OperationCode.ADD;
			case 001: //ADDI
				return OperationCode.ADD;
			case 010: //NAND
				return OperationCode.NAND;
			case 011: //LUI
				return OperationCode.ADD;
			case 100: //SW
				return OperationCode.ADD;
			case 101: //LW
				return OperationCode.ADD;
			case 110: //BEQ
				return OperationCode.BEQ;
			case 111: //JALR
				return OperationCode.PASS1;
			default:
				return null;
		}
	}
	
	//Getters and setters
	
	public short getPC(){
		return PC;
	}
	
	public void setPC(short PC){
		this.PC = PC;
	}

	public byte getTarget() {
		return target;
	}

	public void setTarget(byte target) {
		this.target = target;
	}

	public Short getResult() {
		return result;
	}
	
	public void setValue(short pc, short value){
		
		System.out.println("INST | Setting values to Instruction (" + this.PC + "): ");
		
		if(this.waitingPC1 == pc){
			this.operand1 = value;
			this.waitingPC1 = (short) -1;
			System.out.println("Set operand1 from PC (" + pc + ")");
		}
		
		if(this.waitingPC2 == pc){
			this.operand2 = value;
			this.waitingPC2 = (short) -1;
			System.out.println("Set operand2 from PC (" + pc + ")");
		}
		
		this.ReadyToIssue();
		
		if(this.PC == pc){
			this.result = value;
			this.ReadyToWrite();
			System.out.println("Set result from PC (" + pc + ")");
		}

	}

	public void setResult(short result) {
		this.result = result;
	}

	public byte getOperation() {
		return operation;
	}

	public void setOperation(byte operation) {
		this.operation = operation;
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

	public short getWaitingPC1() {
		return waitingPC1;
	}

	public void setWaitingPC1(short waiting1) {
		this.waitingPC1 = waiting1;
	}

	public short getWaitingPC2() {
		return waitingPC2;
	}

	public void setWaitingPC2(short waiting2) {
		this.waitingPC2 = waiting2;
	}

}
