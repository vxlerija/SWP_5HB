package generics;

public class TripleTest {

	public static void main(String[] args) {
		Triple<Integer, Double, String> tr = new Triple <Integer,Double,String> (1, 2.6, "hi");
		System.out.println(tr.toString());
	}

}
