package com.solucionfactible.dev;

/**
 * comp checks whether the two arrays have the "same" elements, with the same multiplicities. "Same" means, 
 * here, that the elements in b are the elements in a squared, regardless of the order.
 * 
 * @author developer
 */
public class AreSame {
	
	public static boolean comp(int[] a, int[] b) {
		// Si ambos arreglos llegan vacios existen los mismos elementos en ambos arreglos y retornamos un true
		if( a.length == 0 && b.length == 0 ) {
			return true;
		}
		// Su uno de los 2 arreglos llega con datos y el otro no, no existen los mismos datos y se retorna un false
		if(( a.length != 0 && b.length == 0 ) ||(b.length != 0 && a.length== 0) ) {
			return false;
		}
		// Obtenemos el cuadrado del primer elemento del arreglo a
		int squared = a[0] * a[0];
		// Recorremos el arreglo b hasta encontrar el cuadrado
		for( int i = 0; i < b.length; i++) {
			if( b[i] ==  squared ) {
				// Si lo encontramos eliminamos el elemento de ambos arreglos
				int[] new_a = removeElement(a, 0);
				int[] new_b = removeElement(b, i);
				return comp(new_a, new_b);
			}
		}
		return false;
	}
	
	// Funcion que elimina un elemento que existe en ambos arreglos
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
