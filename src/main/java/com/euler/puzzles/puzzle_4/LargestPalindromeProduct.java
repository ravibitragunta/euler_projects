package com.euler.puzzles.puzzle_4;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/*A palindromic number reads the same both ways. 
 * The largest palindrome made from the product of 
 * two 2-digit numbers is 9009 = 91 × 99.
 * Find the largest palindrome made 
 * from the product of two 3-digit numbers.
 */

@Component
public class LargestPalindromeProduct implements CommandLineRunner{

	@Override
	@Order(4)
	public void run(String... args) throws Exception {
		System.out.println (6/6);
		for (int i = 999999; i > 100000; i--) {
			if (isPalindrome (i)) {
				System.out.println ("trying for -> " + i);
				if (print3DigitDivisors(i))  {
					break;
				}
			}
		}
	}
	
	public boolean print3DigitDivisors (int number) {
		for (int i = 999; i >= 100; i--) {
			if (number % i == 0) {
				for (int j = 999; j >= 100; j--) {
					if (number % (j * i) == 0 && number / (j * i) == 1) {
						System.out.println("Largest Palindrome -> " +number +"-"+ i + "-" + j );
						return true;
					}
				}
			}
		}
		return false;
	}
	
	public boolean isPalindrome (int number) {
		
		int localNum = number;
		int reversedNum = 0, temp = 0;
		
		while (localNum > 0) {
			temp = localNum%10;
			reversedNum = reversedNum * 10 + temp;
			localNum = localNum/10;
		}
		
		if (number == reversedNum) 
			return true;
		else
			return false;
	}
}
