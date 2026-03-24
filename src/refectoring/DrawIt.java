package refectoring;

public class DrawIt {
	public static void main(String[] args) throws InvalidAccessException {

		Geometry filledGreyRect = new Rectangle(1, 2, true, "grey");
		Geometry unfilledBlueRect = new Rectangle(2, 9, false, "blue");
		Geometry filledGreyCircle = new Circle(3, true, "grey");
		Geometry unfilledRedCircle = new Circle(4, false, "red");
		Geometry filledBlueSquare = new Square(5, true, "blue");

		GeometryCollection<Geometry> construction = new GeometryCollection<Geometry>();

		construction.add(filledBlueSquare);
		construction.add(filledGreyRect);
		construction.add(unfilledBlueRect);
		construction.add(filledGreyCircle);
		construction.add(unfilledRedCircle);

		try {
			System.out.println("The area of the object is: " + construction.getById(filledBlueSquare.getId()).calculateArea());
		} catch (InvalidAccessException e1) {
			System.out.println(e1.getMessage());
		}

		System.out.println(construction.contains(unfilledRedCircle));
		
		try {
			construction.remove(unfilledRedCircle);
			System.out.println(construction.getById(filledGreyRect.getId()).calculateArea());
			System.out.println(construction.getById(unfilledRedCircle.getId()).calculateArea());
			System.out.println(construction.contains(unfilledRedCircle));
		} catch (InvalidAccessException e) {
			System.out.println(e.getMessage());
		}
	}
}
