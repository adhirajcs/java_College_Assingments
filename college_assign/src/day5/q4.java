package day5;
import java.util.Scanner;
import java.util.regex.*;

/* 4. Write a class that keeps a running total of all characters passed to it (one at a time) and
throws an exception if it is passed a non-alphabetic character. */

class NonAlphabeticChar extends Exception{
	public NonAlphabeticChar(){
		System.out.println("A non-alphabetic character has been passed!!!");
	}
}

public class q4 {
	public static void main(String[] args) {
		// try block to check for exceptions
		try{
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the string: ");
			String st = sc.next();
			// checking if the string contains only letters or not
			if (Pattern.matches("[a-zA-Z]+",st)) { 
			  System.out.println("The String contains only Letters.");
			}
			else{
				// throws an exception if a non-alphabetic character is passed
			  throw new NonAlphabeticChar();
			}
	}
		// catch block
		catch(Exception E){
			System.out.println(E);
		}
	}
}

/* OUTPUT 1 -
Enter the string: fidmsfsdpsdsamdpsd
The String contains only Letters.
*/

/* OUTPUT 1 -
Enter the string: gfkfsdf453423oko,lfds4532
A non-alphabetic character has been passed!!!
day5.NonAlphabeticChar

*/
