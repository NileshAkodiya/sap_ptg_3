package com.yash1.tdddemo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StringCalculatorTest {
	
	public static String ANY_SINGLE_NUMBER_AS_STRING_INPUT="";

	private StringCalculator stringCalculator;
	
	@Before
	public void setup() {
		stringCalculator = new StringCalculator();
				
	}
	@Test
	public void test_Calculate_GivenEmptyString_ShouldReturnZeroAsNumber() {
		
		int result = stringCalculator.calculate("");
		assertEquals(0, result);
	}

	@Test
	public void test_Calculate_Given1String_ShouldReturn1AsNumber() {
		
		int result = stringCalculator.calculate(ANY_SINGLE_NUMBER_AS_STRING_INPUT);
		assertEquals(1, result);
	}

}
