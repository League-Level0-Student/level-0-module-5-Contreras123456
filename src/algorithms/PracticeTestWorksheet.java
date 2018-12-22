package algorithms;

import javax.swing.JOptionPane;

public class PracticeTestWorksheet {
public static void main(String[] args) {
	
	String dimes = JOptionPane.showInputDialog("How many dimes do you have?");
   int teletubbies = Integer.parseInt(dimes);
   System.out.println("You have "+ teletubbies*10 + " cents");
   int i = 36;
   String up = JOptionPane.showInputDialog("How tall are you?");
int height = Integer.parseInt(up);
   if (height<i) {
	JOptionPane.showMessageDialog(null, "You need to eat your wheaties." );
}
for (int j = 1; j < 30; j++) {
	System.out.println(j*3);
}
}
}



