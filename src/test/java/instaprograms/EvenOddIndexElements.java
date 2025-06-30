package instaprograms;

public class EvenOddIndexElements {

	public static void main(String[] args) {

		String[] elements= {"java","selenium","TestNG","Maven","jenkins","Docker"};
		System.out.println("Even index elements:");
		for(int i=0;i<elements.length;i+=2) {
			System.out.println(elements[i]+" ");
		}
		System.out.println("\nOdd index elements:");
		for(int i=1;i<elements.length;i+=2) {
			System.out.println(elements[i]+" ");
		}
	}

}
