package com.dataDrivenTest;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.dataDrivenMain.CheckEvenOdd;


@RunWith(Parameterized.class)
public class TestCheckEvenOdd {
	boolean expected;
	int input;
	//testing123
	

	public TestCheckEvenOdd(boolean expected, int input) {
		this.expected = expected;
		this.input = input;
	
	}
	@Parameters
	public static Object[][] dataForTest() {
		Object[][] data = { { true,10 }, { false, 7 }, {true, 8 } ,{false,5}};
		return data;
	}

	@Test
	public void testCheckEvenOdd() {	
		CheckEvenOdd chk = new CheckEvenOdd();
		assertEquals(expected, chk.evenOdd(input));
		//assertEquals(0, chk.evenOdd(11));

	}
	}


