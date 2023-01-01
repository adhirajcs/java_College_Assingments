package day2_class_and_object_II;

/* 2. Create two classes DM and DB which store the value of distances. DM stores distances in
meters and centimeters and DB in feet and inches. Write a program that can read values for
the class objects and add one object of DM with another object of DB. Use method to carry
out the addition operation. The object that stores the result may be a DM object or a DB
object, depending on the units in which the results are required. The display should be done
in the format of feet and inches or meters and centimeters depending on the object on
display.  */

import java.util.*;

class dm{
	double m, cm;
	// parameter constructor
	dm(double m, double cm){
		this.m=m;
		this.cm=cm;
	}
	// method to convert
	void convert(db ob) {
		// 1 feet = 0.3048 meter
		// 1 inches = 2.54 centimeter
		this.m += ob.ft*0.3048;
		this.cm = ob.in*2.54;
		double x = this.m - Math.floor(this.m);
		this.cm+=x;
		if(this.cm>100.0) {
			this.m+=(int)this.cm/100;
			this.cm%=100;
		}
	}
}
class db{
	double ft, in;
	// parameterized constructor
	db(double ft, double in){
		this.ft=ft;
		this.in=in;
	}
	// method to convert
	void convert(dm ob) {
		//1 meter = 3.0828 feet
		//1 centimeter = 472.4412 inches
		this.ft += ob.m*3.0828;
		this.in = ob.cm*472.4412;
		double x = this.ft - Math.floor(this.ft);
		this.in+=x;
		if(this.in>12.0) {
			this.ft+=(int)this.in/12;
			this.in%=12.0;
		}
	}
}

// driver class
public class q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// objects created
		dm ob;
		db ob1;
		// Infinite loop
		while(true) {
			System.out.print("Enter 1 to convert meters and centi meters to feet and inches\nEnter 2 to convert feet and inches to meter and centimeter\nEnter any other number to stop: ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1: System.out.print("Enter distance in meter and centimeter: ");
					double m=sc.nextDouble();
					double cm=sc.nextDouble();
					ob = new dm(m,cm);
					ob1 = new db(0.0,0.0);
					ob1.convert(ob);
					System.out.println("Distance: " + ob1.ft + " in feet and " + ob1.in + " in inches ");
					break;
			case 2: System.out.print("Enter the distance in feet and in inches: ");
				double ft=sc.nextDouble();
				double in=sc.nextDouble();
				ob=new dm(0.0, 0.0);
				ob1=new db(ft, in);
				ob.convert(ob1);
				System.out.println("Distance: " + ob.m + " in meters and " + ob.cm + " in centimeters ");
				break;
		default:
			System.out.println("Program ended!!!");
			}
			// terminating the loop
			if(choice != 1 && choice != 2) {
				break;
			}
		}
	}

}

/*OUTPUT - 
Enter 1 to convert meters and centi meters to feet and inches
Enter 2 to convert feet and inches to meter and centimeter
Enter any other number to stop: 1
Enter distance in meter and centimeter: 43
76
Distance: 3124.5604 in feet and 2.091599999999744 in inches 
Enter 1 to convert meters and centi meters to feet and inches
Enter 2 to convert feet and inches to meter and centimeter
Enter any other number to stop: 2
Enter the distance in feet and in inches: 65
432
Distance: 29.812 in meters and 98.09199999999987 in centimeters 
Enter 1 to convert meters and centi meters to feet and inches
Enter 2 to convert feet and inches to meter and centimeter
Enter any other number to stop: 65
Program ended!!!
*/
