package refectoring;


public class Circle extends Geometry {

	// Entfernen von Attributen, da sie als protected in "Geometry" sind
	private double radius;

	protected Circle(double radius, boolean filled, String color) {
		super(filled, color);
		if (radius < 0) {
			throw new IllegalArgumentException ("Radius less than zero not allowed!"); //Exception setzten ist sauberer als eine einfache Ausgabe
		}

		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		return radius * radius * Math.PI;
	}

	public double getDiameter() {
		return 2 * radius;
	}

	@Override
	public double getPerimeter() {
		return 2 * radius * Math.PI;
	}

}
