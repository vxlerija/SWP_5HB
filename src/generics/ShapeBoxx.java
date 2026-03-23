package generics;

public class ShapeBoxx<T extends Shapee> {

	private final Shapee shape;
	
	public void drawShape(Shapee s) {
		s.draw();
	}

	public ShapeBoxx(Shapee shape) {
		super();
		this.shape = shape;
	}

	public Shapee getShape() {
		return shape;
	}
	
}
