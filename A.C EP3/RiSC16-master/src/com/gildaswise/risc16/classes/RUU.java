package com.gildaswise.risc16.classes;

import java.util.ArrayList;

import com.gildaswise.risc16.interfaces.TickBased;

public class RUU implements TickBased{
	
	private ArrayList<Instruction> queue = new ArrayList<>();
	
	private RegisterFile mRF;
	private ALU mALU;
	
	public String toString(){
		String s = "RUU | Tick\n\n";
		if(!queue.isEmpty()){
			for (int i = 0; i < queue.size(); i++) {
				s += "Unit [" + i + "] - Instruction:" + queue.get(i) + "\n\n";
			}
		}
		return s;
	}
	
	@Override
	public void tick(){
		
		Instruction ri = issue();
		
		if(ri != null && mALU != null){
			System.out.println("\nRUU | Issued: " + ri.toString());
			setResults(ri.getPC(), mALU.execute(ri));
		}
		
		ri = pop();
		
		if(ri != null && mRF != null){
			System.out.println("\nRUU | Popped: " + ri.toString());
			mRF.setTgt(ri.getTarget());
			mRF.setWriteEnable(true);
			mRF.setValue(ri.getResult());
			mRF.setWriteEnable(false);
		}
		
	}
	
	public void push(Instruction instruction) {
		if(queue.size() > 0 && queue.size() < 4){
			
			for (Instruction i : queue) {
				
				if(i.getPC() == instruction.getOperand1()){
					instruction.setWaitingPC1(i.getPC());
				}
				
				if(i.getPC() == instruction.getOperand2()){
					instruction.setWaitingPC2(i.getPC());
				}
			}
			
			queue.add(instruction);
			
		}else if(queue.size() == 0){
			queue.add(instruction);
		}
	}
	
	public Instruction pop() {
		if(!queue.isEmpty()){
			Instruction result = queue.get(0);
			if(result.ReadyToWrite()){
				queue.remove(0);
				return result;
			}else{
				return null;
			}
		}
		return null;
	}
	
	public Instruction issue() {
		for (int i = 0; i < queue.size(); i++) {
			Instruction ri = queue.get(i);
			if(!ri.isIssued && ri.ReadyToIssue()){
				
				ri.isIssued = true;
				
				queue.set(i, ri);
				
				return ri;
			}
		}
		return null;
	}
	
	public void setResults(Short pc, Short value) {
		for (int i = 0; i < queue.size(); i++) {
			
			Instruction ri = queue.get(i);
			
			ri.setValue(pc, value);
			
			queue.set(i, ri);
		}
	}

	public void setRF(RegisterFile mRF) {
		this.mRF = mRF;
	}
	
	public RegisterFile getRF() {
		return this.mRF;
	}

	public void setALU(ALU mALU) {
		this.mALU = mALU;
	}

}
