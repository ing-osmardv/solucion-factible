package com.solucionfactible.dev;

/**
 * findMissingLetter takes an array of consecutive (increasing) letters as input and that returns the missing letter 
 * in the array. You will always get an valid array. And it will be always exactly one letter be missing. 
 * The length of the array will always be at least 2.The array will always contain letters in only one case.
 * (Use the English alphabet with 26 letters)
 * 
 * @author developer
 */
public class FindMissingLetter {
	
	public static char findMissingLetter(char[] array) {
		// Obtenemos la letra inicial del arreglo y la convertimos a su valor en ascii
		int initial = array[0] - 0;
		// Inicializamos la siguiente letra en el valor de 0
		int next = 0;
		// Recorremos el arreglo de char
		for( int i = 1; i < array.length; i++) {
			// Asignamos el valor de la siguiente letra
			next = array[i] - 0;
			// Validamos que la diferencia entre las letras initial y next no sea mayor a uno, en caso de que lo sea
			// existira una letra perdida aqui se podria validar si existe mas de una letra faltante en caso de que si
			//  retornar el arreglo de faltantes
			if( next - initial > 1 ) {
				return (char) (initial + 1);
			}
			initial = next;
		}
		return ' ';
	}

}
