package com.solucionfactible.dev;

import static org.junit.Assert.*;

import org.junit.Test;

public class AreSameTest {

	@Test
	public void validTest() {
		int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
		int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};
		assertEquals(true, AreSame.comp(a, b)); 
	}
	
	@Test
	public void invalidTest() {
		int[] a = new int[]{21, 144, 19, 161, 19, 144, 19, 11};
		int[] b = new int[]{132, 14641, 20736, 361, 25921, 361, 20736, 361};
		assertEquals(false, AreSame.comp(a, b)); 
	}
	
	@Test
	public void squaredEmpty() {
		int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11, 12};
		int[] b = new int[]{};
		assertEquals(false, AreSame.comp(a, b)); 
	}
	
	@Test
	public void validTest2() {
		int[] a = new int[]{12, 121, 144, 19, 161, 19, 144, 19, 11};
		int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361, 144};
		assertEquals(true, AreSame.comp(a, b)); 
	}
	
	@Test
	public void inputEmpty() {
		int[] a = new int[]{};
		int[] b = new int[]{121, 144, 19, 161, 19, 144, 19, 11, 12};
		assertEquals(false, AreSame.comp(a, b)); 
	}
	
	@Test
	public void invalidTest2() {
		int[] a = new int[]{12, 121, 144, 19, 161, 19, 144, 19, 11, 12};
		int[] b = new int[]{121, 14641, 20736, 361, 25921, 144, 361, 20736, 361};
		assertEquals(false, AreSame.comp(a, b)); 
	}

}
