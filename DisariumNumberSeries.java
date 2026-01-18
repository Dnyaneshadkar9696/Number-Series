package NumberSeries;

public class DisariumNumberSeries {

    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {

            int temp = i;
            int sum = 0;
            int digits = 0;

            // Step 1: count digits
            int count = i;
            while (count > 0) {
                digits++;
                count = count / 10;
            }

            // Step 2: calculate Disarium sum
            while (temp > 0) {
                int digit = temp % 10;
                sum += Math.pow(digit, digits);
                digits--;
                temp = temp / 10;
            }

            // Step 3: check
            if (sum == i) {
                System.out.println(i);
            }
        }

		
		
	}

}
