package genericMethods;

public class countGreaterThan {
	
	
	public static < T extends Comparable<T>> int countGreaterThan(T arr[] , T a) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i].compareTo(a)>=0) {
				count++;
			}
		}
		return count;
		
	}
	public static void main(String[] args) {
		Integer[] numbers = {1, 3, 5, 7, 9};
		System.out.println(countGreaterThan(numbers, 4));

	}

}
