package day1;
import java.util.*;

/* Write a program that reads three coordinate and calculate the side of triangle. 
Check whether these numbers can be considered as the three sides of a triangle.
If so, find the type (isosceles, equilateral or right-angled) and area of the triangle.
*/

public class q1 {
	public static void main(String args[]) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter the first coordinates: ");      // taking input from the user for the first coordinates
	    int x1 = sc.nextInt();
	    int y1 = sc.nextInt();
	    
	    System.out.print("Enter the second coordinates: ");    // taking input from the user for the second coordinates
	    int x2 = sc.nextInt();
	    int y2 = sc.nextInt();
	    
	    System.out.print("Enter the third coordinates: ");     // taking input from the user for the third coordinates
	    int x3 = sc.nextInt();
	    int y3 = sc.nextInt();
	    																// Calculating the distance for the
		double a = Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));      // first to second coordinates
		double b = Math.sqrt(((x3-x2)*(x3-x2))+((y3-y2)*(y3-y2)));      // second to third coordinates
		double c = Math.sqrt(((x3-x1)*(x3-x1))+((y3-y1)*(y3-y1)));      // third to first coordinates
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		if((a + b) > c || (a + c)> b || (b + c) > a)       				 // checking if the sum of two sides is greater than the other side
		{
			System.out.println("The numbers can be considered as the three sides of a triangle.");
			if(a == b && b == c){                                                   // Checking if all the sides are equal
				System.out.println("The triangle is an equilateral triangle.");
			}
			else if(a == b || b ==c || c==a) {                                      // Checking if two of the sides are equal
				System.out.println("The triangle is an isosceles triangle.");
			}
			else if ((a*a)+(b*b) == (c*c)) {                                        // Checking if its a right-angled trianlge by using pythagoras theorem
				System.out.println("The triangle is an Right-angled triangle.");
			}
			double area = 0.5*(x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2));                   // Calculating the area of the triangle
			System.out.println("The area of the triangle is:-"+area);
		}
		else
		    System.out.println("Its not a triangle.");
		
	}
}

/* OUTPUT -
Enter the first coordinates: 1
2
Enter the second coordinates: 1
4
Enter the third coordinates: 2
3
2.0
1.4142135623730951
1.4142135623730951
The numbers can be considered as the three sides of a triangle.
The triangle is an isosceles triangle.
The area of the triangle is:--1.0

*/