package com.solucionfactible.dev;

/**
 * diff subtracts one list from another and returns the result.
 * It should remove all values from list a, which are present in list b keeping their order.
 * 
 * @author developer
 */
public class ArrayDiff {
	
	public static int[] diff(int[] a, int[] b) {
		for( int i = 0; i < b.length; i++ ) {
			for( int j = 0; j < a.length; j++ ) {
				if( a[j] == b[i]) {
					a = removeElement( a, j);
					j--;
				}
			}
		}
		return a;
	}
	
	static int[]  removeElement(int[] arr, int i) {
		int[] newArray = new int[arr.length - 1];
	    if (i > 0){
	    	System.arraycopy(arr, 0, newArray, 0, i);
	    }
	    if (newArray.length > i){
	    	System.arraycopy(arr, i + 1, newArray, i, newArray.length - i);
	    }
	    return newArray;
	 }

}
