package NumberSeries;

public class DisariumNumberSeries {

    public static void main(String[] args) {

  // example of disarium series is 135 so 1 ^1 and + 3^2 and 5^3 the sum of this numbers is equal to 135
    	
    	
    int a = 135;
    int e1 = a;
    int e2 = a;
    
    // count the count
    int count=0;
    while(e1 > 0) {
    	count++;
    	e1 = e1/10;
    }
    System.out.println(count);
//    now count is 3
    
	int total = 0;
	// sum and total if inside the loop it will reset to 0
    while(e2 > 0) {
    	int digit = e2%10;
    	// perform calculation with the last digit
    	int i = 1;
    	int sum = 1;
    	while( i <= count ) {
    		
    	sum = sum * digit; // this is doing like 3 * 5
    	i++;
    	}
    	total = total + sum;
    	count--;
    	e2 = e2/10;
    }
    if(total == a) {
		System.out.println(a);

		
	}
    	

		
		
	}

}
