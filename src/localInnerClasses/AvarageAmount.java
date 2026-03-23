package localInnerClasses;

public class AvarageAmount {
	
	public static void calculateAvarage(int[] numbers) {
		class DurchschnittBerechnen {
			double sum = 0;
			public double calculate() {
				for (int i = 0; i < numbers.length; i++) {
					sum = sum + numbers[i];
				}
				
				double result = sum/numbers.length;
				return result;
			}
		
		}
		System.out.println(new DurchschnittBerechnen().calculate());
	}
	
	public static void main(String[] args) {
		int[] arr = {1, 4, 5, 6, 2, 3};
		calculateAvarage(arr);
	}
	

}
