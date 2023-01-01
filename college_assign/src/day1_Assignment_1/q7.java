package day1_Assignment_1;
import java.util.*;

/* Write a program to find all Armstrong numbers in the range 1 to M,
where M is taken as input.
*/
public class q7 {

	// Function to calculate number of digits
	static int digits(int x)
    {
        int n = 0;
        while (x != 0) {
            n++;
            x = x / 10;
        }
        return n;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the range: ");
		int n = sc.nextInt();
		// Using loop to get all the numbers until n (which is the user input)
		for(int i=1;i<=n;i++) {		
			int og, rem,res=0;
			// Copying the value of i to another variable called og
			og=i;		
			// Using loop till the variable becomes 0
			while(og!=0){			
				rem=og%10;
				res+=Math.pow(rem,digits(i));
				og=og/10;
			}
			// Checking if the number i is equal to the sum of n power of its digits
			if(res==i){
			System.out.println(i);
		}
		}
	
	}

}

/* OUTPUT - 
Enter the range: 230
1
2
3
4
5
6
7
8
9
153 */
