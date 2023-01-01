package day6;

/* 2. Write a Java class called CountAndPrintArgs to print the number of arguments passed on
the command-line as well as the 1st letter of the arguments. For example, if the command
line arguments are: “Mango Cucumber Apple” then the output will be
No. of arguments – 3 MCA
Write a main method to test the class. */

// method to count the number of arguments passed
class CountAndPrintArgs
{
	public static void count_args(String[] args)
	{
		System.out.println(args.length);
	}
// method to print the arguments passed
	public static void print_args(String[] args)
	{
		for(String a : args)
		{
			System.out.print(a.charAt(0));
		}
	}
}
// driver class
public class q2 {
	public static void main(String[] args)
	{
		String st1[] = {"Mango", "Cucumber", "Apple"};
		// calling count_args method() and print_args() method
		CountAndPrintArgs.count_args(st1);
		CountAndPrintArgs.print_args(st1);
	}
}

/* OUTPUT -
3
MCA
*/