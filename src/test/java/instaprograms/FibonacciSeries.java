package instaprograms;

public class FibonacciSeries {

	public static void main(String[] args) {

		int n=10; // Number of fibonacci numbers to print
		int a=0,b=1;
		
		System.out.println(a+" "+b+" ");
		
		for(int i=2;i<n;i++) {
			int c=a+b;
			System.out.println(c+" ");
			a=b;
			b=c;
		}
	}

}
