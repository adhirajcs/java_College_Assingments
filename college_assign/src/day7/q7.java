package day7;
import java.util.*;

/* 7. Define the classes for implementing “t1” and “t2”. Write appropriate methods for
accomplishing the above. */

class Th1 {
	// instance variables
	private int x;
	private int y;

	// constructor
	public Th1(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	// method for adding x and y
	public int add() {
		return x + y;
	}

	// method for subtracting y from x
	public int subtract() {
		return x - y;
	}
}

class Th2 {
	// instance variable
	private Th1 t1;

	// constructor
	public Th2(Th1 t1) {
		this.t1 = t1;
	}

	// method for multiplying the values of x and y in t1
	public int multiply() {
		return t1.getX() * t1.getY();
	}

	// method for dividing the value of x in t1 by the value of y in t1
	public int divide() {
		return t1.getX() / t1.getY();
	}
}

// driver class
public class q7 {

	public static void main(String[] args) {
		// implementing t1 and t2 threads
		Th1 t1 = new Th1(10, 5);
		Th2 t2 = new Th2(t1);

		int sum = t1.add();
		int difference = t1.subtract();
		int product = t2.multiply();
		int quotient = t2.divide();

		System.out.print(sum);
		System.out.print("\n");
		System.out.print(difference);
		System.out.print("\n");
		System.out.print(product);
		System.out.print("\n");
		System.out.print(quotient);
	}
}

/* OUTPUT -
15
5
50
2
 */
