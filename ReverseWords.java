package iCPlab1;
import java.util.Scanner;
public class ReverseWords {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		
		Scanner sentence = new Scanner(System.in);
		System.out.println("Enter phrase: ");
		String phrase = sentence.nextLine();

		String finalReversed = "";
		// splitting the string according to spaces
		String[] divided = phrase.split(" ");
		
		for(int ind = 0; ind < divided.length; ind++) {
			String words = divided[ind];
			String reversedString = "";
			
			// reverses word by word
			for(int i = words.length() - 1; i >= 0; i-- ) {

			reversedString = reversedString + words.charAt(i);
		
		}
	
		finalReversed = finalReversed + reversedString+" ";
		
		}		
		
		System.out.println(finalReversed);
		sentence.close();

	}
		
}
