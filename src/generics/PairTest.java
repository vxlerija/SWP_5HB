package generics;

public class PairTest {

	public static void main(String[] args) {
		Integer i1 = 5;
		Integer i2 = 9;
		
		Pair iPair = new Pair (i1, i2);
		
		Double d1 = 8.3;
		Double d2 = 7.3;
		
		Pair dPair = new Pair (d1, d2);
		
		Car c1 = new Car ("Toyota", 180);
		Car c2 = new Car ("Audi", 250);
		
		Pair cPair = new Pair (c1, c2);
		
		System.out.println(cPair.getFirst());
		
		Car c3 = (Car) cPair.getSecond();
		
		Pair icPair = new Pair (i1, c2);
	}

}
