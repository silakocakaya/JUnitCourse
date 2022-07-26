package com.in28minutes.junit.helper;

import junit.framework.TestCase;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class StringHelperParametrizedTest extends TestCase {

	
	StringHelper stringHelper = new StringHelper();
	
	private String input;
	private String output;
	
	public StringHelperParametrizedTest(String input, String output) {
		super();
		this.input = input;
		this.output = output;
	}

	@Parameters
	public static Collection<String[]> testConditions() {
		
		String[][] array = {{"ABC", "BC"},{"AABC", "BC"}};
		
		return Arrays.asList(array);
	}
	
	@Test
	public void testTruncateAInFirst2Positions_ConditionWithParam() {
		assertEquals(output, stringHelper.truncateAInFirst2Positions(input));
	}
}
