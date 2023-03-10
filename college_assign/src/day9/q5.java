package day9;

/* 5. Write a program to find elements which are present in first array and not in second array. */

import java.util.HashSet;

public class q5 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 6, 7};

        // Creating HashSets for easier comparison
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        // adding elements of arr1 and arr2 to their respective HashSets
        for (int i = 0; i < arr1.length; i++) {
            set1.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            set2.add(arr2[i]);
        }

        // Using set1.removeAll() to remove elements of arr2 
        set1.removeAll(set2);

        // Printing elements present in first array and not in second array
        System.out.println("Elements present in first array and not in second array: " + set1);
    }
}


/* OUTPUT -
Elements present in first array and not in second array: [4, 5]

*/