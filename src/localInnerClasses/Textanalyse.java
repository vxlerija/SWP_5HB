package localInnerClasses;

public class Textanalyse {

	public static void analyseText(String text) {
		class TextStatistic {
			//String sentence = "HTL-Reutte 5 HB";
			public void amountOfWords() {
				String[] words = text.split("//s+");
				System.out.println("Words:" + (words.length+1));
			}
			public void amountOfSigns() {
				 int signs = text.replace(" ", "").length();
				 System.out.println("Signs:"+ signs);
				
			}
		}
		TextStatistic ts = new TextStatistic();
		ts.amountOfWords();
		ts.amountOfSigns();

	}
	public static void main(String[] args) {
		analyseText("HTL-Reutte 5 HB");
	}
}
