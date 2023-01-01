package day2_class_and_object_II;

/* 1. Create a class called Time that has separate data member for hours, minutes and seconds.
Define member functions to perform the following tasks:
to display the time in the format hh: mm: ss.
to add times passed as arguments.
to check which among two times passed as arguments is greater.
Write a program to test the class and its functions. Use constructor to initialize the instance
variables of the class Time.
 */

import java.util.*;
// Class called Time
class Time {
	int h,m,s;
	// Constructor
	Time() {
		h=0;
		m=0;
		s=0;
	}
	// addTime method
	void addTime (int hours, int minutes, int seconds) {
		h = hours;
		m = minutes;
		s = seconds;
	}
	// Display method
	void display () {
		System.out.println(h + ":" + m + ":" + s);
	}
}
public class q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Time obj1 = new Time();
		Time obj2 = new Time();
		// taking user input for the 1st set of time
		System.out.println("Enter time in the correct format i.e. hh: mm: ss");
		System.out.print("Enter the 1st set of time: ");
		obj1.h = sc.nextInt();
		obj1.m = sc.nextInt();
		obj1.s = sc.nextInt();
		obj1.addTime(obj1.h, obj1.m, obj1.s);
		
		// taking user input for the 1st set of time
		System.out.print("Enter the 2nd set of time: ");
		obj2.h = sc.nextInt();
		obj2.m = sc.nextInt();
		obj2.s = sc.nextInt();
		obj2.addTime(obj2.h, obj2.m, obj2.s);
		
		// displaying both the timings
		obj1.display();
		obj2.display();
		
		// nested if else-if for the comparison to get the greater time between them
		if(obj1.h == obj2.h) {
			if(obj1.m == obj2.m) {
				if(obj1.s == obj2.s) {
					
					System.out.println("Both the Timings are Equal!!!");
					obj1.display();
				}
				else if(obj1.s > obj2.s) {
					System.out.println("The time that is greater than the other is ");
					obj1.display();
				}
				else if(obj1.s < obj2.s) {
					System.out.println("The time that is greater than the other is ");
					obj2.display();
				}
			}
			else if(obj1.m > obj2.m) {
				System.out.println("The time that is greater than the other is ");
				obj1.display();
			}
			else if(obj1.m < obj2.m) {
				System.out.println("The time that is greater than the other is ");
				obj2.display();
			}
		}
		else if(obj1.h > obj2.h) {
				System.out.println("The time that is greater than the other is ");
				obj1.display();
			}
		else if(obj1.h < obj2.h){
			System.out.println("The time that is greater than the other is ");
			obj2.display();
		}

	}
}

/*OUTPUT -
Enter time in the correct format i.e. hh: mm: ss
Enter the 1st set of time: 4
18
22
Enter the 2nd set of time: 4
20
12
4:18:22
4:20:12
The time that is greater than the other is 
4:20:12
 */
