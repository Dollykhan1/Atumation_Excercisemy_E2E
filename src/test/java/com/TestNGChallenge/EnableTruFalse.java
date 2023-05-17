package com.TestNGChallenge;

import org.testng.annotations.Test;

public class EnableTruFalse {
	@Test(enabled=true)
	public void GetMethod1() {
		System.out.println("GetMethod1");	
	}
@Test(enabled=true)
	public void GetMethod2() {
		System.out.println("GetMethod2");	
	}
@Test(enabled=true)
	public void GetMethod3() {
		System.out.println("GetMethod3");	
	}
@Test(enabled=false)
	public void GetMethod4() {
		System.out.println("GetMethod4");	
	}
	@Test
	public void GetMethod5() {
		System.out.println("GetMethod5");	
	}
}
