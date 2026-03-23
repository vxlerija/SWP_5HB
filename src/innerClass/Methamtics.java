package innerClass;

public class Methamtics {
	
	public static class Factorial{
		public static int berechne(int n) {
			int start = 1;
			for (int i = 1; i <= n; i++) {
				start *= i;
			}
			return start;
		}
	}

	public static void main(String[] args) {
		System.out.println(Factorial.berechne(5));
	}

}
