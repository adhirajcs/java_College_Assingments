package day1;
import java.util.*;

/* Write a Program in Python to find the sum of all the Prime numbers between a
given range of numbers. */

public class q8 {

	public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				// Taking the input from the user for the range of numbers
				System.out.print("Enter the range: "); 
				int e=sc.nextInt();
				int i, j, sum = 0; 	
				// First loop to print values upto n numbers
				for(i = 1; i <= e; i++) {	
					int c=0;
					// Second/Nested loop to find all the prime numbers
					for(j=1;j<=i;j++) {
						// Checking if the remainder of the division of x and i is 0 or not
						if(i%j==0) {	
							// Incrementing the value of c
							c++;
						}
					}
					// Prime numbers are divided by 1 and itself
					if(c==2)	
						// Adding all the prime numbers
						sum=sum+i;
				}
				System.out.println("The sum of the prime numbers are " + sum); // Print the sum of prime numbers

			}

}

/* OUTPUT - 
Enter the range: 6
The sum of the prime numbers are 10
*/
