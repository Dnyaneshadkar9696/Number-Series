package NumberSeries;

public class HarshadNumberSeries {
	
	public static void main(String[] args) {
		// number divided by its addition
		// 18  so 1+8 = 9 so 18/9 == 0 the remainder will be Zero
		
		for(int i = 10; i <= 100; i++) {
			int sum = 0;  // because the sum will update each time for each number.
			int temp = i;
			while (temp > 0) {
				int digit = temp%10;
				sum = sum + digit;
				temp = temp/10;
			}
			
			if(i%sum == 0) {
				System.out.println(i);
			}
			
			
			
			
			
			
		}
	}

}
