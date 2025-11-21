package stringOperationAndDataConversion;

public class StringOperations {

	public static void main(String[] args) {

		String sentence = "Java programming is fun and challenging";

		String[] WordsinSentence = sentence.trim().split("\\s+");
		int TotalwordsInSentence = WordsinSentence.length;
		String ReverseSentence = new StringBuilder(sentence).reverse().toString();
		StringBuilder CapitalSentence = new StringBuilder();

		for (String word : WordsinSentence) {
			if (!word.isEmpty()) {
				String FirstLetterCaps = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
				CapitalSentence.append(FirstLetterCaps).append(" ");

			}
			
		}
		System.out.println("Total words in sentence are :" + TotalwordsInSentence);
		System.out.println("Reversed sentence :" + ReverseSentence);
		System.out.println("First letter Captal For all Words : " +CapitalSentence);

	}
}
