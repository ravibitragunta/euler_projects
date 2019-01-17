package com.euler.puzzles.puzzle_9;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

class A {
	static {
		System.out.println ("in A SB");
	}
	public A () {
		System.out.println ("in A CB");
	}
}

class B extends A {
	static {
		System.out.println ("in B SB");
	}
	public B () {
		System.out.println ("in B CB");
	}
}

@Component
/*
 * (3, 4, and 5)
 * (3n) * (3n) + (4n) * (4n) = (5n) * (5n)
 * */
public class SpecialPythagoreanTriplet extends  B  implements CommandLineRunner{
	static {
		System.out.println ("in C SB");
	}
	
	public SpecialPythagoreanTriplet() {
		super();
		System.out.println ("in C CB");
	}
	private static final int PERIMETER = 1000;
	@Override
	@Order(9)
	public void run(String... args) throws Exception {
		
		for (int a = 1; a < PERIMETER; a++) {
			for (int b = a + 1; b < PERIMETER; b++) {
				int c = PERIMETER - a - b;
				if (a * a + b * b == c * c) {
					// It is now implied that b < c, because we have a > 0
					System.out.println (a + "-" + b + "-" + c);
					System.out.println (Integer.toString(a * b * c));
				}
			}
		}
	}
}
