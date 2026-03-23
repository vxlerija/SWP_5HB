package generics;

public class TestShape<T> {

	public static void main(String[] args) {

		Circlee c1 = new Circlee();
		Rectanglee r1 = new Rectanglee();
		ShapeBoxx<Circlee> s1 = new ShapeBoxx<Circlee>(c1);
		ShapeBoxx<Rectanglee> s2 = new ShapeBoxx<Rectanglee>(r1);
		
		s1.drawShape(c1);
		s2.drawShape(r1);
	}
}
