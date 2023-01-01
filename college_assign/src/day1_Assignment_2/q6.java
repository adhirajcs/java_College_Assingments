package day1_Assignment_2;
import java.util.*;

/*6. For a certain electrical circuit with an inductance L and resistance R, the damped natural
 frequency is given by:
Frequency = √ [( 1 / LC ) – ( R2
/4C2 )]
 It is desired to study the variations of the frequency with C (capacitance). Write a
program to calculate the frequency of difference values of C starting 0.01 to 0.1 in steps
of 0.01.
*/

public class q6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Inductance: ");
		// Taking input for the value of the Inductors
		double L = sc.nextDouble();				
		System.out.print("Enter Resistor: ");
		// Taking input for the value of the Resistors
		double R = sc.nextDouble();				
		double F,C=0.01,x;
		while(C<=0.1) {
			// Checking if the (1/(L*C))-(R*R)/(4*C*C)) value is not positive or not, as we cannot find root of a negative number
			if(((1/(L*C))-(R*R)/(4*C*C))>=0) {	
				// Using the given Frequency = √[(1/LC) – (R2/4C2)] formulae using Math.pow function
				x=(1/(L*C))-(R*R)/(4*C*C);	
				// Using sqrt function from Math class to find the square root
				F=Math.sqrt(x);					
				System.out.println("Frequency for "+C+": "+F);
			}
			else {
				System.out.println("Frequency for "+C+" is not possible");
			}
			// Incrementing the value of capacitors by 0.01
			C=C+0.01;
		}
	}
}


/* OUTPUT -
Enter Inductance: 2
Enter Resistor: 0.32
Frequency for 0.01 is not possible
Frequency for 0.02 is not possible
Frequency for 0.03 is not possible
Frequency for 0.04 is not possible
Frequency for 0.05 is not possible
Frequency for 0.060000000000000005: 1.1055415967851334
Frequency for 0.07: 1.385051387833237
Frequency for 0.08: 1.5
Frequency for 0.09: 1.547598697464902
Frequency for 0.09999999999999999: 1.5620499351813306
*/
