package day2_class_and_object_II;

/* 4. Create a class with a private field and a private method. Create an inner class with a method
that modifies the outer class field and calls the outer class method. In a second outer class
method, create an object of the inner class and call it’s method, then show the effect on the
outer class object. */

// outer class
class prvt {
	
	// private field
	private int field = 20;
	
	// private method
	private void prvt_method() {
		System.out.println("Field: " + field);
	}
	
	// inner class
	class inner_class {
		
		// method that modifies the outer class field and calls the outer class method
		void modify() {
			prvt o1 = new prvt();
			o1.field = 21;
			o1.prvt_method();
		}
	}
	
	// created an object of the inner class and calling it’s method
	void get_method() {
		inner_class o2 = new inner_class();
		o2.modify();
	}
}

// driver class
public class q4 {
	public static void main(String[] args) {
		prvt o3 = new prvt();
		o3.get_method();
		
	}

}

/*OUTPUT - 
Field: 21
*/
