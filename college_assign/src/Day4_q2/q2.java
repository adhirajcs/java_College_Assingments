
/* 2. Create an interface with at least one method, in its own package. Create a class in a
separate package. Add a protected inner class that implements the interface. In a third
package, inherit from your class and, inside a method, return an object of the protected
inner class, up casting to the interface during the return. */

//3rd and main package
package Day4_q2;
import forDay4_q2_pkg1.c1;
import forDay4_q2_pkg2.c2;								

// class a2 inheriting the c2 class from forDay4_q2_pkg2
class q2 extends c2{						
	public c1 method1(){									
		inclass cl = new inclass();				
		return (c1) cl;									
		
	}
	//main method
	public static void main(String args[]) {
		q2 m = new q2();					
		System.out.println("The Result is:-"+m.method1());
	}
	

}
/* OUTPUT - 
The Result is:-forDay4_q2_pkg2.c2$inclass@66048bfd
*/