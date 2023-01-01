package day1_Assignment_1;
import java.util.*;

//Write a program for determining whether a number is a Perfect number or not.
//(e.g. 28 is a Perfect Number because Sum of the Divisor of 28 = 1+2+4+7+14 =28.)

public class q4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); //Scanner object.
		// Taking user input
		System.out.print("Enter a number: ");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1; i<n; i++)
		{
			if(n%i==0)
				sum+=i; // Updating the value of sum
		}
		// Checking if number equals sum of it's factors
		if(sum==n) { 
			System.out.println(n+" is a perfect number!");
		}else {
			System.out.println(n+" is not a perfect number!");
		}
	}

}

/*Output:
Enter a number: 496
496 is a perfect number!
*/
