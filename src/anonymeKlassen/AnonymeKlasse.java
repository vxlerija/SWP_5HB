package anonymeKlassen;

import java.util.Arrays;
import java.util.Comparator;

public class AnonymeKlasse { 

	public static void main(String[] args) {
		String[] words= {"Java", "Programming", "HTL", "Code"};
		
		//Sortieren mit anonymer Klase
		Arrays.sort(words, new Comparator<String>() {
			public int compare(String s1, String s2) {
				return Integer.compare(s1.length(), s2.length());
			}
		});
		
		//Ausgabe der Arrays
		System.out.println(Arrays.toString(words));
	}

}
