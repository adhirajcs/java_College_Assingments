package day2;

import java.util.*;

/*2. Admission to a professional course is subject to the following conditions:
(a) marks in Mathematics >= 60 (b) marks in Physics >=50
(c) marks in Chemistry >=40 (d) Total in all 3 subjects >=200
 (Or)
Total in Maths & Physics>=150
 Given the marks in the 3 subjects of n (user input) students, write a program to process
 the applications to list the eligible candidates.
*/

public class q2 {
	public static void main(String[] args) {
		int m,p,c,t;
		Scanner sc = new Scanner(System.in);
		// Taking the input of the user as marks of Maths, Physics and Chemistry respectively
		System.out.print("Enter the marks of Maths: ");
		m=sc.nextInt();
		System.out.print("Enter the marks of Physics: ");
		p=sc.nextInt();
		System.out.print("Enter the marks of Chemistry: ");
		c=sc.nextInt();		
		// Adding marks of all 3 subjects
		t=m+p+c;
		System.out.println("Your total marks: " + t);
		// Checking if the student is eligible according to the marks criteria
		if(m>=60 && p>=50 && c>=40) {
			System.out.println("Your are eligible!");
		}
		else if(t>=200) {
			System.out.println("Your are eligible!");
		}
		else if((m+p)>=150) {
			System.out.println("Your are eligible!");
		}
		else {
			// If the student is not at all eligible then this part will execute
			System.out.println("Your are not eligible!");
		}
	}
	
}

/* output - 
Enter the marks of Maths: 43
Enter the marks of Physics: 54
Enter the marks of Chemistry: 2
Your total marks: 99
Your are not eligible!
*/
