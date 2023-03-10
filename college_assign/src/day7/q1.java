package day7;

/* 1. Write a Java program that illustrates the use of the yield( ), start( ),stop( ),run ( ),
sleep( ), wait( ) and isAlive( ) methods. */


// thread_1 named class is inheriting Thread class
class thread_1 extends Thread{

	// overriding the run() method from Thread class
	@Override
	public void run() {
		int i=0;
		while(i<100) {
			// try block to check for exception
			try {
				// calling sleep() method from thread class
				Thread.sleep(50);
			} 
			// catch block to catch the exception
			catch (InterruptedException e) {
				// using the printStackTrace() from Throwable class
				e.printStackTrace();
			}
			System.out.println("inner run method of thread 1");
			i++;
		}
	}
}
// thread_2 named class is inheriting the Thread class
class thread_2 extends Thread{

	// overriding the run() method from Thread class
	@Override
	public void run() {
		int i=0;
		while(i<50) {
			// calling yield() method from thread class
			Thread.yield();
			System.out.println("inner run method of thread 2");
			i++;
		}
	}
}

class thread_3 extends Thread{

	// overriding the run() method from Thread class
	@Override
	public void run() {
		int i=0;
		while(i<400) {
			System.out.println("inner run method of thread 3");
			i++;
		}
	}
}

// driver class
public class q1 {

	public static void main(String[] args) throws InterruptedException {
		thread_1 t1 = new thread_1();
		thread_2 t2 = new thread_2();
		thread_3 t3 = new thread_3();
		// using the start() method for the 3 threads
		t1.start();
		t2.start();
		t3.start();

		for(int i=0;i<15;i++) {
			// here using the isAlive() method for the 3 threads
			if(t1.isAlive()) {
				System.out.println("Thread 1 is in a "+t1.getState()+" state and is active!");
			}
			if(t2.isAlive()) {
				System.out.println("Thread 2 is in a "+t2.getState()+" state and is active!");
			}
			if(t3.isAlive()) {
				System.out.println("Thread 3 is in a "+t3.getState()+" state and is active!");
				if(i==1) {
					synchronized(t3) {
						// using the wait() method
						t3.wait();
						System.out.println("Thread 3 is in waiting state");
					}
				}
				if(i==3) {
					// using the sleep() method
					t3.stop();
					System.out.println("Thread 3 has been stopped!!!");
				}
			}
		}
	}
}

