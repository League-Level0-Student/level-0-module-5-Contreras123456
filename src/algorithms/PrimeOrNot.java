package algorithms;

import javax.swing.JOptionPane;

public class PrimeOrNot {
	
	public static void main(String[] args) {
		 String taco = JOptionPane.showInputDialog("Guess a number that is prime.");
	int a=Integer.parseInt(taco);
		int count=0;
	for (int i = 1; i <= a; i++) {
		if (a%i==0) {
			count++;
		}
	}
	if(count>2) {
		JOptionPane.showMessageDialog(null, "The number is not prime.");
	}
	else {
		JOptionPane.showMessageDialog(null, "The number is prime.");
	}
	}
}
