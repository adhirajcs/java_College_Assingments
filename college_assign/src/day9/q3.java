package day9;

/* 3. Write a program that inputs the names of people into different array list, A and B. Array A has N
number of names while array B has M number of names, with no duplicates in either of them. Merge
arrays A and B into a single array list C, such that the resulting array list is sorted alphabetically.
Display all the three arrays list, A, B and C, stored alphabetically. */

import java.util.ArrayList; 
import java.util.Collections; 

public class q3 { 
	public static void main(String[] args) 
	{ 
		// Creating arraylist A 
		ArrayList<String> A = new ArrayList<String>(); 

		// Adding elements to arraylist A 
		A.add("Richard"); 
		A.add("Bella"); 
		A.add("Peter"); 
		A.add("John"); 

		// Creating arraylist B 
		ArrayList<String> B = new ArrayList<String>(); 

		// Adding elements to arraylist B 
		B.add("Alfred"); 
		B.add("Alice"); 
		B.add("Cameron"); 

		// Creating arraylist C 
		ArrayList<String> C = new ArrayList<String>(); 

		// Adding elements of A to C 
		C.addAll(A); 

		// Adding elements of B to C 
		C.addAll(B); 

		// Sorting C alphabetically 
		Collections.sort(C); 

		// Printing list A 
		System.out.println("ArrayList A: " + A); 

		// Printing list B 
		System.out.println("ArrayList B: " + B); 

		// Printing list C 
		System.out.println("ArrayList C: " + C); 
	} 
}

/* OUTPUT -
ArrayList A: [Richard, Bella, Peter, John]
ArrayList B: [Alfred, Alice, Cameron]
ArrayList C: [Alfred, Alice, Bella, Cameron, John, Peter, Richard]

 */