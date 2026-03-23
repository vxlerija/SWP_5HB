package nonStaticInnerClass;

public class University {

	public class Student {
		public void showData(String name, int id) {
			System.out.println(name);
			System.out.println(id);
		}
	}

	public static void main(String[] args) {
		University.Student ds = new University(). new Student();
		ds.showData("Valerija", 10);
	}

}
