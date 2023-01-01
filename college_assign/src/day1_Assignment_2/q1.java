package day1_Assignment_2;

/*1.Given a list of marks (ranging from 0 to 100) of n (user input) students, write a program to
print the number of students who have obtain marks:
(a) in the range 81 to 100 (b) in the range 61 to 80
(c) in the range 41 to 60 (d) in the range 0 to 40*/

import java.util.*;

public class q1 {

	public static void main(String[] args) {
		int n, c1=0, c2 = 0,c3 = 0, c4 = 0;
		// Taking input from the user for the number of students
		System.out.print("Enter the number of students: ");
		Scanner sc = new Scanner(System.in);
		n= sc.nextInt();
		System.out.print("Enter your marks: ");
		int arr[] =new int[n];
		// Declaring an array of the size given by the user as the value of 'n'
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			// Checking the range of the marks by if, else if operations
			if(arr[i]>=80 && arr[i]<=100) {
				c1++;
			}
			else if (arr[i]>=61 && arr[i]<=80) {
				c2++;
			}
			else if (arr[i]>=41 && arr[i]<=60) {
				c3++;
			}
			else if (arr[i]>=0 && arr[i]<=40) {
				c4++;
			}
		}
		// Printing the number of student who got marks in their respective range
		System.out.println("In the range 81 to 100 -> " + c1);
		System.out.println("In the range 61 to 80 -> " + c2);
		System.out.println("In the range 41 to 60 -> " + c3);
		System.out.println("In the range 0 to 40 -> " + c4);	
	}
}
/*OUTPUT - 
Enter the number of students: 5
Enter your marks: 34
23
12
76
45
In the range 81 to 100 -> 0
In the range 61 to 80 -> 1
In the range 41 to 60 -> 1
In the range 0 to 40 -> 3
*/
