package day2;
import java.util.*;

/*4. The formula for resistors connected in parallel is a little more complex. Given two
resistors with resistances R1 and R2 connected in parallel the equivalent resistance is
given by the inverse of the sum of the inverses, i.e. * If there are more than two resistors
you continue to invert the sum of their inverses; e.g. for four resistors you have: * Write a
program that calculates the resistance of a group of resistors arranged in parallel. */

public class q4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter the number of resistances: ");
		//Taking the user input for the number of resistances
		int n = sc.nextInt();
		double sum = 0;
		// Creating/Declaring an array to store the values of 'n' of resistances
		double resi[] = new double[n];
		System.out.print("Enter the resistances: ");
		for(int i=0;i<n;i++) {
			// Taking user input for the value of the 'n' resistances
			resi[i] = sc.nextDouble();
		}
		for(int i=0;i<n;i++) {
			sum = sum + 1/resi[i];
		}
		// Inversing the resistance of the group of resistors because the formula is inverse of the inverse of each resistance
		sum=1/sum;
		
		System.out.print("The resistance of a group of resistors arranged in parallel is: "+sum);
	}

}

/* OUTPUT - 
Enter the number of resistances: 5
Enter the resistances: 4
2
6
2
1
The resistance of a group of resistors arranged in parallel is: 0.4137931034482759 */
