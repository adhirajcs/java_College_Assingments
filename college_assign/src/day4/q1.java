package day4;
import java.util.*;

/* 1. Create three interfaces, each with two methods. Inherit a new interface from the three,
adding a new method. Create a class by implementing the new interface and also
inheriting from a concrete class. Now write four methods, each of which takes one of the
four interfaces as an argument. In main( ), create an object of your class and pass it to
each of the methods. */

// interface 1 with two methods
interface A{																
	void m1();
	void m2();
}
// interface 2 with two methods
interface B{																
	void m3();
	void m4();
}
// interface 3 with two methods
interface C{																
	void m5();
	void m6();
}
// interface 4 which inherits the above 3 interfaces
interface D extends A,B,C{													 
	void m7();
}

// the concreate class
class concrete{																
	void method(){
		System.out.println("Inside concrete class");
	}
}
// class called E inheriting the concreate class and implementing the 4th interface i.e. D
class E extends concrete implements D {										
	
	// below are the four methods which are taking one of the four interfaces as an argument
	@Override
	public void m1() {}

	@Override
	public void m2() {}

	@Override
	public void m3() {}

	@Override
	public void m4() {}
	
	@Override
	public void m5() {}
	
	@Override
	public void m6() {}

	@Override
	public void m7() {}
	
}
// driver class
public class q1 {

		public static void m1(A obj1) {
			obj1.m1();
			obj1.m2();
		}

		public static void m2(B obj2) {
			obj2.m3();
			obj2.m4();
		}
		
		public static void m3(C obj3) {
			obj3.m5();
			obj3.m6();
		}
		
		public static void m4(D obj4) {
			obj4.m7();
		}
		public static void main(String[] args) {
			E obj5 = new E();
			m1(obj5);
			m2(obj5);
			m3(obj5);
			m4(obj5);
		}
}
