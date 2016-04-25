package br.edu.ifpi.ads.testes;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import br.edu.ifpi.ads.modelos.ALU;
import br.edu.ifpi.ads.modelos.OperationCode;

public class TestesALU {

	short zero = 0;
	short one = 1;
	short ten = 10;
	short twenty = 20;
	short eleven = 11;
	
	short allOnes = -1;

	private static ALU alu = new ALU();
	private static byte correct = 0;

	@BeforeClass
	public static void InitScore(){
		correct = 0;
	}

	@AfterClass
	public static void ShowScore(){
		System.out.println("Nota: " + correct + "/8");
	}

	@Test
	public void testAdd1() {
		alu.setOperand1(zero);
		alu.setOperand2(zero);
		short result = alu.execute(OperationCode.ADD);
		Assert.assertEquals(zero, result);
		correct++;
	}

	@Test
	public void testAdd2() {
		alu.setOperand1(zero);
		alu.setOperand2(one);
		short result = alu.execute(OperationCode.ADD);
		Assert.assertEquals(one, result);
		correct++;
	}

	@Test
	public void testAdd3() {
		alu.setOperand1(ten);
		alu.setOperand2(ten);
		short result = alu.execute(OperationCode.ADD);
		Assert.assertEquals(twenty, result);
		correct++;
	}

	@Test
	public void testBeqTaken1() {
		alu.setOperand1(zero);
		alu.setOperand2(zero);
		alu.execute(OperationCode.BEQ);
		Assert.assertEquals(true, alu.isBranchTaken());
		correct++;
	}

	@Test
	public void testBeqTaken2() {
		alu.setOperand1(ten);
		alu.setOperand2(ten);
		alu.execute(OperationCode.BEQ);
		Assert.assertEquals(true, alu.isBranchTaken());
		correct++;
	}

	@Test
	public void testBeqNotTaken() {
		alu.setOperand1(ten);
		alu.setOperand2(eleven);
		alu.execute(OperationCode.BEQ);
		Assert.assertEquals(false, alu.isBranchTaken());
		correct++;
	}

	@Test
	public void testPass1() {
		alu.setOperand1(ten);
		alu.setOperand2(one);
		short result = alu.execute(OperationCode.PASS1);
		Assert.assertEquals(ten, result);
		correct++;
	}

	@Test
	public void testNand() {
		alu.setOperand1(ten);
		alu.setOperand2(one);
		short result = alu.execute(OperationCode.NAND);
		Assert.assertEquals(allOnes, result);
		correct++;
	}

}