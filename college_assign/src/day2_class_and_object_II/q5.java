package day2_class_and_object_II;

/* 5. Create a class containing an inner class that itself contains an inner class. Repeat this using
static inner class. What are the names of the .class files produced by the compiler? */

// outer class
class outer_class {
	
	// inner class
	class inner_class{
		// method of the inner class
		void get_method() {
			System.out.println("This is the inner class!!!");
			// Accessing the method of innermost class from the inner class:
			innermost_class.get_method();
		}
		// the inner most class
		static class innermost_class{
			// method of the innermost class
			static void get_method() {
				System.out.println("This is the inner-most class!!!");
			}			
		}
	}
	// method of the outer class
	void get_method() {
		System.out.println("This is the Outer Class!!!");
		inner_class obji = new inner_class();
		obji.get_method();
		// Accessing the method of the  inner most class from the outer class
		inner_class.innermost_class.get_method();
	}
}

// driver class
public class q5 {
	public static void main(String[] args) {
		// Accessing the method of the outer class from the driver class
		outer_class obj = new outer_class();
		obj.get_method();
	}
}

/* OUTPUT - 
This is the Outer Class!!!
This is the inner class!!!
This is the inner-most class!!!
This is the inner-most class!!! */
