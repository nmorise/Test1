package com.test.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.main.junit.DivideNumbers;
import com.main.junit.SumOfNumbers;

public class TestDivideNumbers {

	DivideNumbers d= new DivideNumbers();
	
	 @Test(expected=ArithmeticException.class)
	    public void testdivision1(){
	    	int value=d.division(5, 0);
	    	System.out.println("Division" +value);
	    	assertEquals(0,value);
	    	
	    }
	 @Test
	    public void testdivision2(){
	    	int value=d.division(25, 5);
	    	System.out.println("Division" +value);
	    	assertEquals(0,value);
	    	
	    }
}
