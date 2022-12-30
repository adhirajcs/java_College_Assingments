package day1;
import java.util.*;

//Write a program to find the roots (real and imaginary) of the quadratic equation of the
//form ax2 + bx + c = 0.

public class q2 {	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter co-efficients of the quadratic equations:");
		//Input section.
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c=sc.nextDouble();
		double d=b*b-4*a*c;
		if(d==0) { //Condition checking and output generation according to Sridhara Acharya's Method.
			System.out.println("Roots are real and equal.");
			System.out.println("The equal roots are valued "+(-b/(2*a)));
	}
		else if(d>0)
		{
			System.out.println("Roots are real and unequal. They are:");
			System.out.println((-b+Math.sqrt(d))/(2*a));
			System.out.println((-b-Math.sqrt(d))/(2*a));
		}
		else
		{
			System.out.println("Roots are imaginary and unequal. They are:");
			System.out.println((-b/(2*a))+"+"+Math.sqrt(Math.abs(d))/(2*a)+"i");
			System.out.println((-b/(2*a))+"-"+Math.sqrt(Math.abs(d))/(2*a)+"i");
		}
}
}
/* OUTPUT - 
Enter co-efficients of the quadratic equations:
60
3
30
Roots are imaginary and unequal. They are:
-0.025+0.7066647012551285i
-0.025-0.7066647012551285i
*/
