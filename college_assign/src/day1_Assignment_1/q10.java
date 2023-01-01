package day1_Assignment_1;
import java.util.*;
/* Write a program to obtain the sum of the n terms (n and x to be taken from the user)
of the following series x – x3/3! + x5/5! - x7/7! */

public class q10 {
	
	// User defined function for the calculation of the factorial of the given number
	static int fact(int n) {
		int f = 1;
		for (int i = 2; i <= n; i++)
			f *= i;
		return f;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);  
		// Taking input from the user for the range of power
 		System.out.print("Enter the range: ");			                    
 		int n = sc.nextInt();
 	// Taking input from the user for the value of x
 		System.out.print("Enter the value of x: ");			                
 		int x = sc.nextInt();
		double s = x;
		for (int i = 2; i <= n; i++) {
			// Calculating the value and using pow() method
			double t = Math.pow(x, (2 * i - 1)) / fact(2 * i - 1);
			// Adding all the values
			s += Math.pow(-1, i + 1) * t;                                   
		}
		// Printing the sum of the given terms
		System.out.println("Sum: " + s);                                    
	}

}

/* OUTPUT -
Enter the range: 3
Enter the value of x: 5
Sum: 10.208333333333336
 */
