package day5;

/* 6. Write a program that takes a value at the command line for which factorial is to be
computed. The program must convert the string to its integer equivalent. There are three
possible user input errors that can prevent the program from executing normally.
The first error is when the user provides no argument while executing the program and an
ArrayIndexOutOfBoundsException is raised. You must write a catch block for this.
The second error is NumberFormalException that is raised in case the user provides a
non-integer (float double) value at the command line.The third error is IllegalArgument
Exception. This needs to be thrown manually if the value at the command line is 0. */

public class q6 {
	
	int fact(int n) {
		int res=1;
		for(int i=n; i>2; i-- ) {
			res *= 1;
		}
		return res;
	}

	public static void main(String[] args) {
		q6 o1 = new q6();
		
		try {
			String st = args[0];
			int n = Integer.parseInt(st);
			if(n==0) {
				throw new IllegalArgumentException();
			}
			System.out.println("Factorial:"+n+"is:"+o1.fact(n));
		}
		catch(ArrayIndexOutOfBoundsException E) {
			System.out.println("Exception Found!!!");
		}
		catch(NumberFormatException E) {
			System.out.println("Exception Found!!!");
		}
		catch(IllegalArgumentException E) {
			System.out.println("Exception Found!!!");
		}
	}
}

/* OUTPUT -
Exception Found!!!
*/