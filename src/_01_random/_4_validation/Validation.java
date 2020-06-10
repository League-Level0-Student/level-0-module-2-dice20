//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _01_random._4_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {

		Random rng = new Random();

		int randomNumber = rng.nextInt(10);

		System.out.println(randomNumber);
		
		 if (randomNumber == 0){
			JOptionPane.showMessageDialog(null, "You look phenomenal");
		
		}
		else if (randomNumber == 1) {
			JOptionPane.showMessageDialog(null, "Your hair is nice");
		}
		else if (randomNumber == 2){
			JOptionPane.showMessageDialog(null, "good job friend");
		}
		
		else if (randomNumber == 3){
			JOptionPane.showMessageDialog(null, "you look sharp");
		}
		
		else if (randomNumber == 4){
			JOptionPane.showMessageDialog(null, "cool trick");
		}
		
		else if (randomNumber == 5){
			JOptionPane.showMessageDialog(null, "Wow that was cool");
		}
		
		else if (randomNumber == 6){
			JOptionPane.showMessageDialog(null, "Good shot");
		}
		
		else if (randomNumber == 7){
			JOptionPane.showMessageDialog(null, "what a good smile");
		}
		
		else if (randomNumber == 8){
			JOptionPane.showMessageDialog(null, "you did a good thing");
		}
		
		else if (randomNumber == 9){
			JOptionPane.showMessageDialog(null, "Wow I can't belevie you did that");
		}
		
		else if (randomNumber == 10){
			JOptionPane.showMessageDialog(null, "fjusdfygkearf6gryudfgjva");
		}
		// 1. Use each value of randomNumber to give the user a random compliment.

		// 2. Repeat all the code above 10 times

		// 3. Find someone to test out your program. They will like it :)
	}
}
