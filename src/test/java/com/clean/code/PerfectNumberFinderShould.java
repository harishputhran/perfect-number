package com.clean.code;

import static org.junit.Assert.*;

import org.junit.Test;

public class PerfectNumberFinderShould {

	@Test
	public void return_False_when_input_number_is_1_as_it_is_not_a_Perfect_Number() {
		PerfectNumberFinder perfectNumberFinder = new PerfectNumberFinder();
		assertFalse(perfectNumberFinder.isPerfectNumber(1));
	}
	
	@Test
	public void return_True_when_input_number_is_6_as_it_is_a_Perfect_Number() {
		PerfectNumberFinder perfectNumberFinder = new PerfectNumberFinder();
		assertTrue(perfectNumberFinder.isPerfectNumber(6));
	}
	
	@Test
	public void return_True_when_input_number_is_28_as_it_is_a_Perfect_Number() {
		PerfectNumberFinder perfectNumberFinder = new PerfectNumberFinder();
		assertTrue(perfectNumberFinder.isPerfectNumber(28));
	}
	
	

}
