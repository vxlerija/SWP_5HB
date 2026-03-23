package wildcards;

import java.util.ArrayList;
import java.util.List;

public class Handler<T> {

	private T elements;

	public Handler(T elements) {
		this.elements = elements;
	}

	public T getElements() {
		return elements;
	}

	public void setElements(T elements) {
		this.elements = elements;
	}
	
	public void addItems(List<? super T> list) {
        list.add(elements);
    }
	
	 public static void main(String[] args) {
	        Handler<Integer> intHandler = new Handler<>(100);
	        List<Number> numbers = new ArrayList<>();
	        intHandler.addItems(numbers);
	        System.out.println(numbers);
	    }
}
