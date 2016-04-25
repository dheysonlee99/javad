package com.gildaswise.risc16.system;

import com.gildaswise.risc16.classes.ALU;
import com.gildaswise.risc16.classes.Instruction;
import com.gildaswise.risc16.classes.DataMemory;
import com.gildaswise.risc16.classes.RUU;
import com.gildaswise.risc16.classes.RegisterFile;

public class Run {
	
	public static RUU mRUU;
	public static ALU mALU;
	public static RegisterFile mRF;
	public static DataMemory mRAM;
	public static Instruction inst;
	
	public static short PC = 1;
	
	//addi 1,0,10
	//addi 2,0,5
	//add 3,1,2

	public static void main(String[] args) {
		
		//Init process
		mRUU = new RUU();
		mALU = new ALU();
		mRAM = new DataMemory();
		mRF = new RegisterFile();
		
		//
		
		mRUU.setALU(mALU);
		mRUU.setRF(mRF);
		
		inst = new Instruction(
				Byte.valueOf(Integer.toOctalString(1)),
				Byte.valueOf(Integer.toOctalString(1)),
				(short) 0,
				(short) 10);
		
		inst.setPC(PC++);
		
		mRUU.push(inst);
		
		inst = new Instruction(
				Byte.valueOf(Integer.toOctalString(1)),
				Byte.valueOf(Integer.toOctalString(2)),
				(short) 0,
				(short) 5);
		
		inst.setPC(PC++);
		
		mRUU.push(inst);
		
		inst = new Instruction(
				Byte.valueOf(Integer.toOctalString(0)),
				Byte.valueOf(Integer.toOctalString(3)),
				(short) 1,
				(short) 2);
		
		mRUU.push(inst);
		
		inst.setPC(PC++);
		
		System.out.println(" --------- Before being ticked --------- \n\n" + mRUU.toString());
		
		System.out.println("\n --------- Tick 1 --------- \n");
		mRUU.tick();
		System.out.println("\n" + mRUU.toString());
		
		System.out.println("\n --------- Tick 2 --------- \n");
		mRUU.tick();
		System.out.println("\n" + mRUU.toString());
		
		System.out.println("\n --------- Tick 3 --------- \n");
		mRUU.tick();
		System.out.println("\n" + mRUU.toString());
		
		System.out.println(mRF.toString());
	
	}

}
