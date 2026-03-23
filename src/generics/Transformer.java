package generics;

import java.util.function.Function;

public class Transformer<T extends Number, R> {
	public R transform(T value, Function<T,R> converter) {
		return converter.apply(value);
	}
	public static void main(String[] args) {
		Transformer <Integer,String> intToString = new Transformer<>();
		String result = intToString.transform(42, Object::toString); //Methodenreferenz //x->toString(x);
		Transformer <Double, Integer> dti = new Transformer<>();
		Integer iResult = dti.transform(3.14, Double::intValue);
	}	
}


