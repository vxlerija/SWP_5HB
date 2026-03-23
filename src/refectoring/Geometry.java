package refectoring;

import java.util.UUID;

public abstract class Geometry implements Comparable<Geometry> {
	protected UUID id = UUID.randomUUID(); // UUID für eine zufällige, automatische Zuweisung von IDs
	protected boolean filled;
	protected String color;




// Codewiederholung gelöscht 

	protected Geometry (boolean filled, String color) {
		this.filled = filled;
		this.color = color;
	}

// für Wiederverwendbarkeit abstract gesetzt 
	
	public abstract double calculateArea();
	
	public abstract double getPerimeter();

// Code verständlicher und einfacher ohne viele if-Statements
	
	@Override
	public int compareTo(Geometry other) {
	    return Double.compare(this.calculateArea(), other.calculateArea());
	}

	public String getColor() {
		return color;
	}

	public UUID getId() {
		return id;
	}

	public boolean isFilled() {
		return filled;
	}
}
