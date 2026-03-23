package wildcards;

public class Box<T extends Comparable<T>> {
	private final T value;

	public Box(T value) {
		this.value = value;
	}

	public T getValue() {
		return value;
	}
	
	public boolean compareBoxes(Box<?> otherBox) {
		if (otherBox == null) {
			return false;
		}else if(this.value == null){
			return otherBox.getValue() == null;
		}
		return this.value.equals(otherBox.getValue());
	}
	
	public static void main (String[] args) {
		Box<String> box1 = new Box<>("Hello");
        Box<Integer> box2 = new Box<>(42);
        Box<String> box3 = new Box<>("Hello");
 
        System.out.println(box1.compareBoxes(box2)); // false
        System.out.println(box1.compareBoxes(box3)); // true
	}
	
}
