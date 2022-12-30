package day2;
import java.util.*;

/*5. The straight-line method of computing the early depreciation of the value of an item is
given by:
Depreciation = Purchase price - Salvage value
 Years of service
 Write a program to determine the salvage value of an item when the purchase price years
of service & the annual preciation is given.
*/

public class q5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Taking input from the user for the purchase price
		System.out.print("Enter the Purchase Price: ");
		int purchase_p = sc.nextInt();
		// Taking input from the user for the depreciation amount
		System.out.print("Enter the Depriciation: ");
		int depriciation = sc.nextInt();
		// Taking input from the user for the no. of the years of service
		System.out.print("Enter the Years of Service: ");
		int years = sc.nextInt();
		// Calculating the Salvage value
		int salvage_value = purchase_p - (depriciation*years);	
		// Printing the salvage value
		System.out.println("The Salvage Value is: "+salvage_value);
	}

}

/* OUTPUT - 
Enter the Purchase Price: 3000
Enter the Depriciation: 200
Enter the Years of Service: 7
The Salvage Value is:-1600 */
