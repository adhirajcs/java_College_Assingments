package day7;
import java.util.*;

/* 2. Define an exception called “NoMatchFoundException” that is thrown when a string is
not equal to “University”. Write a program that uses this exception. */

// NoMatchFoundException named class inheriting the Exception class 
class NoMatchFoundException extends Exception {
    public NoMatchFoundException() {
    	// This method will execute if the string does not have the word "University"
        System.out.println("This string does not have the word \"University\"");
    }
}

// driver class
public class q2
{
	public static void main(String[] args) {
		// try block
		try {
		    Scanner sc = new Scanner(System.in);
		    // taking user input for the string
		    System.out.print("Enter a string: ");
		    String st = sc.next();
		    // checking if the string contains the word "University"
		    if(st.equals("University")) {
		        System.out.print("This string contains \"University\"");
		    }
		    else {
		        // throw keyword is used here for the exception if the string doesn't contain the word "University"
		        throw new NoMatchFoundException();
		    }
		}
		// catch block
		catch (NoMatchFoundException e) {
			// counting the number of exceptions
		    System.out.print("This program has an exception of" + e);
		}
	}
}

/*
OUTPUT 1 - 
Enter a string: gfdgdf
This string does not have the word "University"
This program has an exception ofday7.NoMatchFoundException
*/

/*
OUTPUT 1 -
Enter a string: University
This string contains "University"
*/