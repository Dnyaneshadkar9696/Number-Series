package NumberSeries;

public class StrongNumberSeries {
	
	public static void main(String[] args) {
		
		// strong number series is like addition of that numbers factorial is equal to that number
		// like 145 1! + 4! + 5! is equal to 145
		
		
		for(int j = 1; j <= 50000; j ++) {
			
		
		int a = j; 
		int d1 = a; 
		int d2 = a;
		
		// we have to go throught the number
		int number = 0;
		int total = 0;
		while( d1 > 0 ) {
			int digit = d1%10;
			int sum = 1;
			for(number= digit; number > 0; number--) {
			 sum = sum * number;
			 
		}
			total = total + sum;
			
			d1 = d1/10;
		}
		
		if(total == d2) {
			System.out.println(d2);
		}
		}
	}

}
