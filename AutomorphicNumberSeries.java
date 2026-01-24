package NumberSeries;

public class AutomorphicNumberSeries {
	
	public static void main(String[] args) {
		// square of that number is equall to the same number in that numbers last digit
		
		for(int i = 1; i <= 200; i++) {
			
		
		int a = i;
		int b = a;
		
		int c = a *a;
		int digit1= 0;
		int digit2 = 0;
		 while ( c > 0) {
			  digit1 = c%10;
			 break;
		 }
	
		 
		 // now while loop for a 
		 while( a > 0) {
			 digit2 = a % 10;
			 break;
		 }
		
		 
		 if(digit1 == digit2) {
			 System.out.println(b);
		 }
		}
	}

}
