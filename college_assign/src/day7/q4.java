package day7;

/* 4. Inherit a class from Thread and override the run( ) method. Inside run( ), print a
message, and then call sleep( ). Repeat this three times, then return from run( ).
Put a start-up message in the constructor and override finalize( ) to print a shut-
down message. Make a separate thread class that calls System.gc( ) and
System.runFinalization( ) inside run( ), printing a message as it does so. Make
several thread objects of both types and run them to see what happens. */


class MyThread extends Thread {
	public MyThread() {
		// start-up message
		System.out.println("MyThread starting up");
	}

	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println("MyThread running");
			try {
				// sleep for 1 second
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// do nothing
			}
		}
	}

	@Override
	protected void finalize() throws Throwable {
		// shut-down message
		System.out.println("MyThread shutting down");
		super.finalize();
	}
}

class GCThread extends Thread {
	@Override
	public void run() {
		System.out.println("GCThread running");
		System.gc();
		System.runFinalization();
	}
}

public class q4 {

	public static void main(String[] args) {
		// creating and starting 3 MyThread objects
		MyThread thread1 = new MyThread();
		MyThread thread2 = new MyThread();
		MyThread thread3 = new MyThread();
		thread1.start();
		thread2.start();
		thread3.start();

		// creating and starting 3 GCThread objects
		GCThread gcThread1 = new GCThread();
		GCThread gcThread2 = new GCThread();
		GCThread gcThread3 = new GCThread();
		gcThread1.start();
		gcThread2.start();
		gcThread3.start();

	}

}

/* OUPUT - 
MyThread starting up
MyThread starting up
MyThread starting up
MyThread running
MyThread running
MyThread running
GCThread running
GCThread running
GCThread running
MyThread running
MyThread running
MyThread running
MyThread running
MyThread running
MyThread running
 */
