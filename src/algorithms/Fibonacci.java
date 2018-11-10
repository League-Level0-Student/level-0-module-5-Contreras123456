package algorithms;

public class Fibonacci {

public static void main(String[] args) {
	int newnumber = 0;
	int first = 0;
	int second = 1;
	System.out.println(first);
	System.out.println(second);
	for (int i = 0; i < 11 ; i++) {
		 newnumber = first+second;
		System.out.println(newnumber);
		first = second;
		second = newnumber;
		
	}
}
}
