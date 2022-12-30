package day1;
import java.util.*;

//The nos. in the sequence 0 1 1 2 3 5 8 13 21…………. are called Fibonacci nos.
//Write a program to print the first n (to be taken as input) Fibonacci nos.

public class q3 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the terms in Fibonacci series: ");
		int n = sc.nextInt();
		int a = 1, b = 1, c, i;
		System.out.print(a + " " + b + " ");
		for (i=3; i<=n; i++) {
			c =a+b;
			a=b;
			b=c;
			System.out.print(c + " ");
		}
	}
}

/*Output:
Enter the terms in Fibonacci series: 9
1 1 2 3 5 8 13 21 34  */