/* OUTPUT -
Thread 1 is in a RUNNABLE state and is active!
Thread 2 is in a RUNNABLE state and is active!
Thread 3 is in a RUNNABLE state and is active!
Thread 1 is in a RUNNABLE state and is active!
Thread 2 is in a RUNNABLE state and is active!
Thread 3 is in a RUNNABLE state and is active!
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 2
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 2
inner run method of thread 3
inner run method of thread 2
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 2
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 2
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 2
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 2
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 2
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 1
inner run method of thread 3
inner run method of thread 2
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 2
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
inner run method of thread 3
Thread 3 is in waiting state
Thread 1 is in a TIMED_WAITING state and is active!
Thread 2 is in a RUNNABLE state and is active!
Thread 1 is in a TIMED_WAITING state and is active!
Thread 2 is in a RUNNABLE state and is active!
Thread 1 is in a TIMED_WAITING state and is active!
Thread 2 is in a RUNNABLE state and is active!
Thread 1 is in a TIMED_WAITING state and is active!
Thread 2 is in a RUNNABLE state and is active!
Thread 1 is in a TIMED_WAITING state and is active!
Thread 2 is in a RUNNABLE state and is active!
Thread 1 is in a TIMED_WAITING state and is active!
Thread 2 is in a RUNNABLE state and is active!
Thread 1 is in a TIMED_WAITING state and is active!
Thread 2 is in a RUNNABLE state and is active!
Thread 1 is in a TIMED_WAITING state and is active!
Thread 2 is in a RUNNABLE state and is active!
Thread 1 is in a TIMED_WAITING state and is active!
Thread 2 is in a RUNNABLE state and is active!
Thread 1 is in a TIMED_WAITING state and is active!
Thread 2 is in a RUNNABLE state and is active!
Thread 1 is in a TIMED_WAITING state and is active!
Thread 2 is in a RUNNABLE state and is active!
Thread 1 is in a TIMED_WAITING state and is active!
Thread 2 is in a RUNNABLE state and is active!
Thread 1 is in a TIMED_WAITING state and is active!
Thread 2 is in a RUNNABLE state and is active!
inner run method of thread 1
inner run method of thread 2
inner run method of thread 2
inner run method of thread 2
inner run method of thread 2
inner run method of thread 2
inner run method of thread 2
inner run method of thread 2
inner run method of thread 2
inner run method of thread 2
inner run method of thread 2
inner run method of thread 2
inner run method of thread 2
inner run method of thread 2
inner run method of thread 2
inner run method of thread 2
inner run method of thread 2
inner run method of thread 2
inner run method of thread 2
inner run method of thread 2
inner run method of thread 2
inner run method of thread 2
inner run method of thread 2
inner run method of thread 2
inner run method of thread 2
inner run method of thread 2
inner run method of thread 2
inner run method of thread 2
inner run method of thread 2
inner run method of thread 2
inner run method of thread 2
inner run method of thread 2
inner run method of thread 2
inner run method of thread 2
inner run method of thread 2
inner run method of thread 2
inner run method of thread 2
inner run method of thread 2
inner run method of thread 2
inner run method of thread 2
inner run method of thread 2
inner run method of thread 1
inner run method of thread 1
inner run method of thread 1
inner run method of thread 1
inner run method of thread 1
inner run method of thread 1
inner run method of thread 1
inner run method of thread 1
inner run method of thread 1
inner run method of thread 1
inner run method of thread 1
inner run method of thread 1
inner run method of thread 1
inner run method of thread 1
inner run method of thread 1
inner run method of thread 1
inner run method of thread 1
inner run method of thread 1
inner run method of thread 1
inner run method of thread 1
inner run method of thread 1
inner run method of thread 1
inner run method of thread 1
inner run method of thread 1
inner run method of thread 1
inner run method of thread 1
inner run method of thread 1
inner run method of thread 1
inner run method of thread 1
inner run method of thread 1
inner run method of thread 1
inner run method of thread 1
inner run method of thread 1
inner run method of thread 1
inner run method of thread 1
inner run method of thread 1
inner run method of thread 1
inner run method of thread 1
inner run method of thread 1
inner run method of thread 1
inner run method of thread 1
inner run method of thread 1
inner run method of thread 1
inner run method of thread 1
inner run method of thread 1
inner run method of thread 1
inner run method of thread 1
inner run method of thread 1
inner run method of thread 1
inner run method of thread 1
inner run method of thread 1
inner run method of thread 1
inner run method of thread 1
inner run method of thread 1
inner run method of thread 1
inner run method of thread 1
inner run method of thread 1
inner run method of thread 1
inner run method of thread 1
inner run method of thread 1
inner run method of thread 1
inner run method of thread 1
inner run method of thread 1
inner run method of thread 1
inner run method of thread 1
inner run method of thread 1
inner run method of thread 1
inner run method of thread 1
inner run method of thread 1
inner run method of thread 1
inner run method of thread 1
inner run method of thread 1
inner run method of thread 1
inner run method of thread 1
inner run method of thread 1
inner run method of thread 1
inner run method of thread 1
inner run method of thread 1
inner run method of thread 1
inner run method of thread 1
inner run method of thread 1
inner run method of thread 1
inner run method of thread 1
inner run method of thread 1
inner run method of thread 1
inner run method of thread 1
inner run method of thread 1
inner run method of thread 1
inner run method of thread 1
inner run method of thread 1
inner run method of thread 1
inner run method of thread 1
inner run method of thread 1
inner run method of thread 1
inner run method of thread 1
inner run method of thread 1
inner run method of thread 1
inner run method of thread 1

 */
