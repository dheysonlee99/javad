package com.gildaswise.risc16.test;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.gildaswise.risc16.classes.ALU;
import com.gildaswise.risc16.classes.Instruction;
import com.gildaswise.risc16.classes.RUU;

public class CompleteTest {
	
	short PC = 0;
	short zero = 0;
	
	static int correct;
	static RUU ruu;
	static ALU alu;
	
	Instruction inst;
	
	//lw 1,0,A
	//lw 2,0,B
	//add 3,1,2
	
	@BeforeClass
	public static void Init(){
		correct = 0;
		ruu = new RUU();
		alu = new ALU();
	}

	@Test
	public void testPop1() {
		
		//lw 1,0,15
		inst = new Instruction();
		inst.setPC(PC++);
		inst.setOperation((byte) 101); 
		inst.setTarget((byte) 001);
		inst.setOperand1((short) 0);
		inst.setOperand2((short) 15);
		ruu.push(inst);
		
		//lw 2,0,1
		inst = new Instruction();
		inst.setPC(PC++);
		inst.setOperation((byte) 101); 
		inst.setTarget((byte) 010);
		inst.setOperand1((short) 0);
		inst.setOperand2((short) 1);
		ruu.push(inst);
		
		inst = ruu.pop();
		inst = ruu.pop();
		Assert.assertEquals(1, inst.getPC());
		correct++;
	}
	
	@Test
	public void testPop2() {
		
		//lw 1,0,15
		inst = new Instruction();
		inst.setPC(PC++);
		inst.setOperation((byte) 101); 
		inst.setTarget((byte) 001);
		inst.setOperand1((short) 0);
		inst.setOperand2((short) 15);
		ruu.push(inst);
		
		inst = ruu.pop();
		Assert.assertEquals(0, inst.getPC());
		correct++;
	}
	
	
}
