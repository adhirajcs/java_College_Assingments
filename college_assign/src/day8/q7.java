package day8;
import java.util.*;

/* 7. Write a program to determine if a string has all Unique Characters.[remove white space]
Given a string, determine if the string has all unique characters.
Examples:
Input: ab cd 10jk
Output: true
Input: hutg9mnd!nk9
Output: false */

public class q7 {
	public static void main(String[] args)
	{
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		// taking user input
		System.out.print("Enter the string: ");
		String st1 = sc.next();
		// removing white spaces
		st1 = st1.replaceAll(" ","");
		// nested for loop
		for(int i=0;i<st1.length(); i++)
		{
			for(int j=i+1;j<st1.length();j++)
			{
				if(st1.charAt(i) == st1.charAt(j))
				{
					// if the string does not have all unique characters then flag's value will change to false
					flag = false;
					break;
				}
			}
			// checking if the value of flag is false
			if(flag == false)
			{
				break;
			}
		}
		// printing the value of flag
		System.out.println(flag);	
	}
}

/* OUPUT 1 -
Enter the string: ab cd 10jk
true
*/

/* OUPUT 2 -
Enter the string: hutg9mnd!nk9
false
*/