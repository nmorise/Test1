package com.test.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.main.junit.MultiplyNumbers;
import com.main.junit.SumOfNumbers;

public class TestMultiplyNumbers {

	MultiplyNumbers m= new MultiplyNumbers();
	@Test
    public void testmultiply1(){
    	int value=m.multiply(25, 10);
    	System.out.println("Multiplication" +value);
    	assertEquals(250,value);
    	
    }
    @Test
    public void testmultiply2(){
    	int value=m.multiply(5, 0);
    	System.out.println("Multiplication" +value);
    	assertEquals(0,value);
    	
    }
    @Test
    public void testmultiply3(){
    	int value=m.multiply(-1, -9);
    	System.out.println("Multiplication" +value);
    	assertEquals(9,value);
    	
    }
    @Test
    public void testmultiply4(){
    	int value=m.multiply(-4, 5);
    	System.out.println("Multiplication" +value);
    	assertEquals(20,value);
    	
    }
}
