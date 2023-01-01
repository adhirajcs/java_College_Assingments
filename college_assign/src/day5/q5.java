package day5;

/* 5. Write a program that outputs the name of the capital of the country entered at the
command line. The program should throw a “NoMatchFoundException” when it fails to
print the capital of the country entered at the command line. */

// class named NoMatchFoundException1 inheriting Exception class
class NoMatchFoundException1 extends Exception {
	public NoMatchFoundException1() {
		System.out.println("Fails to print the capital of the country entered at the command line!!!");
	}
}
// driver class
public class q5 {

	public static void main(String[] args) {
		// try block
		try{
			String s="";
			for(int i=0;i<args.length;i++){
				s = args[i];
				}
			if(s==""){
				throw new NoMatchFoundException1();
			}
			else{
				System.out.println(s);
			}
		}
		// catch block
		catch(NoMatchFoundException1 e){
			System.out.println(e);
		}
	}
}

/* OUTPUT -
Fails to print the capital of the country entered at the command line!!!
day5.NoMatchFoundException1
*/
