package NumberSeries;

public class MagicNumberSeries {
	
	public static void main(String[] args) {
		
		// here the addition of the number is done until it is 1
		
		// like 19 - 1+ 9 = 10; 1+0 = 1 ans

			for(int i = 1; i <= 200; i++) {
				
			
			int a = i;
			
			int sum  = 0;
			while ( a > 0) {
				int digit = a%10;
				sum = sum + digit;
				
				a = a/10;
				
			}
//			System.out.println(sum);
			int b= sum;
			int sum1 = 0;
//			System.out.println(b);
			while ( b > 0) {
				int digit1= b%10;
//				System.out.println(b);
				sum1 = sum1 + digit1;
				
				b = b/10;
				
			}
			
			if(sum1 == 1) {
				System.out.println(i);
			}
			
			}
		
	}

}
