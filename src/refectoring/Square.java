package refectoring;

public class Square extends Geometry {

	private final double width;
	private final double height;

	protected Square(double width, double height, boolean filled, String color) {
		super(filled, color);

		if (width < 0 || height < 0) {
			throw new IllegalArgumentException ("Value less than zero not allowed!"); //Exception setzten ist sauberer als eine einfache Ausgabe
		}
		
		this.width = width;
		this.height = height;
	}

	@Override
	public double calculateArea() {
		return width * height;
	}

	@Override
	public double getPerimeter() {
		return 2 * (width + height);
	}

}
