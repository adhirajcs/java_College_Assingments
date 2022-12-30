// package no 1
package forQ2Day6_pkg2;
import forQ2Day6_pkg1.c1;

public class c2 {
	// a protected class inside a public class and implementing a interface called c1 from forQ2Day6_pkg1 package
	protected class inclass implements c1{					

		// a public constructor of the inner-class
		public inclass() {									
			
		}
		@Override
		// overriding the method of c1 class from forQ2Day6_pkg1
		public void method1() {									
			
			System.out.println("Inside the method1 method.");
		}

		
	}

}
