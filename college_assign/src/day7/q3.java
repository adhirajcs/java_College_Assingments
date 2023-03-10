package day7;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

/* 3. Write a program to sort a list of strings using multithreading. Create one of the
threads that take a string as input from the user, another thread that sorts the
strings and finally another thread that displays the sorted list of strings. Each of
the input, sort, and display methods is to be synchronized. */

class StringSorter {
	private List<String> list;

	public StringSorter() {
		list = new ArrayList<>();
	}

	// synchronized method to add a string to the list
	public synchronized void addString(String s) {
		list.add(s);
	}

	// synchronized method to sort the list of strings
	public synchronized void sortList() {
		Collections.sort(list);
	}

	// synchronized method to display the list of strings
	public synchronized void displayList() {
		for (String s : list) {
			System.out.println(s);
		}
	}
}

// Thread class to add a string to the list
class InputThread extends Thread {
	private StringSorter sorter;
	private String str;

	public InputThread(StringSorter sorter, String str) {
		this.sorter = sorter;
		this.str = str;
	}

	@Override
	public void run() {
		sorter.addString(str);
	}
}

// Thread class to sort the list of strings
class SortThread extends Thread {
	private StringSorter sorter;

	public SortThread(StringSorter sorter) {
		this.sorter = sorter;
	}

	@Override
	public void run() {
		sorter.sortList();
	}
}

// Thread class to display the list of strings
class DisplayThread extends Thread {
	private StringSorter sorter;

	public DisplayThread(StringSorter sorter) {
		this.sorter = sorter;
	}

	@Override
	public void run() {
		sorter.displayList();
	}
}


// Driver class to test the multithreaded string sorter
public class q3 {

	public static void main(String[] args) {
		StringSorter sorter = new StringSorter();

		// create and start the input, sort, and display threads
		InputThread inputThread1 = new InputThread(sorter, "apple");
		InputThread inputThread2 = new InputThread(sorter, "banana");
		InputThread inputThread3 = new InputThread(sorter, "cherry");
		SortThread sortThread = new SortThread(sorter);
		DisplayThread displayThread = new DisplayThread(sorter);

		inputThread1.start();
		inputThread2.start();
		inputThread3.start();
		sortThread.start();
		displayThread.start();
	}
}


/* OUTPUT - 
apple
banana
cherry
 */