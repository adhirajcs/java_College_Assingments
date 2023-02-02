package day8;

import java.util.*;

/*
 Write a Generic Method that can perform the sorting of any type of data.
 */


public class q3 {
	
	public static <S> void sort( S[] arr ) {
		Arrays.sort(arr);
		for(S s : arr) {
			System.out.print(s+" ");
		}
	}
	public static void main(String[] args) {
		
		Integer[] intArr = { 3, 2, 1, 5, 4 };							//Integer Array
		Double[] doubleArr = { 1.1, 2.2, 3.3, 4.4 };					//Double Array
		Character[] charArr = { 'A', 'R', 'S', 'E', 'N','L' };		//Character Array
		String[] stringArr = {"Ozil", "Ramsey", "Elneny","Sanchez"};	//String Array
		
		//sorting and printing the arrays
		System.out.println("Integer arrays sorted: ");
		sort(intArr);
		System.out.println();
		
		System.out.println("Double arrays sorted: ");
		sort(doubleArr);
		System.out.println();
		
		System.out.println("Character arrays sorted: ");
		sort(charArr);
		System.out.println();
		
		System.out.println("String arrays sorted: ");
		sort(stringArr);
		System.out.println();
	}

}

/* OUTPUT -
Integer arrays sorted: 
1 2 3 4 5 
Double arrays sorted: 
1.1 2.2 3.3 4.4 
Character arrays sorted: 
A E L N R S 
String arrays sorted: 
Elneny Ozil Ramsey Sanchez 
*/