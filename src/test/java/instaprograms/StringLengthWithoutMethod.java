package instaprograms;

public class StringLengthWithoutMethod {

	public static void main(String[] args) {

		String str="automation";
		int length=0;
		
		try {
			while(true) {
				str.charAt(length);
				length++;
			}
		}catch (StringIndexOutOfBoundsException e) {
			// End of string reached
		}
		System.out.println("Length of string:"+length);
	}

}
