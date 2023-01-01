package day2_class_and_object_I;

/* 1. Create a class Stack that declares a stack and the methods to perform push ( ), pop ( ) and
display( ) operations on the stack. Create two stacks and write a menu-driven program to
perform operations on the two stacks. Whenever the number of elements in the two stacks
becomes equal, a message should automatically be generated displaying the number of elements
in each stack. */

import java.util.*;

// Creating a class called stack for push, pop, display methods
class Stack{
	int top;
	// Initializing the array
	int arr[];
	// Creating the Constructor
	Stack(int size){
		arr = new int[size];
		top=-1;
	}
	// Creating the push method
	void push(int value,int size) {
		if(top==size-1) {
			System.out.println("Stack is Overflowed!!!");
		}
		else {
			top++;
			arr[top]=value;
			
		}
	}
	// Creating the pop method
	void pop() {
		if(top==-1) {
			System.out.println("Stack is Underflowed!!!");
		}
		else {
			top--;
		}
	}
	// Creating the display method
	void display() {
		System.out.print("\nThe elements in the respective stack are: ");
		for(int i = top;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
	}

	
}
// Creating a class called StackCount to count the current number of element in both the arrays
class StackCount{
	boolean display(Stack s1, Stack s2,int size) {
		if(s1.top>-1 && s2.top >-1 && s1.top == s2.top) {
			return true;
		}
		return false;
	}
}

public class q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Taking input from the user for the size of the stack
		System.out.print("Enter the size of the stack: ");
		int size = sc.nextInt();
		Stack stack1 = new Stack(size);
		Stack stack2 = new Stack(size);
		StackCount s = new StackCount();
		while(true) {
			// Creating a menu for the user using switch case
	        System.out.print("\nPress 1 to Push in Stack 1,\nPress 2 to Push in Stack 2,\nPress 3 to Pop from Stack 1,\nPress 4 to Pop in Stack 2,\nPress 5 to Display Stack 1,\nPress 6 to Display Stack 2,\nPress 5 to Exit: ");    
	        int choice = sc.nextInt();
	        switch(choice) {
	        case 1:
	        	System.out.print("Enter the value: ");
	        	int value1 = sc.nextInt();
	        	stack1.push(value1, size);
	        	System.out.println("Data Pushed to Stack 1 Successfully!");
	        	break;
	        case 2:
	        	System.out.print("Enter the value: ");
	        	int value2 = sc.nextInt();
	        	stack2.push(value2, size);
	        	System.out.println("Data Pushed to Stack 2 Successfully!");
	        	break;
	        case 3:
	        	stack1.pop();
	        	System.out.println("Data Popped from Stack 1 Successfully!");
	        	break;
	        case 4:
	        	stack2.pop();
	        	System.out.println("Data Popped from Stack 2 Successfully!");
	        	break;
	        case 5:
	        	stack1.display();
	        	break;
	        case 6:
	        	stack2.display();
	        	break;
	        default:
	        	System.out.print("Enter valid choice: ");
	        
	        }
	        // Printing the data of the two stacks if the number of data of one stack equals to that of the 2nd stack 
	        if(s.display(stack1, stack2, size)) {
	        	System.out.print("The two stacks are equal.\nThe number of elements in the stack are: "+(stack1.top+1));
	        	stack1.display();
	        	stack2.display();
	        	break;
	        }
	        
		}
	}

}


/*OUTPUT - 
Enter the size of the stack: 1

Press 1 to Push in Stack 1,
Press 2 to Push in Stack 2,
Press 3 to Pop from Stack 1,
Press 4 to Pop in Stack 2,
Press 5 to Display Stack 1,
Press 6 to Display Stack 2,
Press 5 to Exit: 1
Enter the value: 43
Data Pushed to Stack 1 Successfully!

Press 1 to Push in Stack 1,
Press 2 to Push in Stack 2,
Press 3 to Pop from Stack 1,
Press 4 to Pop in Stack 2,
Press 5 to Display Stack 1,
Press 6 to Display Stack 2,
Press 5 to Exit: 2
Enter the value: 76
Data Pushed to Stack 2 Successfully!
The two stacks are equal.
The number of elements in the stack are: 1
The elements in the respective stack are: 43 
The elements in the respective stack are: 76 */
