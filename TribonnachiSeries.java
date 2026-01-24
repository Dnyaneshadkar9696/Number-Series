package NumberSeries;

public class TribonnachiSeries {
	
	public static void main(String[] args) {
		// this series is of like sum of previous three numbers
		
		//0 1 1 2 4 7 13 
		
		int a = 0; 
		int b = 1;
		int c = 1;
		System.out.print(a+" ");
		System.out.print(b+" ");
		System.out.print(c+" ");
		
		for(int i = 1 ; i <= 10; i++) {
			
			int d = a + b + c; 
			System.out.print(d+" ");
			a = b; 
		    b = c;
		    c = d; // we update the values forward here just like fibonnachi series we just take d as new variable 
		}
	}

}
