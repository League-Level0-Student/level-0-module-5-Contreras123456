package nested_loops;


public class ForLoopGaunlet {
public static void main(String[] args) {
	
		for (int i = 0; i < 101  ; i++) {
			System.out.println(i);
		}
		for (int i = 100; i > 0 ; i--) {
		System.out.println(i);	
		}
		for (int i = 2; i < 101 ; i++) {
			if (i%2==0) {
				System.out.println(i);
			}
				for (int j = 1; j < 99; j+=2) {
						System.out.println(j);
					
				}
			for (int j = 0; j < 501; j++) {
				if (j%2==0) {
					System.out.println(j+"is even");
				}
				else {
					System.out.println(j+"is odd");
				}
				
				
			}
			for (int n = 0; n <= 777; n+=7) {
				System.out.println(n);
			}
			int year=2006;
			for (int j = 0; j < 13; j++) {
				System.out.println("In "+year+", I was "+ j +" years old");
				year++;
			}
		}
		for (int i = 0; i <=2; i++) {
			for (int j = 0; j <= 2; j++) {
				System.out.println(i+" "+j);
			}
		}
		
		for (int i = 0; i < 3; i++) {
			for (int j = 1; j <=3; j++) {
				System.out.print((3*i+j)+" ");
		    }
				System.out.println();
		}
		
		for (int i = 1; i <= 9; i++) {
			System.out.print(i+" ");
		  
		}

		   
		for (int i = 0; i < 10; i++) {
			for (int j = 1; j <= 10; j++) {
					
			System.out.print((10*i+j)+" ");
			  	    
			}
			   System.out.println();
		}
		// Task 4
		for (int i = 6; i >=1 ; i--) {
			for (int j = i; j <=6 ; j++) {
			    System.out.print("* ");
			}
			System.out.println();
		
		}
		
		
		}
		}


		
		
		
				
			
			
			
	


			
	
	

