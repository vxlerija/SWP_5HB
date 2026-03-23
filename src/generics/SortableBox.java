package generics;

public class SortableBox<T extends Comparable<T>> {
	private final T first;
	
	public SortableBox(T first) {
		super();
		this.first = first;
	}

	public T getFirst() {
		return first;
	}
	
	public boolean compareSortingBox(SortableBox<T> sb) {
		return(this.first.compareTo(sb.getFirst()) == 0);
	}
	
	public static void main(String[] args) {
		SortableBox<String> sBox = new SortableBox<String> ("hi");
		SortableBox<String> sBox2 = new SortableBox<String> ("hi");
		System.out.println(sBox.compareSortingBox(sBox2));
		
		SortableBox<Integer> iBox = new SortableBox<Integer> (6);
		SortableBox<Integer> iBox2 = new SortableBox<Integer> (5);
		System.out.println(iBox.compareSortingBox(iBox2));
	}

}
