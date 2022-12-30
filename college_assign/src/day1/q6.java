package day1;
import java.util.*;

/* Write a program for determining whether a number is a Pearson number or not.
(e.g. 145 is a Pearson number because 1! + 4! + 5! =145.) */

public class q6 {
	// Method to calculate the factorial
	static int fact(int n)
	{
		int f=1;
		for(int i=1; i<=n; i++)
			f*=i;
		return f;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Taking the value from the user
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		// Initializing the variable fact to 1 and sum to 0
		int sum=0,rem;					
		int o=n;
		// Executing a loop that runs till the value of o is not equal to zero
		while(o!=0){						
			rem = o%10;
			o = o/10;
			// Adding all the factorials of each number
			sum+=fact(rem);				
		}
		if (sum==n){
			System.out.println("It is a Pearson number");
		}
		else {
			System.out.println("It is not a Pearson number");
		}
	}

}

/* Output - 
Enter the number: 145
It is a Pearson number

*/
