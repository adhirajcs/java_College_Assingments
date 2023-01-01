package day4;
import java.util.*;

import Day4_q5_org.shapes.*;

/* 5. Complete the following:
i) Create a package named org.shapes.
ii) Create some classes in the package representing some common geometric shapes like
Square, triangle, circle and so on. The classes should contain area and perimeter
methods in them.
iii) Compile the package.
iv) Use this package to find area and perimeter of different shapes as chosen by the user. */

//driver class
public class q5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//taking user input for the side of the Square
		System.out.println("Enter the side of the square: ");
		double a = sc.nextDouble();
		square s = new square(a);													
		//printing the perimeter and area of the square
		System.out.println("Perimeter of the square: "+s.perimeter());
		System.out.println("Area of the square: "+s.area());
		//taking user input for the side of the Triangle
		System.out.println("Enter the first side of the triangle: ");
		int x = sc.nextInt();
		System.out.println("Enter the second side of the triangle: ");
		int y = sc.nextInt();
		System.out.println("Enter the third side of the triangle: ");
		int z = sc.nextInt();
		triangle t = new triangle(x,y,z);											
		//printing the perimeter and area of the Triangle
		System.out.println("Perimeter of the triangle: "+t.perimeter());
		System.out.println("Area of the triangle: "+t.area());
		//taking user input for the side of the Circle
		System.out.println("Enter the side of the circle: ");
		double radius = sc.nextDouble();
		circle c = new circle(radius);													
		//printing the perimeter and area of the Circle
		System.out.println("Perimeter of the circle: "+c.perimeter());
		System.out.println("Area of the circle: "+c.area());
	}
}


/*OUTPUT - 
Enter the side of the square: 
4
Perimeter of the square: 16.0
Area of the square: 16.0
Enter the first side of the triangle: 
2
Enter the second side of the triangle: 
5
Enter the third side of the triangle: 
6
Perimeter of the triangle: 13
Area of the triangle: 0.0
Enter the side of the circle: 
3
Perimeter of the circle: 18.84
Area of the circle: 28.259999999999998
*/