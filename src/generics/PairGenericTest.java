package generics;

public class PairGenericTest {

	public static void main(String[] args) {
		final PairGeneric<Integer,String> pi = new PairGeneric<Integer,String>(1, "h");
		pi.swap(pi);
	}

}
