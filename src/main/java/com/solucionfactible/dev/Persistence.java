package com.solucionfactible.dev;

/**
 * persistence takes in a positive parameter num and returns its multiplicative persistence, which is the number 
 * of times you must multiply the digits in num until you reach a single digit.
 * 
 * @author developer
 */
public class Persistence {

	public static int persistence(long num) {
		int cont = 0;
		// Dentro de un ciclo ejecutamos una funcion encargada de multiplicar los digitos hasta que el resultado sea menor que 10
		while(num >= 10 ) {
			cont++;
			num = getMultiplication(num);
		}
		return cont;
	}
	
	static long getMultiplication(long num){
		long mod = 10;
		long value = 1;
		long digit = 0;
		// Separamos los digitos del numero utilizando el modulo dependiendo la longitud del numero y lo vamos multiplicando 
		// dentro de una variable y la retornamos
		while( num != 0) {
			digit = (num % mod) / (mod / 10);
			num = num - ( num % mod );
			mod = mod * 10;
			value = value * digit;
		};
		return value;
	}

}
