package day5;


/*
2. Create a general class ThreeDObject and derive the classes Box, Cube, Cylinder and Cone
from it. The class ThreeDObject has methods wholeSurfaceArea ( ) and volume ( ). Override
these two methods in each of the derived classes to calculate the volume and whole surface
area of each type of three-dimensional objects. The dimensions of the objects are to be taken
from the users and passed through the respective constructors of each derived class. Write a
main method to test these classes.
 */


import java.util.Scanner;

abstract class threeDimObject {
    // Whole Surface area
	abstract double wSA();

	abstract double volume();
}
// class for calculating volume and whole surface area for Box
class Box extends threeDimObject {
	int l, w, h;

	Box(int l, int w, int h) {
		this.l = l;
		this.w = w;
		this.h = h;
	}

	double wSA() {
		return 2 * (l * w + l * h + w * h);
	}

	double volume() {
		return l * w * h;
	}
}
// class for calculating volume and whole surface area for Cube
class Cube extends threeDimObject {
	int side;

	Cube(int side) {
		this.side = side;
	}

	double wSA() {
		return 6 * side * side;
	}

	double volume() {
		return side * side * side;
	}
}
// class for calculating volume and whole surface area for Cylinder
class Cylinder extends threeDimObject {
	int r, h;

	Cylinder(int r, int h) {
		this.r = r;
		this.h = h;
	}

	double wSA() {
		return 2 * Math.PI * r * h + 2 * Math.PI * r * r;
	}

	double volume() {
		return Math.PI * r * r * h;
	}
}
// class for calculating volume and whole surface area for Cone
class Cone extends threeDimObject {
	int r, h;

	Cone(int r, int h) {
		this.r = r;
		this.h = h;
	}

	double wSA() {
		return Math.PI * r * (r + Math.sqrt(h * h + r * r));
	}

	double volume() {
		return Math.PI * r * r * (h / 3);
	}
}
class q2
{  
  static Scanner sc = new Scanner(System.in);
    // Creating a object for box class
	static Box box() {
		System.out.print("Enter the Length, Width and Height: ");
		return new Box(sc.nextInt(), sc.nextInt(), sc.nextInt());
	}
    // creating a object for cube class
	static Cube cube() {
		System.out.print("Enter side: ");
		return new Cube(sc.nextInt());
	}
    // creating a object for cylinder class
	static Cylinder cylinder() {
		System.out.print("Enter the Radius and Height: ");
		return new Cylinder(sc.nextInt(), sc.nextInt());
	}
    // creating a object for cone class
	static Cone cone() {
		System.out.print("Enter the Radius and Height: ");
		return new Cone(sc.nextInt(), sc.nextInt());
	}
    // main function
	public static void main(String[] args) {
		threeDimObject tobj = null;
		while (true) {
            System.out.println("1. Box\n2. Cube\n3. Cylinder\n4. Cone\n5. Exit");
			System.out.print("Enter choice: ");
			switch (sc.nextInt()) {
			default:
				System.out.println("Enter correctly!!!");
				tobj=null;
				break;
			case 1:
				tobj = box();
				break;
			case 2:
				tobj = cube();
				break;
			case 3:
				tobj = cylinder();
				break;
			case 4:
				tobj = cone();
				break;
			case 5:
				return;
			}
			
			// calling method for the respective object
			if (tobj != null) {
				System.out.println("Surface area: " + tobj.wSA());
				System.out.println("Volume: " + tobj.volume());
			}
		}
	}
}