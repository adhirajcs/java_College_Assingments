package day1_Assignment_2;
import java.util.*;

/* 9. Write a program to find the elements, a [i, j] in a two-dimensional array which are
maximum element to the ith row and jth column.*/

public class q9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// Taking number of rows as user input
		System.out.println("Enter the no. of rows: ");
		int m = sc.nextInt();
		// Taking number of columns as user input
		System.out.println("Enter the no. of column: ");
		int n = sc.nextInt();
		// Declaring a 2 dimensional array
		int arr[][]=new int[m][n];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.println("Enter the value: ");
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0; i<m; i++)
		{
			int max=-99999;			
			for(int j=0; j<n; j++)
			{
				// Checking for the maximum value in the array in row
				if(arr[i][j]>max) 							
					max=arr[i][j];
			}
			// Printing the greatest element in each row.
			System.out.println("Greatest element in row "+(i+1)+":"+max);
		}
		// Using to find the maximum element of each column
		for(int i=0; i<n; i++)
		{
			int max=-99999;
			for(int j=0; j<m; j++)
			{
				//Checking for the maximum value in the array in each column
				if(arr[j][i]>max) 							
					max=arr[j][i];
			}
			// Printing the greatest element in each column.
			System.out.println("Greatest element in column"+(i+1)+":"+max);
		}
	}

}

/* OUTPUT - 
Enter the no. of rows: 
5
Enter the no. of column: 
4
Enter the value: 
3
Enter the value: 
2
Enter the value: 
6
Enter the value: 
4
Enter the value: 
2
Enter the value: 
6
Enter the value: 
7
Enter the value: 
4
Enter the value: 
3
Enter the value: 
2
Enter the value: 
7
Enter the value: 
54
Enter the value: 
3
Enter the value: 
7
Enter the value: 
34
Enter the value: 
54
Enter the value: 
3
Enter the value: 
2
Enter the value: 
5
Enter the value: 
3
Greatest element in row 1:6
Greatest element in row 2:7
Greatest element in row 3:54
Greatest element in row 4:54
Greatest element in row 5:5
Greatest element in column1:3
Greatest element in column2:7
Greatest element in column3:34
Greatest element in column4:54

 */