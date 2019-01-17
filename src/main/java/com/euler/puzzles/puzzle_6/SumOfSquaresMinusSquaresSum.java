package com.euler.puzzles.puzzle_6;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/* The sum of the squares of the first ten natural numbers is,
 *  1*1 + 2*2 + ... + 10*10 = 385
 *  The square of the sum of the first ten natural numbers is,
 *  (1 + 2 + ... + 10) * (1 + 2 + ... + 10) = 55 * 55 = 3025
 *  
 *  Hence the difference between the sum of the squares of the first ten natural numbers
 *  and the square of the sum is 3025 − 385 = 2640
 *  
 *  Find the difference between the 
 *  sum of the squares of the first one hundred natural numbers 
 *  and the square of the sum
 * */

@Component
public class SumOfSquaresMinusSquaresSum implements CommandLineRunner{

	@Override
	@Order(6)
	public void run(String... args) throws Exception {
		long arithematicSum = getSumOfNaturalNumbers(100);
		long squareOfSum = arithematicSum * arithematicSum;
		long squaresOfNumbers = getSquaresOfNumbers(10);
		System.out.println(squareOfSum - squaresOfNumbers);
	}
	
	public long getSquaresOfNumbers (int higherNumber) {
		/*
		 * n * (n + 1) * (2*n + 1)/6
		 * */
		return higherNumber * (higherNumber + 1) * (2 * higherNumber + 1) /6;
	}
	public long getSumOfNaturalNumbers (int higherNumber) {
		return higherNumber * (higherNumber + 1) /2;
	}
}
