package com.clean.code;

import static org.junit.Assert.*;

import org.junit.Test;

public class PerfectNumberFinderShould {

	@Test
	public void return_False_when_input_number_is_1() {
		PerfectNumberFinder perfectNumberFinder = new PerfectNumberFinder();
		assertFalse(perfectNumberFinder.isPerfectNumber(1));
	}

}
