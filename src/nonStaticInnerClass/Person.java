package nonStaticInnerClass;

public class Person {
	private String name = "Angelina";
	
	
	public Person(String name) {
		super();
		this.name = name;
	}
	
	public Person() {}

	public class Details{
		public void showName() {
			System.out.println(name);
		}
	}
	
	public static void main(String[] args) {
		new Person().new Details().showName();
	}
}
