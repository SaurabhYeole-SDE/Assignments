package stringOperationAndDataConversion;

import java.util.Arrays;

public class StringOpertions2 {

	public static void main(String[] args) {
		
		String paragraph = "Java is a popular programming language. Java is used for web development, mobile applications, and more.";

		String[] paragraphInMutiplewords = paragraph.trim().split("\\s+");
		System.out.println(Arrays.toString(paragraphInMutiplewords));
		
		int TotalNoOfOccurences=0;
		
	for(String word :paragraphInMutiplewords){
		if (word.equalsIgnoreCase("Java")) {
			TotalNoOfOccurences++;
		}
	}
	System.out.println("Total number of occurrences of 'Java' = " + TotalNoOfOccurences);
	for(int i=0;i<paragraphInMutiplewords.length;i++) {
		System.out.println("Word at Index"+i +" "+ paragraphInMutiplewords[i]);
	}
	}

}
