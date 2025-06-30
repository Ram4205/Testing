package instaprograms;

import java.util.Arrays;

public class ArrayReversal {

	public static void main(String[] args) {

		int[] array= {1,2,3,4,5};
		
		System.out.println("Original:"+Arrays.toString(array));
		
		int start=0;
		int end=array.length-1;
		
		while(start<end) {
			// swap elements
			int temp=array[start];
			array[start]=array[end];
			array[end]=temp;
			
			// mpve pointers
			start++;
			end--;
			
		}
		System.out.println("Reversed:"+Arrays.toString(array));
	}

}
