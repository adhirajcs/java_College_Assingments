package day8;

/* 1. Write a Java program to pass the string “Have a nice day!” from the command line, and
display each word in a new line. Use proper import statement for this program. */

// driver class
public class q1 {
	public static void main(String[] args)
	{
		// passing the string from the command line
		for(String st:args){  
		System.out.println(st);
		}
	}
}

/* OUTPUT - 
Have
a
nice
day!
 */