package instaprograms;

public class FactorialCalculation {

	public static void main(String[] args) {

		int num=5;
		// Loop method
		
		int factorial1=1;
		for(int i=1;i<=num;i++) {
			factorial1*=i;
		}
		// Recursive method
		int factorial2=factorialRecursive(num);
		
		System.out.println("Factorial of"+num+":"+factorial1+"(loop)");
		System.out.println("Factorial of"+num+":"+factorial2+"(recursive)");
	}
	public static int factorialRecursive(int n) {
		if(n==0||n==1)return 1;
		return n * factorialRecursive(n-1);
	}

}
