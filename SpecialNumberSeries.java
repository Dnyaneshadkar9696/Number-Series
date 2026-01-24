package NumberSeries;

public class SpecialNumberSeries {
	
	public static void main(String[] args) {
		
		// here is like 59
		// its addition = 14
		// its multiplicaion = 45 
//		and  14 + 45 is 59
		
		for(int i = 1; i <= 200; i++) {
			
		
		int a = i;
		int g = a;
		int sum =0;
		int mul = 1; 
		int total = 0;
		while(a > 0) {
			int digit = a%10;
			sum = sum + digit;
			mul = mul * digit;
			a = a/10;
		}
//		System.out.println(sum);
//		System.out.println(mul);
		total = sum + mul;
//		System.out.println(total);
		
		if( total  == g) {
			System.out.println(i);
		}
		}
		
		

	
	}

}
