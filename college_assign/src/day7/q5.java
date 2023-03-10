package day7;

/* 5. Create two Thread subclasses, one with a run( ) that starts up, captures the
reference of the second Thread object and then calls wait( ). The other class’
run( ) should call notifyAll( ) for the first thread after some number of seconds
have passed, so the first thread can print a message. */

// thread1 named class is inheriting Thread class
class Thread1 extends Thread {
	private Thread2 thread2;

	public Thread1(Thread2 thread2) {
		this.thread2 = thread2;
	}

	@Override
	public void run() {
		System.out.println("Thread1 starting up");
		synchronized (thread2) {
			try {
				// waiting for Thread2 to call notifyAll
				thread2.wait();
			} catch (InterruptedException e) {
				// calling printStackTrace() method of the Throwable class
				e.printStackTrace();
			}
		}
		System.out.println("Thread1 received notification");
		System.out.println("Thread1 finished");
	}
}

//thread2 named class is inheriting Thread class
class Thread2 extends Thread {
	private int delay;

	public Thread2(int delay) {
		this.delay = delay;
	}

	@Override
	public void run() {
		System.out.println("Thread2 starting up");
		try {
			// sleep for 5 seconds
			Thread.sleep(delay * 1000);
		} catch (InterruptedException e) {
			// calling printStackTrace() method of the Throwable class
			e.printStackTrace();
		}
		System.out.println("notify Thread1 to continue execution");
		synchronized (this) {
			// notify Thread1 to continue execution
			notifyAll();
		}
		System.out.println("Thread2 finished");
	}
}

//driver class
public class q5 {

	public static void main(String[] args) {
		Thread2 thread2 = new Thread2(5);
		Thread1 thread1 = new Thread1(thread2);
		// starting thread1 and thread2
		thread1.start();
		thread2.start();

	}
}


/* OUTPUT -
Thread1 starting up
Thread2 starting up
notify Thread1 to continue execution
Thread1 received notification
Thread1 finished
Thread2 finished
 */
