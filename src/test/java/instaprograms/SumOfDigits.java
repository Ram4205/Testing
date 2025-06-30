package instaprograms;

public class SumOfDigits {

	public static void main(String[] args) {

		int numbers=12345;
		int sum=0;
		
		while(numbers>0) {
			sum+=numbers%10; // add last digit to sum
			numbers /=10; // remove last digit
		}
		System.out.println("Sum of digits:"+sum);
	}

}
