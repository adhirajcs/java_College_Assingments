// package no 2
package forDay4_q2_pkg2;
import forDay4_q2_pkg1.c1;

public class c2 {
	// a protected class inside a public class and implementing a interface called c1 from forDay4_q2_pkg1 package
	protected class inclass implements c1{					

		// a public constructor of the inner-class
		public inclass() {									
			
		}
		@Override
		// overriding the method of c1 class from forDay4_q2_pkg1
		public void method1() {									
			
			System.out.println("Inside the method1 method.");
		}

		
	}

}
