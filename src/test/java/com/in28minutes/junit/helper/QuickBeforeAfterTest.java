package com.in28minutes.junit.helper;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class QuickBeforeAfterTest {
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class");
	}

	@Before
	public void before() {
		System.out.println("Before Test Cases");
	}
	
	@Test
	public void test1() {
		System.out.println("Test1 is executed");
	}
	
	@Test
	public void test2() {
		System.out.println("Test2 is executed");
	}
	
	@After
	public void after() {
		System.out.println("After Test Cases");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("After Class");
	}

}
