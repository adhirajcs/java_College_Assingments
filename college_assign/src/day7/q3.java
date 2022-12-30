package day7;
import java.util.*;

/* 3. Write a program to create a class called MyStack that includes functions to perform all
operations on a stack as well as raises an exception whenever overflow/underflow error
occurs. */

// created a class called Stack
class Stack{				
	int top;				
	int arr[];		
	// constructor of the Stack class
	Stack(int size){		
		arr = new int[size];
		top=-1;
	}
		// method for push function for the stack
		void push(int value,int size) {
			top++;											
			arr[top]=value;									
			}
		// method for the pop function of the stack
		void pop() {											
			top--;											
		}
	
	// method to display the stack
	void display() {
		System.out.println("The elements of the stack: ");
		// printing each element present in the stack
		for(int i=top; i>=0; i--) {	
			System.out.println(arr[i]);
		}
	}
}
// class named Overflow inheriting the Exception class
class Overflow extends Exception{
	Overflow(){
		// this will print if the stack is overflowed by elements
		System.out.println("Stack Overflowed!!!");
	}
}
// class named Underflow inheriting the Exception class
class Underflow extends Exception{
	Underflow(){
		// this will print if the stack doesn't have any elements
		System.out.println("Stack Underflowed!!!");
	}
}
// driver class
public class q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// taking user input for the size of the stack
		System.out.print("Enter the Size of the Stack: ");
		int size = sc.nextInt();
		Stack stack = new Stack(size);	
		// using while loop and switch case for the Menu UI for the user
		while(true) {
	        System.out.print("1. Press 1 to Push\n2. Press 2 to Pop\n3. Press 3 to Display\n4. Press 4 to Exit:");       
	        int ch = sc.nextInt();
	        switch(ch) {
	        case 1:		
	        	// try block
	        	try{
	        		// if user wants to add more elements but the stack doesn't have any space left
					if(stack.top==size-1) {
						throw new Overflow();
					}
					// if user wants to add elements and there is space in the stack for that
					else {
						System.out.print("Enter the value: ");
			        	int value = sc.nextInt();
			        	stack.push(value, size);
			        	System.out.println("Push Operation Succuessfully Excecuted.");
					}
	        	}
	        	// catch block
	        	catch(Overflow o){
					System.out.println("Exception: "+o);
				}
	        	break;
	        case 2:		
	        	// try block
	        	try{
	        		// if the user wants to remove an element despite being that the stack is empty
					if(stack.top==-1) {
						throw new Underflow();
					}
					else {
						// if the user wants to remove an element and the stack isn't empty
						stack.pop();
			        	System.out.println("Pop Operation Successfully Execulted.");
					}
				}
	        	// counting the number of exceptions in the process
				catch(Underflow u){
					System.out.println("Exception: "+u);
				}
	        	
	        	break;
	        case 3:		
	        	// to display the stack
	        	stack.display();
	        	break;
	        case 4:			
	        	// to exit the menu
	        	System.exit(0);
	        default:
	        	// if user puts wrong input
	        	System.out.println("WRONG INPUT!!!");
	        }
		}
	}
}

/*
 * OUTPUT - 
Enter the Size of the Stack: 3
1. Press 1 to Push
2. Press 2 to Pop
3. Press 3 to Display
4. Press 4 to Exit:1
Enter the value: 5
Push Operation Succuessfully Excecuted.
1. Press 1 to Push
2. Press 2 to Pop
3. Press 3 to Display
4. Press 4 to Exit:1
Enter the value: 6
Push Operation Succuessfully Excecuted.
1. Press 1 to Push
2. Press 2 to Pop
3. Press 3 to Display
4. Press 4 to Exit:3
The elements of the stack: 
6
5
1. Press 1 to Push
2. Press 2 to Pop
3. Press 3 to Display
4. Press 4 to Exit:2
Pop Operation Successfully Execulted.
1. Press 1 to Push
2. Press 2 to Pop
3. Press 3 to Display
4. Press 4 to Exit:3
The elements of the stack: 
5
1. Press 1 to Push
2. Press 2 to Pop
3. Press 3 to Display
4. Press 4 to Exit:1
Enter the value: 6
Push Operation Succuessfully Excecuted.
1. Press 1 to Push
2. Press 2 to Pop
3. Press 3 to Display
4. Press 4 to Exit:3
The elements of the stack: 
6
5
1. Press 1 to Push
2. Press 2 to Pop
3. Press 3 to Display
4. Press 4 to Exit:1
Enter the value: 87
Push Operation Succuessfully Excecuted.
1. Press 1 to Push
2. Press 2 to Pop
3. Press 3 to Display
4. Press 4 to Exit:3
The elements of the stack: 
87
6
5
1. Press 1 to Push
2. Press 2 to Pop
3. Press 3 to Display
4. Press 4 to Exit:2
Pop Operation Successfully Execulted.
1. Press 1 to Push
2. Press 2 to Pop
3. Press 3 to Display
4. Press 4 to Exit:3
The elements of the stack: 
6
5
1. Press 1 to Push
2. Press 2 to Pop
3. Press 3 to Display
4. Press 4 to Exit:4
*/
