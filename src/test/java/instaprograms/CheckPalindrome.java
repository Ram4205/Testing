package instaprograms;

public class CheckPalindrome {

	public static void main(String[] args) {

		String str="racecar";
		
		// if string contains caps and small letters, convert string lower or upper case
		
		boolean isPalindrome=true;
		
		for(int i=0; i<str.length()/2;i++) {
			if(str.charAt(i) !=str.charAt(str.length()-i-1)) {
				isPalindrome=false;
				break;
			}
		}
		
		System.out.println(str+" "+"is palindrome:"+isPalindrome);
		
				
	}

}
