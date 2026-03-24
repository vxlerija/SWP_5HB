package refectoring;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class GeometryCollection<T extends Geometry> {
	private final List<T> container;

	public GeometryCollection() {
		container = new ArrayList<T>();
	}

	public void add(T t) {
		container.add(t);
	}

	public void remove(T t) {
		container.remove(t);
	}

	public boolean contains(T t) {
		return container.contains(t);
	}
	
	
	//Codewiederholung gelöscht -> Contains
	
	//UUID anstatt int
	public T getById(UUID id) throws InvalidAccessException { 
        for (T t : container) {
            if (t.getId().equals(id)) {
                return t; // direkt returnen, kein null-Element nötig
            }
        }
        throw new InvalidAccessException("No such element.");
    }
}