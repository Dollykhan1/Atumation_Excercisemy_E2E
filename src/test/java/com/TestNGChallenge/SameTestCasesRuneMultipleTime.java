package com.TestNGChallenge;

import org.testng.annotations.Test;

public class SameTestCasesRuneMultipleTime {
@Test(invocationCount=10)
	public void GetMethod() {
		System.out.println("GetMethod");	
	}

}
