//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _01_random._1_intro_to_random;

import java.util.Random;

public class IntroToRandom {
	public static void main(String[] args) {
		
		int num = 0;
		
		//3   Now to make num random. 
		//3a. Create an object of the Random class, Hint: Random ran = new Random()
		Random rng = new Random();
		
		//3b. Next, set the value of num, using .nextInt() to get a random number from the Random object
		num = rng.nextInt();
		
		System.out.println(num);

		//4. Now limit the value of num to be between 0 and 100
		num = rng.nextInt(100);
		
		System.out.println(num);

		//5. Now limit the value of num to be between 25 and 75. Hint: ((highest value - lowest value)+1) + lowest value
		num = rng.nextInt(75 - 25 + 1) + 25;
		/*
		 * nextInt is bounded from 0 -> N (100)
		 * nextInt(75) bound between 0 -> 75  != 25->75
		 * 75 - 25 = 50 is the range.. 
		 * nextInt(51) + 25 bottom bound goes from 0 -> 25 top bound goes from 50 -> 75.
		 */
		
		System.out.println(num);
		
		//6. Challenge: Limit the value of num to be between -222 and 88
		num = rng.nextInt(88 + 222 +1) - 222;
								
		System.out.println(num);

		//1. Print out the value of num
		
		//2. Run the program.  What number appears in the console?
		//   Run it again. Is the number the same?
	}
}
