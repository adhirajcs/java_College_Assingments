package assignment4;

/* 3. Write a program that defines a class with one static variable called cnt. Create two or more
objects of the class. The class also contains a method that increments the cnt variable
whenever a new instance of the class is created. Write a driver class to test the above class. */
import java.util.*;

class count {
	// Static variable called cnt
		static int cnt;
		// Constructor
		count() {
			++cnt;
		}
		// Static method to count the number of created objects of the class
		static void obj_count() {
			System.out.println("Object Count: " + cnt);
		}
}

// driver class
public class q3 {
	
	public static void main(String[] args) {
		// Calling the 1st object
		count obj1 = new count();
		count.obj_count();
		// Calling the 2nd object
		count obj2 = new count();
		count.obj_count();
		// Calling the 3rd object
		count obj3 = new count();
		count.obj_count();		
	}
}

/* OUTPUT - 
Object Count: 1
Object Count: 2
Object Count: 3
 */
