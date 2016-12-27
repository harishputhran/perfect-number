package com.clean.code;

public class PerfectNumberFinder {

	public boolean isPerfectNumber(int inputNumber) {
		return sumOfDivisors(inputNumber) == inputNumber;
	}

	protected int sumOfDivisors(int inputNumber) {
		int divisor = 1;
		int sumOfDivisors = 0;
		while(inputNumber > divisor){
			if(isDivisible(inputNumber, divisor)){
				sumOfDivisors = sumOfDivisors + divisor;
			}
			divisor++;
		}
		return sumOfDivisors;
	}

	protected boolean isDivisible(int inputNumber, int divisor) {
		return inputNumber % divisor == 0;
	}
}
