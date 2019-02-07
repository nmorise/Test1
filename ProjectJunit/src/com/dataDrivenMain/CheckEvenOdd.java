package com.dataDrivenMain;


public class CheckEvenOdd {

	public boolean evenOdd(int input){
	boolean result=false;
	for(int i=2;i<input/2;i++){
		if(input%i==0){
			result=true;
			break;
		}
	}
		
	return result;
		
}
}
