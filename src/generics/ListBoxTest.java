package generics;

import java.util.ArrayList;

public class ListBoxTest<T> {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(4);
		numbers.add(6);
		numbers.add(12);
		numbers.add(8);
		ListBox<Integer> listBox = new ListBox<>();
		System.out.println(listBox.sumElements(numbers));
	}

}
