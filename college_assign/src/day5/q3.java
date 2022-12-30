package day5;

import java.util.*;

/*
3. Write a program to create a class named Vehicle having protected instance variables
regnNumber, speed, color, ownerName and a method showData ( ) to show “This is a vehicle
class”. Inherit the Vehicle class into subclasses named Bus and Car having individual private
instance variables routeNumber in Bus and manufacturerName in Car and both of them
having showData ( ) method showing all details of Bus and Car respectively with content of
the super class’s showData ( ) method.
 */

// creating a class called Vehicle
class Vehicle {
	static Scanner sc = new Scanner(System.in);
	private String regnNumber, color, ownerName;
	private double speed;
	// method to get all the data as user input
	void seta() {
		System.out.print("Registration no.: ");
		regnNumber = sc.next();
		System.out.print("Speed: ");
		speed = sc.nextDouble();
		System.out.print("Color: ");
		color = sc.next();
		System.out.print("Owner name: ");
		ownerName = sc.next();
	}
	// displaying all the data using showData() method
	void showData() {
		System.out.println("This is a vehicle class: ");
		System.out.println("Registration no.: " + regnNumber);
		System.out.println("Speed: " + speed);
		System.out.println("Color: " + color);
		System.out.println("Owner name: " + ownerName);
	}
}
// creating a class called Bus which is inheriting Vehicle Class
class Bus extends Vehicle {
	private String route;
	// method to get all the data as user input
	void seta() {
        // using super keyword to call the super class
		super.seta(); 		
		System.out.print("Route no.: ");
		route = sc.next();
	}
	// displaying all the data using showData() method
	void showData() {
        // using super keyword to call the super class
		super.showData();
		System.out.println("This is a bus class: ");
		System.out.println("Route no.: " + route);
	}
}
// creating a class called Car which is inheriting Vehicle Class
class Car extends Vehicle {
	private String manufacturerName;
	//method to get all the data as user input
	void seta() {
        // using super keyword to call the super class
		super.seta();
		System.out.print("Manufacturer name: ");
		manufacturerName = sc.next();
	}
	// displaying all the data using showData() method
	void showData() {
        //using super keyword to call the super class
		super.showData();	
		System.out.println("This is car class: ");
		System.out.println("Manufacturer name: " + manufacturerName);
	}
}
class q3
{  
  public static void main(String[] args) {
        //defining a object for the Vehicle class
		Vehicle vehicle;	
		
		System.out.println("Bus: ");
		vehicle = new Bus();
		vehicle.seta();
		vehicle.showData();


		System.out.println("Car: ");
		vehicle = new Car();
		vehicle.seta();
		vehicle.showData();
	}
}