package NumberSeries;

public class NeonSeries {
	
	public static void main(String[] args) {
		
		
		// the Neon series is like 9 square is 81 and 8+1 is 9 thats the neon series
		for(int i = 1; i <= 20; i++) {
	
			
			int a = (i*i);
			// we have to calculate the sum of the square number
			int b = a;
			int sum = 0;
			while(b > 0) {
				// we cannot use i value as it is already in use with for loop
				int digit = b%10;
				sum = sum + digit;
				b = b/10;
			}
			if(i == sum) {
				System.out.println(i);
			}

			
			
		}
		
		
	}

}
