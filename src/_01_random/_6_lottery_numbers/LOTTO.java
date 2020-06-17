package _01_random._6_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class LOTTO {
	
	public static void main(String[] args) {
		
		Random rng = new Random();
		
		
		for (int i =0; i < 6; i++) {
			int ticket = rng.nextInt(6);
			JOptionPane.showMessageDialog(null,"your lottery tickets are:");

		}
		
		
		
	}

}
