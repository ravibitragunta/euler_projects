package com.euler.puzzles.puzzle_1;

import org.slf4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

/*
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, 
 * we get 3, 5, 6 and 9. 
 * The sum of these multiples is 23. 
 * 
 * Find the sum of all the multiples of 3 or 5 below 1000.
 * */
@Component
@Slf4j
public class MultiplesOf3And5 implements CommandLineRunner{

	@Override
	@Order(1) 
	public void run(String... args) throws Exception {
		int sum =0;
		for (int i=1; i< 100; i++) {
			if (i%3 ==0 || i%5 ==0) {
				sum += i;
			}
		}
		System.out.println (sum);
		
	}
	

}
