package You_Activity1;

public class NameVowelConsonant {
	 static int getVowelCount(String name) {
	        int count = 0;

	        // Convert the name to lowercase for case-insensitive counting
	        name = name.toLowerCase();

	        // Iterate through each character in the name
	        for (int i = 0; i < name.length(); i++) {
	            char c = name.charAt(i);
	            
	            // Check if the character is a vowel (a, e, i, o, u)
	            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
	                count++; // Increment the vowel count
	            }
	        }

	        return count;
	    }

	    public static void main(String[] args) {
	        System.out.println("Total vowel in Rajesh is " + getVowelCount("Rajesh"));
	        System.out.println("Total vowel in Yogita is " + getVowelCount("Yogita"));
	    }
}
