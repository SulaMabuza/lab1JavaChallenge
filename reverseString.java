package ICP;

public class reverseString {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String phrase = "Reverse the word of this string";
		String reversedString = "";
		
		
		for(int i = phrase.length() - 1; i >= 0; i-- ) {
			
			reversedString = reversedString + phrase.charAt(i);
			
		}
		
		System.out.println(reversedString);
		
	}

}
