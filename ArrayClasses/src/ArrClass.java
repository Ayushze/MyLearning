import java.util.Arrays;

public class ArrClass {

	public static void main(String[] args) {
		
//		int a[] = {1,2,3,4};
//		int index = Arrays.binarySearch(a, 3);
//		System.out.println(index);
		
		Integer[] numbers = {1,6,23,6,12,65};
		Arrays.sort(numbers);
		
		for(int i: numbers) {
			System.out.print(i+" ");
		}
	}
}
