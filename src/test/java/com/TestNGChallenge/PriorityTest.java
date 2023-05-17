package com.TestNGChallenge;

import org.testng.annotations.Test;

//Without Priority how Test cases will executed
//Ans: Alphabetic

//In your test cases how to set up priority
//Ans: 1,2,3,4,5,or (A,B,C,D,E,F,)

public class PriorityTest {
@Test
	public void GetMethod1() {
		System.out.println("GetMethod1");	
	}
@Test
	public void GetMethod2() {
		System.out.println("GetMethod2");	
	}
@Test
	public void GetMethod3() {
		System.out.println("GetMethod3");	
	}
	public void GetMethod4() {
		System.out.println("GetMethod4");	
	}
	@Test
	public void GetMethod0() {
		System.out.println("GetMethod0");	
	}
}
