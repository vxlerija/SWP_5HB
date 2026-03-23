package wildcards;
 
import java.util.List;
 
public class Container<T> {
	
	 private List<T> elements;
 
	    public Container(List<T> elements) {
	        this.elements = elements;
	    }
	    
	    
 
	    public List<T> getElements() {
			return elements;
		}
 
 
 
		public void setElements(List<T> elements) {
			this.elements = elements;
		}
 
 
 
		public static double sumItems(Container<?extends Number> container) {
	        double sum = 0.0;
	        for (Number num : container.getElements()) {
	            sum += ((Number) num).doubleValue();
	            }
	        return sum;
	    }
	    
	    public static void main(String[] args) {
	        List<Integer> nums = List.of(50, 50, 50, 50);
	        Container<Integer> intContainer = new Container<>(nums);
	        System.out.println(Container.sumItems(intContainer));
		
	}
 
}
 