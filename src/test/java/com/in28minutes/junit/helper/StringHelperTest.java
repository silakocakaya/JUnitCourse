package com.in28minutes.junit.helper;

import junit.framework.TestCase;
import org.junit.Test;

public class StringHelperTest extends TestCase {

	StringHelper stringHelper = new StringHelper();
	
	@Test
	public void testTruncateAInFirst2Positions_Condition1() {
		//ABCD, BCD, AABC BC
		assertEquals("BCD", stringHelper.truncateAInFirst2Positions("ABCD"));
		//assertEquals("HATALI", stringHelper.truncateAInFirst2Positions("AABC"));
	}
	
	@Test
	public void testTruncateAInFirst2Positions_Condition3() {
		assertEquals("", stringHelper.truncateAInFirst2Positions("A"));
	}
	
	@Test
	public void testTruncateAInFirst2Positions_Condition2() {
		//ABCD, BCD, AABC BC
		assertEquals("BC", stringHelper.truncateAInFirst2Positions("AABC"));
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_BasicNegativeValues() {
		
		assertFalse(stringHelper.areFirstAndLastTwoCharactersTheSame("A"));
		assertFalse("ABCD should be false", stringHelper.areFirstAndLastTwoCharactersTheSame("ABCD"));
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_BasicPositiveValues() {
		assertTrue("ABAB should be true", stringHelper.areFirstAndLastTwoCharactersTheSame("ABAB"));
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_BasicPositiveValues2() {
		assertTrue("ABAB should be true", stringHelper.areFirstAndLastTwoCharactersTheSame("AB"));
	}
}
