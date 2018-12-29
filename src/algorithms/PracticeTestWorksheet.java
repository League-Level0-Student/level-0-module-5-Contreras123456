package algorithms;

import java.util.Random;

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
for (int j = 1; j < 11; j++) {
	System.out.println(j*3);
}

Random youtuberewind = new Random();
int 	defaultdance = youtuberewind.nextInt(20);
System.out.println(defaultdance);

Random roblox = new Random();
int takethel = roblox.nextInt(10);
System.out.println(takethel);
JOptionPane.showMessageDialog(null, defaultdance-takethel);
String orangejustice = JOptionPane.showInputDialog("What city do you live in?");
if (orangejustice.equals("San Diego")) {
	JOptionPane.showMessageDialog(null, "You live in America's Finest City.");
}
else {
	JOptionPane.showMessageDialog(null, "Move to San Diego.");
}
int cars = 2;
	JOptionPane.showMessageDialog(null,"There are 2 wheels the car has between them.");
String nemo = JOptionPane.showInputDialog("What is the name of your school?");
} 
}




