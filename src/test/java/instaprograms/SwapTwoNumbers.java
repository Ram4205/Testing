package instaprograms;

public class SwapTwoNumbers {

	public static void main(String[] args) {

		int a=10;
		int b=20;
		
		System.out.println("before a="+a+",b="+b);
		
		// Method-1 using arithmetic operations
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After a="+a+",b="+b);
		
		a=150;
		b=234;
		
		System.out.println("before a="+a+",b="+b);
		
		// Method-2 using XOR (alternative)
		a=a^b;
		b=a^b;
		a=a^b;
		
		System.out.println("After a="+a+",b="+b);
		
	}

}
