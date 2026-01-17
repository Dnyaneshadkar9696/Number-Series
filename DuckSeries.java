package NumberSeries;

public class DuckSeries {
	
	public static void main(String[] args) {
		// The duck series is the number which have one zero and not at start
		
		
		for(int i=1; i <= 1000; i++) {
			// to print duck series between this range
			int temp = i;
			
			while( temp > 0) {
				int digit = temp%10;
				if(digit == 0) {
					System.out.println(i);
					// temp is changing so not print temp as i is not changing.
					break;
				}
				temp = temp/10; // move to the next number
			}
			
		}
		
		
	}

}
