package day8;

/* 4. Write a program to accept a string from the user and find out the following statistics:

(a) Count of uppercase character
(b) Count of lowercase character
(c) Count of digits
(d) Count of spaces */

//driver class
public class q4 {

	public static void main(String[] args)
	{
		String s1 = "Hello World 1234";
		int upper = 0, lower = 0, digit = 0, space=0;
		// looping the string
		for(int i = 0; i< s1.length(); i++)
		{
			// checking if the letters in the string are in upper case
			if(Character.isUpperCase(s1.charAt(i)))
			{
				// incrementing the value of upper
				upper++;
			}
			// checking if the letters in the string are in lower case
			else if(Character.isLowerCase(s1.charAt(i)))
			{
				// incrementing the value of lower
				lower++;
			}
			// checking if there are digits in the string
			else if(Character.isDigit(s1.charAt(i)))
			{
				// incrementing the value of digit
				digit++;
			}
			// checking if the string contains any space
			else if(Character.isSpace(s1.charAt(i)))
			{
				// incrementing the value of space
				space++;
			}
		}
		System.out.println("UpperCase:" + upper + "\nLowerCase:" + lower + "\nDigits:" + digit + "\nSpaces:" + space);		
	}
}

/*OUTPUT -
UpperCase:2
LowerCase:8
Digits:4
Spaces:2
*/