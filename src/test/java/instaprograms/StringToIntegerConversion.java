package instaprograms;

public class StringToIntegerConversion {

	public static void main(String[] args) {

		// String to integer
		
		String numStr="12345";
		int num=Integer.parseInt(numStr);
		System.out.println("String to integer:"+num);
		
		// Integer to string
		int number=12345;
		String str=Integer.toString(number);
		System.out.println("Integer to string:"+str);
		
	}

}
