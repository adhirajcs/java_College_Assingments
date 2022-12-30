package day7;

/* part of question/program no. 1 */

// driver class
public class factorial {
		static long arr[];
		static int index;
		static int size;
		
		// constructor
		factorial(int s) {
			arr=new long[s];
			size=s;
			index=0;
		}
		// method to calculate the factorial		
		public static void calcFact(int x) {
			// try block to check for any exceptions
			try { 
				if (x<0)
					throw new IllegalArgumentException("The Value must be Positive Value!!!");
				else if(x>=20)
					throw new IllegalArgumentException("OverFlowed!!!");
				else {
					long fact=1;
					for(int i=2; i<=x; i++)
						fact*=i;
					arr[index++]=fact;
				}
			}
			// catch block
			catch (IllegalArgumentException e) { 
				arr[index++]=-1;
				e.printStackTrace();
				System.out.println("Exception Found!!!");
			}
		}

}
