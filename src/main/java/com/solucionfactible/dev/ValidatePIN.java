package com.solucionfactible.dev;

/**
 * isValid allow 4 or 6 digit PIN codes and PIN codes cannot contain anything but exactly 4 digits or exactly 6 digits.
 * If the function is passed a valid PIN string, return true, else return false.
 * 
 * @author developer
 */
public class ValidatePIN {
	
	public static boolean isValid(String pin) {
		int len = pin.length();
		// Validamos que todos los caracteres sean digitos
		for (int i = 0; i < len; i++) {
            if (!Character.isDigit(pin.charAt(i))) {
                return false;
            }
        }
		// Validamos que la longitud sea 4 o 6 y retornamos la respuesta
		return (len == 4 || len == 6);
	}
}
