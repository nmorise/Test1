package com.test.junit;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import com.main.junit.SumOfNumbers;


//public class TestSumOfNumbers {
//	SumOfNumbers s = new SumOfNumbers();

	// @Ignore
	// @Test
	// public void testsum1()
	// {
	// int total=s.sumOfNo(3, 7);
	// System.out.println("Sum" +total);
	// assertEquals(10,total);
	// }
	//
	// @Test
	// public void testsum2()
	// {
	// int total=s.sumOfNo(-2, -1);
	// System.out.println("Sum" +total);
	// assertEquals(-3,total);
	// }
	// @Test
	// public void testsum3()
	// {
	// int total=s.sumOfNo(-6, 1);
	// System.out.println("Sum" +total);
	// assertEquals(-5,total);
	// }
	
	
	// we are doing data driven testing 
	@RunWith(Parameterized.class)
	public class TestSumOfNumbers {
		boolean expected = true;
		int a;
		int b;

		public TestSumOfNumbers(boolean expected, int a, int b) {
			this.expected = expected;
			this.a = a;
			this.b = b;
		}

		@Parameters
		public static Object[][] dataForTest() {
			Object[][] data = { { 3, 5 }, { 4, 1 }, { 4, 6 }, { 7, 3 } };
			return data;

		}
@Test
		public void newSum() {

			SumOfNumbers ns = new SumOfNumbers();
			assertEquals(expected, ns.sumOfNo(a,b));

		}
	}
