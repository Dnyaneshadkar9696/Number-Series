package NumberSeries;

public class AlternateSeries {
	
	public static void main(String[] args) {
		
		
		// in alternate series we like alternately have negative numbers
		
		for(int i = 1; i <= 100 ; i++) {
			if(i%2 == 0) {
				int c = -(i);
				System.out.println(c);
			}
			else {
				System.out.println(i);
			}
		}
	}

}
