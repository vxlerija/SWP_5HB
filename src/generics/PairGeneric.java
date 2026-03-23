package generics;

public class PairGeneric<T,U> { 
	private final T first;
	private final U second;
	public PairGeneric(T first, U second) {
		this.first = first;
		this.second = second;
	}
	public T getFirst() {
		return first;
	}
	public U getSecond() {
		return second;
	}
	
	public void swap(PairGeneric <T,U> pair) {
		T first;
		U second;
		first = (T)getSecond();
		second = (U)getFirst();
		PairGeneric<T,U> pair2 = new PairGeneric<T,U	>(first, second);
		System.out.println(pair2);
	}
}
