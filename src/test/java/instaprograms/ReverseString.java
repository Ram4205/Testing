package instaprograms;

public class ReverseString {

	public static void main(String[] args) {

		String original="Welcome";
		
		// By using string builder
		String reversed=new StringBuilder(original).reverse().toString();
		System.out.println("Reverse string:"+" "+reversed);
	}

}
