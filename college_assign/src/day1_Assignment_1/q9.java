package day1_Assignment_1;
import java.util.*;

/* Write a program to obtain the sum of the n terms (n to be taken from the user) of the following series
1 - 32/2 + 53/3 - 74/4.................................................
*/

public class q9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of terms in the series: ");
		int n=sc.nextInt(); //Number of terms in series
		double sum=1.0;
		for(int i=2; i<=n; i++) {
			// Calculating sum 
			double t = Math.pow((2 * i - 1), i) / i;
			sum += Math.pow(-1, i + 1) * t; 
		}
		//Printing the total sum of n terms
		System.out.println("Sum: "+ sum); 
	}

}

/* OUTPUT - 
Enter number of terms in the series: 7
Sum: 8680061.407142857
 */