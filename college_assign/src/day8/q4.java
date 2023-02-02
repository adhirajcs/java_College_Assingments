package day8;

import java.util.Arrays;

/*
Write a generic method that computes the Second minimum and Second maximum elements of an array
of type T and returns a pair containing the minimum and maximum value.
 */

public class q4 {
	static class Pair<T>{
		T a, b;

		Pair(T a, T b) {
			this.a = a;
			this.b = b;
		}
		public String toString() {
			return "(" + a + ", " + b + ")";
			
		}
	}
	//Generic method of type T
	static <T> Pair<T> maxmin(T[] arr){
			Arrays.sort(arr);									//sort method from util package
			return new Pair<T>(arr[1],arr[arr.length-2]);		//returning the 2nd  element and 2nd last element after sorting out the  after sorting
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] intArr = { 3, 2, 1, 5, 4 };											//Integer Array
		System.out.println(maxmin(intArr));
		
		Double[] doubleArr = { 1.1, 2.2, 3.3, 4.4 };									//Double Array
		System.out.println(maxmin(doubleArr));
		
		Character[] charArr = { 'B', 'C', 'A', 'Z', 'G' };							//Character Array
		System.out.println(maxmin(charArr));
		
		String[] stringArr = {"Mesut Ozil", "Alexis Sanchez", "Oliver Giroud","Aaron Ramsey","M Elneny","Danny Welbeck"};			//String Array
		System.out.println(maxmin(stringArr));
		
	}
}

/* OUTPUT - 
(2, 4)
(2.2, 3.3)
(B, G)
(Alexis Sanchez, Mesut Ozil)*/
