package day1_Assignment_1;
import java.util.*;


//Write a program to find the prime factors of the given number . 
//(e.g. Input : 315 Output: 3 3 5 7)

public class q5 {
	// User-defined function to check if the number is a prime number or not
	static boolean prime(int x) {		
		int c=0;
		for(int i=1;i<=x;i++) {
			
			// Checking if the remainder of the division of x and i is 0 or not
			if(x%i==0) {	
				// Increment of c
				c++;		
			}
		}
		// Prime numbers are divided by 1 and itself
		if(c==2)			
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		System.out.println("Prime Factors of " + n + " are: ");
		for(int i=2; i<=Math.sqrt(n); i++)
		{
			// Checking the value of i is a prime n
			if(!prime(i))
				continue;
			else
			{
				// Checking if n is divisible by i
				if(n%i==0) 
				{
					System.out.print(i+" ");
					// Updating the values
					n/=i; 
					i--;
				}
			}
		}
		
	}

}

/*OUTPUT -
 Enter the number: 543
Prime Factors of 543 are: 
3  */
