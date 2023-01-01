package day4;

/* 3. Create a private inner class that implements a public interface. Write a method that
returns a reference to an instance of the private inner class, up cast to the interface. Show
that the inner class is completely hidden by trying to downcast to it. */

class newclass{
	// a private class inside a public class and is implementing the publicInterface named interface
	private class innerclass implements publicInterface{		
		
		@Override
		public void method1() {
			System.out.println("Inside the inner-class private class inside a public class and is implementing the publicInterface named interface");
		}

	}
	// a method of the publicInterface
	publicInterface newMethod() {								
		return new innerclass();								
		
	}
}

public class q3 {
	public static void main(String[] args) {
			newclass obj = new newclass();
			obj.newMethod().method1();								

}

}

/* OUTPUT - 
Inside the inner-class private class inside a public class and is implementing the publicInterface named interface
*/