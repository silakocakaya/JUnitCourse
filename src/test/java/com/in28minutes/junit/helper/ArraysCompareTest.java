package com.in28minutes.junit.helper;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.Test;

public class ArraysCompareTest {

	@Test
	public void testArrays_RandomArrays() {
		
		int[] numbers = {1,5,3,12};
		int[] expected = {1,3,5,12};
		
		Arrays.sort(numbers);
		assertArrayEquals(expected, numbers);
	}
	
	
	@Test
	public void testArrays_RandomArrays2() {
		
		int[] numbers = {1,5,3,12};
		int[] expected = {1,3,5,12};
		
		Arrays.sort(numbers);
		//assertEqual objenin de eşit olup olmamasına bakar
		//assertEquals(expected, numbers);
		assertEquals(expected, numbers);
	}
	
	//Testin null pointer exception atmasi beklenmektedir.
	//Eger atmazsa failure olur
	@Test(expected = NullPointerException.class)
	public void testArrays_NullPointerException() {
		
		int[] numbers = null;
		Arrays.sort(numbers);
	}
	
	@Test(timeout = 10)
	public void testArray_Performance() {
		
		int[] array = {1,2,3};
		
		for (int i = 0; i < 10000000; i++) {
			array[0] = i;
		}
	}

}
