package day8;

/* 3. Write a program that takes a String from the user on the command-line and print it in
reverse.
“This is a test” must be printed as: “test a is This”. */

//driver class
public class q3 {
	
	public static void main(String[] args)
	{	
		// printing the string in reverse
		for(int i = args.length-1; i>=0; i--)
		{
			System.out.print(args[i]+" ");
		}
	}
}

/* OUTPUT -
test a is This
 */