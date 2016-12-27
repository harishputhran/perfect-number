package com.clean.code;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PerfectNumberFinderShould {
	
	private PerfectNumberFinder perfectNumberFinder;
	
	@Before
	public void setUp() {
		perfectNumberFinder = new PerfectNumberFinder();
	}
	

	@Test
	public void return_False_when_input_number_is_1_as_it_is_not_a_Perfect_Number() {
		assertFalse(perfectNumberFinder.isPerfectNumber(1));
	}
	
	@Test
	public void return_True_when_input_number_is_6_as_it_is_a_Perfect_Number() {
		assertTrue(perfectNumberFinder.isPerfectNumber(6));
	}
	
	@Test
	public void return_True_when_input_number_is_28_as_it_is_a_Perfect_Number() {
		assertTrue(perfectNumberFinder.isPerfectNumber(28));
	}
	
	@Test
	public void return_True_when_input_number_is_496_as_it_is_a_Perfect_Number() {
		assertTrue(perfectNumberFinder.isPerfectNumber(496));
	}
	
	@Test
	public void return_True_when_input_number_is_8128_as_it_is_a_Perfect_Number() {
		assertTrue(perfectNumberFinder.isPerfectNumber(8128));
	}
	
	@Test
	public void return_Falsee_when_input_number_is_4096_as_it_is_not_a_Perfect_Number() {
		assertFalse(perfectNumberFinder.isPerfectNumber(4096));
	}
}
