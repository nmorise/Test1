//package com.test.junit;
//
//import org.junit.runner.RunWith;
//import org.junit.runners.Parameterized.Parameters;
//
//import com.main.junit.SumOfNumbers;
//
//@RunWith(parameterized.class)
//public class testingDataDriven {
//	boolean expected = true;
//	int a;
//	int b;
//
//	public DataDriven(boolean expected, int a, int b) {
//		this.expected = expected;
//		this.a = a;
//		this.b = b;
//	}
//
//	@Parameters
//	public Object[][] dataForTest() {
//		Object[][] data = { { 3, 5 }, { 4, 1 }, { 4, 6 }, { 7, 3 } };
//		return data;
//
//	}
//
//	public void newSum() {
//		
//		SumOfNumbers ns= new SumOfNumbers();
//		assertEquals(expected,ns.sumOfNo(a, b);
//		
//		
//		
//		
//	}
//}
