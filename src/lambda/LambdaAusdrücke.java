package lambda;
 

import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ActionListener;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.DoubleSupplier;
import java.util.function.LongToDoubleFunction;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
 
public class LambdaAusdrücke implements Runnable {
 
	
	
	public static void main(String[] args) {
		//Aufgabe 1
		Run runnable = () -> System.out.println("läuft");
		ActionListener listener = e -> System.out.println("Event" + e.getActionCommand());
		Supplier<String> supplier = () -> "Hallo";
		Consumer<Point> consumer = p -> p.translate(1, 2);
		Comparator<Rectangle> comparator = (r1, r2) -> Integer.compare(r1.width, r2.width);
		
		//Aufgabe 2
		DoubleSupplier ds = () -> Math.random();
		System.out.println(ds.getAsDouble());
		LongToDoubleFunction ltdf = a -> a/2;
		System.out.println(ltdf);
		UnaryOperator<String> up = s -> s.toUpperCase();
		System.out.println(up.apply("java"));
 
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
 
}
 
 