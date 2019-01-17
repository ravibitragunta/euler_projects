package com.euler.puzzles.puzzle_10;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import java.io.BufferedInputStream;

import com.euler.puzzles.library.Utilities;

/*
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17
 * the sum of all the primes below two million
 * */

@Component
public class SummationOfPrimes implements CommandLineRunner{
	
	
	
	@Override
	@Order(10)
	public void run(String... args) throws Exception {
		long sum = 6;
		
		String s1 = "Ravi";
		String s2 = "Ravi";
		
		if (s1 == s2) {
			System.out.println ("True");
		}
		
		if (s1.equals(s2)) {
			System.out.println ("True");
		}
		
		for (int j = 5; j <=2000000; ) {
			if (Utilities.isTheNumberPrime(j)) {
				sum = sum + j;
			}
			j =j+ 2;
		}
		System.out.println ("Sum of primes ->"+sum);
		//1 2 3 5 7
	}
}
