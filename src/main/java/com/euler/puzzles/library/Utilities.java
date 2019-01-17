package com.euler.puzzles.library;

public final class Utilities {

	public static boolean isTheNumberPrime (int number) {
		for (long i = 2; i < number/2; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static int getLCM (int number1, int number2) {
		return number1 * number2 / (getGCD (number1, number2));
	}
	
	public static int getGCD (int number1, int number2) {
		int higherNumber = number1 > number2 ? number1: number2;
		int gcd = 1;
		for (int i = 1; i <= higherNumber; i++) {
			if (number1 % i == 0 && number2 % i ==0) {
				gcd = i;
			}
		}
		return gcd;
	}
	
}
