package day2_class_and_object_I;

/* 2. Create a class Queue to implement queue data structure with constructors. Define suitable
methods for insertion & deletion of elements to & from the queue. Write a program for this,
clearly specifying the overflow & underflow conditions. */

import java.util.*;

// Creating a class called stack for push, pop, display methods
class Queue{
	// Initializing the array
	int arr[];
	int front,rear;
	// Creating the Constructor
	Queue(int size){
		arr = new int[size];
		front=-1;
		rear =-1;
	}
	// Creating the Insertion method
	void insert(int value,int size) {
		if(front==0 && rear==size-1) {
			// This if part will be printed if the queue is overflowed
			System.out.println("The Queue is Overflowed!!!");	
		}
		else {
			if(front==-1) {
				front=0;
			}
			rear++;
			arr[rear]=value;
			System.out.println("Data Inserted Successfully!");
		}
	}
	// Creating the Deletion method
	void delete() {
		if(rear == front-1) {
			// This if part will be printed if the queue is underflowed
			System.out.println("The Queue is Underflowed!!!");
		}
		else {
			if(front>=rear) {
				front=-1;
				rear=-1;
			}
			front++;
			System.out.println("Data Deleted Successfully!");
		}
	}
	// Creating the Display method
	void display() {
		System.out.print("The elements in the stack are: ");
		for(int i = front;i<=rear;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}


public class q2 {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			// Taking input from the user for the size of the Queue
			System.out.print("Enter the desired size of the Queue: ");
			int size = sc.nextInt();
			Queue queue = new Queue(size);
			while(true) {
				// Creating a menu for the user using switch case
		        System.out.print("\nPress 1 to Insert,\nPress 2 to Remove,\nPress 3 to Display, or\nPress 4 to Exit: ");         
		        int choice = sc.nextInt();
		        switch(choice) {
		        case 1:
		        	System.out.print("Enter the value: ");
		        	int value = sc.nextInt();
		        	queue.insert(value, size);
		        	break;
		        case 2:
		        	queue.delete();
		        	break;
		        case 3:
		        	queue.display();
		        	break;
		        case 4:
		        	System.exit(0);
		        	break;
		        default:
		        	System.out.println("WRONG INPUT!!! Please enter a Valid Option!");
		        }
		}
	}
}

/*OUTPUT -
 Enter the desired size of the Queue: 2

Press 1 to Insert,
Press 2 to Remove,
Press 3 to Display, or
Press 4 to Exit: 1
Enter the value: 54
Data Inserted Successfully!

Press 1 to Insert,
Press 2 to Remove,
Press 3 to Display, or
Press 4 to Exit: 1
Enter the value: 32
Data Inserted Successfully!

Press 1 to Insert,
Press 2 to Remove,
Press 3 to Display, or
Press 4 to Exit: 1
Enter the value: 54
The Queue is Overflowed!!!

Press 1 to Insert,
Press 2 to Remove,
Press 3 to Display, or
Press 4 to Exit: 2
Data Deleted Successfully!

Press 1 to Insert,
Press 2 to Remove,
Press 3 to Display, or
Press 4 to Exit: 2
Data Deleted Successfully!

Press 1 to Insert,
Press 2 to Remove,
Press 3 to Display, or
Press 4 to Exit: 2
The Queue is Underflowed!!!

Press 1 to Insert,
Press 2 to Remove,
Press 3 to Display, or
Press 4 to Exit:  */