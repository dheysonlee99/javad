package br.edu.ifpi.ads.testes;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import br.edu.ifpi.ads.modelos.RegisterFile;

public class TestesRF {

	short src0 = 0;
	short src1 = 1;
	short src2 = 2;
	
	short zero = 0;
	short ten = 10;
	
	private RegisterFile rf = new RegisterFile();
	private static byte correct = 0;
	
	@BeforeClass
	public static void InitScore(){
		correct = 0;
	}
	
	@AfterClass
	public static void ShowScore(){
		System.out.println("Nota: " + correct + "/5");
	}
	
	@Test
	public void test1() {
		rf.setSrc1(src0);
		short result = rf.getSource1();
		Assert.assertEquals(zero, result);
		correct++;
	}
	
	@Test
	public void test2() {
		rf.setSrc1(src1);
		short result = rf.getSource1();
		Assert.assertEquals(zero, result);
		correct++;
	}
	
	@Test
	public void test3() {
		rf.setTgt(src0);
		rf.setWriteEnable(true);
		rf.setValue(ten);
		
		rf.setSrc1(src0);
		short result = rf.getSource1();
		Assert.assertEquals(zero, result);
		correct++;
	}
	
	@Test
	public void test4() {
		rf.setTgt(src1);
		rf.setWriteEnable(true);
		rf.setValue(ten);
		
		rf.setSrc1(src1);
		short result = rf.getSource1();
		Assert.assertEquals(ten, result);
		correct++;
	}
	
	@Test
	public void test5() {
		rf.setTgt(src1);
		rf.setWriteEnable(false);
		rf.setValue(ten);
		
		rf.setSrc1(src1);
		short result = rf.getSource1();
		Assert.assertEquals(ten, result);
		correct++;
	}
	
}
