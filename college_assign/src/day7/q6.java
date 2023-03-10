package day7;

/* 6. Suppose that two threads “t1” and “t2” access a shared integer “x”. Thread “t1”
indefinitely increases “x” and “t2” indefinitely prints the value of “x”. That is the
threads run in an infinite loop. However, thread “t1” must not increase “x” till that
value of “x” is printed by “t2” and “t2” must not print the same value of “x” more
than once. */

class t1 extends Thread {
	private int x;

	public t1(int x) {
		this.x = x;
	}

	@Override
	public void run() {
		while (true) {
			// increment x
			x++;
			System.out.println("t1: x = " + x);
			try {
				// sleep for 1 second
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// do nothing
			}
		}
	}
}

class t2 extends Thread {
	private int x;

	public t2(int x) {
		this.x = x;
	}

	@Override
	public void run() {
		int previous = x;
		while (true) {
			if (x != previous) {
				// print x if it has changed
				System.out.println("t2: x = " + x);
				previous = x;
			}
		}
	}
}

public class q6 {

	public static void main(String[] args) {
		int x = 0;
		t1 t1 = new t1(x);
		t2 t2 = new t2(x);
		t1.start();
		t2.start();
	}
}

/* OUTPUT -
t1: x = 1
t1: x = 2
t1: x = 3
t1: x = 4
t1: x = 5
t1: x = 6
t1: x = 7
t1: x = 8
t1: x = 9
t1: x = 10
t1: x = 11
t1: x = 12
t1: x = 13
t1: x = 14
t1: x = 15
t1: x = 16
t1: x = 17
t1: x = 18
t1: x = 19
t1: x = 20
t1: x = 21
t1: x = 22
t1: x = 23
t1: x = 24
t1: x = 25
t1: x = 26
t1: x = 27
t1: x = 28
t1: x = 29
t1: x = 30
t1: x = 31
t1: x = 32
t1: x = 33
t1: x = 34
t1: x = 35
t1: x = 36
t1: x = 37
t1: x = 38
t1: x = 39
t1: x = 40
t1: x = 41
t1: x = 42
t1: x = 43
t1: x = 44
t1: x = 45
t1: x = 46
t1: x = 47
t1: x = 48
t1: x = 49
t1: x = 50
t1: x = 51
t1: x = 52
t1: x = 53
t1: x = 54
t1: x = 55
t1: x = 56
t1: x = 57
t1: x = 58
t1: x = 59
t1: x = 60
t1: x = 61
t1: x = 62
t1: x = 63
t1: x = 64
t1: x = 65
t1: x = 66
t1: x = 67
t1: x = 68
t1: x = 69
t1: x = 70
t1: x = 71
t1: x = 72
t1: x = 73
t1: x = 74
t1: x = 75
t1: x = 76
t1: x = 77
t1: x = 78
t1: x = 79
t1: x = 80
t1: x = 81
t1: x = 82
t1: x = 83
t1: x = 84
t1: x = 85
t1: x = 86
t1: x = 87
t1: x = 88
t1: x = 89
t1: x = 90
 */