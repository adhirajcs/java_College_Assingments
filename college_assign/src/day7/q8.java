package day7;

/* 8. Write a program, which will create a deadlock. */

// thr1 named class is inheriting Thread class
class thr1 extends Thread{
	String resrc1,resrc2;
	thr1(String st1,String st2){
		resrc1 = st1;
		resrc2 = st2;
	}
	public void run() {
		synchronized (resrc1){
			System.out.println("Thread 1 -> Resource 1 Not Available!!!");
			// try catch block
			try {
				// calling the sleep() method of the Thread class
				Thread.sleep(100);
			} 
			catch (Exception e) {
				// calling printStackTrace() method of Throwable class
				e.printStackTrace();
			}  
			synchronized (resrc2) {  
				System.out.println("Thread 1 -> Resource 2 Not Available!!!");  
			}
		}
	}
}

//thr2 named class is inheriting Thread class
class thr2 extends Thread{
	String resrc1,resrc2;
	thr2(String st1,String st2){
		resrc1 = st1;
		resrc2 = st2;
	}
	public void run() {
		synchronized (resrc2){
			System.out.println("Thread 2 -> Resource 2 Not Available!!!");
			// try catch block
			try {
				// calling the sleep() method of the Thread class
				Thread.sleep(100);
			} 
			catch (Exception e) {
				// calling printStackTrace() method of Throwable class
				e.printStackTrace();
			}  
			synchronized (resrc1) {  
				System.out.println("Thread 2 -> Resource 1 Not Available!!!");  
			}
		}
	}
}

// driver class
public class q8 {

	public static void main(String[] args) {
		// The resources
		final String resrc1 = "fjfjs";
		final String resrc2 = "jfsdidsa";
		// tobj1 tries to lock resrc1 then resrc2  
		thr1 tobj1 = new thr1(resrc1,resrc2);
		// tobj2 tries to lock resrc2 then resrc1  
		thr2 tobj2 = new thr2(resrc1,resrc2);
		tobj1.start();
		tobj2.start();  
	}

}

/* OUTPUT -
Thread 1 -> Resource 1 Not Available!!!
Thread 2 -> Resource 2 Not Available!!!
 */
