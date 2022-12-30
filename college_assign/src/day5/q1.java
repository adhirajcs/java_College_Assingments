package day5;

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



class q1
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