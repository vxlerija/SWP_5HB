package innerClass;

public class Calculator {
	
	public static class Addition {
		public static int add(int a, int b) {
			int result = a+b;
			return result;
		}
	}
	public static void main(String[] args) {
		System.out.println(Addition.add(1, 2));
	}

}
