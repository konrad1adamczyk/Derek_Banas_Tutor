package Tutorials;

import java.util.Arrays;

public class JavaLesson13
{

	public static void main(String[] args)
	{
		
		String randomString = "I'm just a random string";
		
		String gotToQuote = "He said, \"I'm here\"";
		
		System.out.println(randomString + " " + gotToQuote);
		
		int numTwo = 2;
		
		System.out.println(randomString + " " + numTwo);
		
		String uppercaseStr = "BIG";
		String lowercaseStr = "big";
		
		if(uppercaseStr.equalsIgnoreCase(lowercaseStr))
		{
			System.out.println("They're equal");
		}
		
		String letters = "abcde";
		String moreLetters = "fghijk";
		
		System.out.println("2nd char:" + letters.charAt(1));
		
		System.out.println(letters.compareTo(moreLetters));
		
		System.out.println(letters.contains("abc"));
		
		System.out.println(letters.endsWith("de"));
		
		char[] charArray = letters.toCharArray();
		System.out.println(Arrays.toString(charArray));
		
		
		

	}

}
