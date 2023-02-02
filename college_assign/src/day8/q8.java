package day8;


/*
 * 8. Write a program to create a thread using a lambda expression.
 */

public class q8 {
	public static void main(String[] args) {
		new Thread(() -> {
			for (int i = 1; i <= 5; i++) {
				System.out.println(i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					System.out.println(e);
				}
			}
		}).start(); // a thread printing from 1 to 5 at an interval of 1s
	}
}


/*OUTPUT - 
1
2
3
4
5
*/