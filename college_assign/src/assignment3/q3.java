package assignment3;

/* 3. Write a program to print the area of a rectangle by creating a class named 'Area' having two
methods. First method named as 'setDim' takes length and breadth of rectangle as parameters
and the second method named as 'getArea' returns the area of the rectangle. Length and breadth
of rectangle are entered through keyboard. */
import java.util.*;

// Creating a class to calculate the area and print it
class area{
	double length, breadth;
	// Declared setDim() method to take length and breadth of rectangle
	void setDim(double l, double b) {																
		length = l;
		breadth = b;
	}
	// Declaring setDim() method to return the area of the rectangle
	double getArea() {												
		return length*breadth;
	}
}

public class q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double l,b;
		// Taking input from the user
		System.out.print("Enter the length: ");
		l = sc.nextDouble();
		System.out.print("Enter the breadth: ");
		b = sc.nextDouble();
		
		// Creating an object of the area class
		area a = new area();
		// calling the setDim() method
		a.setDim(l,b);
		// calling the getArea() method and printing the values
		System.out.println("The area of the rectangle: " + a.getArea());
	}
}

/*OUTPUT - 
Enter the length: 43.54
Enter the breadth: 21.57
The area of the rectangle: 939.1578
*/
