package day2;
import java.util.*;

/*7. Given are two one-dimensional arrays A & B, which are sorted in ascending order. Write
a program to merge them into single sorted array C that contains every item from arrays.
A & B, in ascending order.*/

public class q7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// taking user input for the range of 1st array
		System.out.print("Enter the range of the first array: ");
		int n1 = sc.nextInt();
		int arr1[] = new int[n1];
		// Taking the numbers in the 1st array as user input
		System.out.print("Enter the numbers: ");
		for(int i=0;i<n1;i++) {
			arr1[i] = sc.nextInt();
		}
		// taking user input for the range of 2nd array
		System.out.print("Enter the range of the second array: ");
		int n2 = sc.nextInt();
		int arr2[] = new int[n2];
		// Taking the numbers in the 2nd array as user input
		System.out.print("Enter the numbers: ");
		for(int i=0;i<n2;i++) {
			arr2[i] = sc.nextInt();
		}
		// Creating a 3rd array in which it will have the range
		// of values of the 1st and 2nd array 
		int arr[] = new int[n1+n2];
		for(int i=0;i<n1+n2;i++) {
			if(i<n1) {
				// Storing the values of 1st array in 3rd array
				arr[i]=arr1[i];
			}
			else {
				// Storing the values of 2nd array in 3rd array
				arr[i]=arr2[i-n1];
			}
		}
		System.out.print("The merged sorted array is:-");
		// Sorting the third array
		Arrays.sort(arr);
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}

}

/* OUTPUT - 
Enter the range of the first array: 4
Enter the numbers: 54
23
76
1
Enter the range of the second array: 4
Enter the numbers: 65
2
66
4
The merged sorted array is:-1 2 4 23 54 65 66 76 */
