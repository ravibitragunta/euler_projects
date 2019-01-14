package com.euler.puzzles.puzzle_3;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/*
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143
 * */

@Component
public class PrintGreatestPrimeFactor implements CommandLineRunner {

	//long number = 600851475143l;
	long number = 42l;
	@Override
	@Order(3)
	public void run(String... args) throws Exception {
		long maxPrimeDivisor = 1;
		for (long i=2; i<= number/2; ++i ) {
			if (number % i == 0) {
				if (checkIfDivisorIsPrime (i)) {
					maxPrimeDivisor = i;
				}
			}
		}
		System.out.println (maxPrimeDivisor);
	}
	
	public boolean checkIfDivisorIsPrime (long divisor) {
		for (long i = 2; i < divisor/2; i++) {
			if (divisor %i == 0) {
				System.out.println("Divisor is -->" + i);
				return false;
			}
		}
		return true;
	}
	
	

}
