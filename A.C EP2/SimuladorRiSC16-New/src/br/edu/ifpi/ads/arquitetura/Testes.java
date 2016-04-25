package br.edu.ifpi.ads.arquitetura;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class Testes {
	private static byte correct = 0;

	short zero = 0;
	short one = 1;
	short two = 2;
	short three = 3;

	@BeforeClass
	public static void InitScore() {
		correct = 0;
	}

	@AfterClass
	public static void ShowScore() {
		System.out.println("Nota: " + correct + "/5");
	}

	public void testSum1() {
		short c = BitOperations.sum(zero, one);
		Assert.assertEquals(one, c);
		correct++;
	}

	@Test
	public void testSum2() {
		short c = BitOperations.sum(two, one);
		Assert.assertEquals(three, c);
		correct++;
	}

	@Test
	public void testAnd1() {
		short c = BitOperations.and(two, one);
		Assert.assertEquals(zero, c);
		correct++;
	}

	@Test
	public void testAnd2() {
		short c = BitOperations.and(three, three);
		Assert.assertEquals(three, c);
		correct++;
	}

	@Test
	public void testNot() {
		short c = BitOperations.not(zero);
		Assert.assertEquals(-32768, c);
		correct++;
	}
}
