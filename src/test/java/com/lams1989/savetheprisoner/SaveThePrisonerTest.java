package com.lams1989.savetheprisoner;

import junit.framework.TestCase;

public class SaveThePrisonerTest extends TestCase{
	
	public void test1() {
		int result = SaveThePrisoner.saveThePrisoner(5, 2, 1);
		assertEquals(2, result);
	}
	
	public void set2() {
		int result = SaveThePrisoner.saveThePrisoner(5, 2, 2);
		assertEquals(3, result);
	}
	
	public void set3() {
		int result = SaveThePrisoner.saveThePrisoner(7, 19, 2);
		assertEquals(6, result);
	}
	
	public void set4() {
		int result = SaveThePrisoner.saveThePrisoner(7, 3,7);
		assertEquals(3, result);
	}

}
