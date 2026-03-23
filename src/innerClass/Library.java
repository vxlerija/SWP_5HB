package innerClass;

public class Library {
	private static String name = "Startbibliothek";
	
	public class Book {
		public static void showLibrary(){
			System.out.println(name);
		}
	}
	public static void main(String[] args) {
		Book.showLibrary();
	}

}
