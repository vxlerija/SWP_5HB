package genericsTypebounds;

public class Test<T> {

	public static void main(String[] args) {
		//Aufgabe1
		SortableBox<String> b1 = new SortableBox("Hello", "Hello");
		System.out.println(b1.compareToOtherBox());
		
		SortableBox<Integer> b2 = new SortableBox(1, 2);
		System.out.println(b2.compareToOtherBox());
		
		//Aufgabe 2
		Circle c1 = new Circle();
		Rectangle r1 = new Rectangle();
		ShapeBox<Circle> s1 = new ShapeBox<Circle>(c1);
		ShapeBox<Rectangle> s2 = new ShapeBox<Rectangle>(r1);
		
		s1.drawShape(c1);
		s2.drawShape(r1);
	}
}
