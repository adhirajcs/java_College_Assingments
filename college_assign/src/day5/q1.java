package day5;
import java.util.*;

/* 1. Write a program called factorial.java that computes factorials and catches the result in an
array of type long for reuse. The long type of variable has its own range. For example 20!
Is as high as the range of long type. So check the argument passes and “throw an
exception”, if it is too big or too small. If x is less than 0 throw an IllegalArgument
Exception with a message “Value of x must be positive”.If x is above the length of the
array throw an IllegalArgumentException with a message “Result will overflow”.
Here x is the value for which we want to find the factorial.
 */

// driver class
public class q1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of the array of factorials: ");
		int sz=sc.nextInt();
		// calling the constructor of the factorial class
		new factorial(sz);
		
		for(int i=0; i< sz; i++) {
			// taking user input for the elements
			System.out.print("Enter an element: ");
			int x=sc.nextInt();
			// calling the calcFact method of the factorial class
			factorial.calcFact(x);
		}
		
		System.out.println("Factorial:");
		for(int i=0; i< factorial.size; i++) {
			System.out.println(factorial.arr[i]);
		}
	}
}


/* OUTPUT -
Enter the size of the array of factorials: 5
Enter an element: 3
Enter an element: 6
Enter an element: 2
Enter an element: 5
Enter an element: 8
Factorial:
6
720
2
120
40320
*/