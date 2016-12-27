package com.clean.code;

public class PerfectNumberFinder {

	public boolean isPerfectNumber(int inputNumber) {
		int divisor = 1;
		int sumOfDivisors = 0;
		while(inputNumber  > divisor){
			if(inputNumber % divisor == 0){
				sumOfDivisors=+inputNumber;
			}
			divisor++;
		}
		return sumOfDivisors == inputNumber ? Boolean.TRUE : Boolean.FALSE;
	}
}
