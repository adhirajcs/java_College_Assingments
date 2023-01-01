package day3;

/* 1. Write an inheritance hierarchy for classes Quadrilateral, Trapezoid, Parallelogram, Rectangle
and Square. Use Quadrilateral as the super class of the hierarchy. Specify the instance
variables and methods for each class. The private instance variables of Quadrilateral should
be the x-y coordinate pairs for the four endpoints of the Quadrilateral. Write a program that
instantiates objects of your classes and outputs each object&#39;s area (except Quadrilateral). 
 */

import java.util.Scanner;

abstract class Quadrilateral {
	private int a[], b[]; 
	double side[], h;
	// defining the base on which the side will be parellel to the x-axis
	boolean base;
	static Scanner sc;

	Quadrilateral() {
		a = new int[4];
		b = new int[4];
		side = new double[4];
		h = 0.0;
		base = false;
		sc = new Scanner(System.in);
	}

	void input() {
		for (int i = 0; i < 4; i++) {
			System.out.print("a" + (i + 1) + ": ");
			a[i] = sc.nextInt();
			System.out.print("b" + (i + 1) + ": ");
			b[i] = sc.nextInt();
			System.out.println();
		}
		// calling the private method getSide()
		getSide();
	}

	private void getSide() {
		for (int i = 0; i < 4; i++) {

			// calculating the length of the side using formula of distance
			side[i] = Math.sqrt((b[(i + 1) % 4] - b[i]) * (b[(i + 1) % 4] - b[i])
					+ (a[(i + 1) % 4] - a[i]) * (a[(i + 1) % 4] - a[i]));
			System.out.println("Side" + (i + 1) + ": " + side[i]);
		}

		// calculating the height which is based on the side parallel to axis
		// and determining the base
		if (b[0] == b[1]) {
			h = Math.abs(b[1] - b[2]);
			// side 0 will be base
			base = true;
		} else if (b[1] == b[2]) {
			h = Math.abs(b[1] - b[0]);
			// side 1 will be base
			base = false;
		}
		System.out.println();
	}

	abstract double area();
}
// class to calculate area of Trapezoid
class Trapezoid extends Quadrilateral {
	double area() {
		System.out.printf("Trapezoid Height: %f\n\n", h);
		double s; // sum of parallel sides
		if (base)
			s = side[0] + side[2];
		else
			s = side[1] + side[3];
		return 0.5 * s * h;
	}
}
// class to calculate area of Parallelogram
class Parallelogram extends Quadrilateral {
	double area() {
		System.out.printf("Parallelogram Height: %f\n\n", h);
		if (base)
			return side[0] * h;
		else
			return side[1] * h;
	}
}
// class to calculate area of Rectangle
class Rectangle extends Quadrilateral {
	double area() {
		return side[0] * side[1];
	}
}
// class to calculate area of Square
class Square extends Quadrilateral {
	double area() {
		return side[0] * side[0];
	}
}



public class q1
{  
	public static void main(String[] args) {
		Quadrilateral qobj;

		// taking user input for Square
		System.out.println("For Square: ");
		qobj = new Square();
		qobj.input();
		System.out.println("Square Area: " + qobj.area());

		// taking user input for Rectangle
		System.out.println("\nFor Rectangle: ");
		qobj = new Rectangle();
		qobj.input();
		System.out.println("Rectangle Area: " + qobj.area());

		// taking user input Parallelogram
		System.out.println("\nFor Parallelogram: ");
		qobj = new Parallelogram();
		qobj.input();
		System.out.println("Parallelogram Area: " + qobj.area());

		// taking user input for Trapezoid
		System.out.println("\nFor Trapezoid: ");
		qobj = new Trapezoid();
		qobj.input();
		System.out.println("Trapezoid Area: " + qobj.area());
	}
}

/* OUTPUT - 
For Square: 
a1: 4
b1: 7

a2: 2
b2: 6

a3: 4
b3: 2

a4: 7
b4: 4

Side1: 2.23606797749979
Side2: 4.47213595499958
Side3: 3.605551275463989
Side4: 4.242640687119285

Square Area: 5.000000000000001

For Rectangle: 
a1: 6
b1: 3

a2: 2
b2: 7

a3: 5
b3: 3

a4: 2
b4: 7

Side1: 5.656854249492381
Side2: 5.0
Side3: 5.0
Side4: 5.656854249492381

Rectangle Area: 28.284271247461902

For Parallelogram: 
a1: 6
b1: 2

a2: 1
b2: 8

a3: 5
b3: 4

a4: 3
b4: 6

Side1: 7.810249675906654
Side2: 5.656854249492381
Side3: 2.8284271247461903
Side4: 5.0

Parallelogram Height: 0.000000

Parallelogram Area: 0.0

For Trapezoid: 
a1: 5
b1: 3

a2: 7
b2: 3

a3: 7
b3: 2

a4: 1
b4: 8

Side1: 2.0
Side2: 1.0
Side3: 8.48528137423857
Side4: 6.4031242374328485

Trapezoid Height: 1.000000

Trapezoid Area: 5.242640687119285

*/