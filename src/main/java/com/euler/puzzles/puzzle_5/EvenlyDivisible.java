package com.euler.puzzles.puzzle_5;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import com.euler.puzzles.library.*;

/*
 * 2520 is the smallest number that can be divided by each of the numbers 
 * from 1 to 10 without any remainder.
 * What is the smallest positive number that is
 * evenly divisible by all of the numbers from 1 to 20?
 * */

@Component
public class EvenlyDivisible implements CommandLineRunner{

	@Override
	@Order(5)
	public void run(String... args) throws Exception {
		int lcm = 1;
		for (int i = 1; i <20; i++) {
			lcm = Utilities.getLCM(lcm, i);
		}
		System.out.println(lcm);
	}

}
