package com.euler.puzzles.puzzle_7;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.euler.puzzles.library.Utilities;

/* By listing the first six prime numbers: 
 *  2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 *  What is the 10 001st prime number?
 * */

@Component
public class PrintNthPrime implements CommandLineRunner {

	@Override
	@Order(7)
	public void run(String... args) throws Exception {
		boolean nthPrimeNotFound = true;
		int i = 3, j = 3;
		while (nthPrimeNotFound) {
			if (Utilities.isTheNumberPrime(j))
				i ++;
			if (i == 10001)
				break;
			j = j + 2;
		}
		System.out.println (j);
	}
}
