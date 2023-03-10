package day3;

import java.util.*;

/*
 4. An educational institution wishes to maintain a database of its employees. The database is
divided into a number of classes whose hierarchical relationships are shown below. Write all
the classes and defines the methods to create the database and retrieve individual information
as and when needed.
Write a driver program to test the classes.
Staff (code, name)
Teacher (subject, publication) is a Staff
Officer (grade) is a Staff
Typist (speed) is a Staff
RegularTypist (remuneration) is a Typist
CasualTypist (daily wages) is a Typist.
 */

// created a class called Media
class Media {
	Scanner sc = q4.sc;
	private String title, Publication;
    // method the take user input
	void getter() {
		System.out.print("Title: ");
		sc.nextLine();
		title = sc.nextLine();
		System.out.print("Publication: ");
		Publication = sc.nextLine();
	}
    // method to display the data
	void setter() {
		System.out.println("\nTitle: " + title);
		System.out.println("Publication: " + Publication);
	}
}

class Book extends Media {
	private int pg;
	private String athr;

	void getter() {
        // using super keyword to call the super class
		super.getter();
		System.out.print("Author: ");
		athr = sc.nextLine();
		System.out.print("No. of pages: ");
		pg = sc.nextInt();
	}

	void setter() {
        // using super keyword to call the super class
		super.setter(); 
		System.out.println("Author: " + athr);
		System.out.println("No. of Pages: " + pg);
	}
}

class Tape extends Media {
	private double tm;
	private String arts;

	void getter() {       
        // using super keyword to call the super class
		super.getter();
		System.out.print("Artist: ");
		arts = sc.nextLine();
		System.out.print("Time: ");
		tm = sc.nextDouble();
	}

	void setter() {
        // using super keyword to call the super class
		super.setter();
		System.out.println("Artist: " + arts);
		System.out.println("Time: " + tm);
	}
}


// driver class
public class q4
{  
  static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int c_bk=0,c_tp=0;
		System.out.println("~!!Welcome to BookShop!!~");
		System.out.println("Choose what to buy: 1. Book 2. Tape 3. Checkout");

		Media m = null;

		while (true) {
			System.out.print("\nChoice: ");
			switch (sc.nextInt()) {
			default:
				System.out.println("Enter correctly!!!");
				m = null;
				break;
			case 1:
				m = new Book();
				c_bk++;
				break;
			case 2:
				m = new Tape();
				c_tp++;
				break;
			case 3:
				System.out.println("Books: "+c_bk);
				System.out.println("Tapes: "+c_tp);
				return;
			}
			
			// calling the methods for the respective object
			if (m != null) {
				m.getter();
				m.setter();
			}
		}
	}
}

/* OUTPUT - 
~!!Welcome to BookShop!!~
Choose what to buy: 1. Book 2. Tape 3. Checkout

Choice: 1
Title: Python
Publication: OXford
Author: A.S.
No. of pages: 100

Title: Python
Publication: OXford
Author: A.S.
No. of Pages: 100

Choice: 2
Title: Something
Publication: Anything
Artist: Anyone
Time: 2

Title: Something
Publication: Anything
Artist: Anyone
Time: 2.0

Choice: 3
Books: 1
Tapes: 1

*/