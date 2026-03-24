package refectoring;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class GeometryCollection<T extends Geometry> {
	private final List<T> container;

	public GeometryCollection() {
		container = new ArrayList<T>();
	}

	public void add(T geometry) {
		container.add(geometry);
	}

	public void remove(T geometry) {
		container.remove(geometry);
	}

	public boolean contains(T geometry) {
		return container.contains(geometry);
	}
	
	
	//Codewiederholung gelöscht -> Contains
	
	//UUID anstatt int
	public T getById(UUID id) throws InvalidAccessException { 
        for (T geometry : container) {
            if (geometry.getId().equals(id)) {
                return geometry; 
            }
        }
        throw new InvalidAccessException("No such element.");
    }
}