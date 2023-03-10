package day9;

/* 4. Write a program to find whether an array is subset of another array or not. */

import java.util.Arrays;

public class q4 {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3};

        // converting the arrays to sets 
        // for easier comparison
        int[] arr1Set = new int[arr1.length];
        int[] arr2Set = new int[arr2.length];

        for(int i = 0; i < arr1.length; i++) {
            arr1Set[i] = arr1[i];
        }
        for(int i = 0; i < arr2.length; i++) {
            arr2Set[i] = arr2[i];
        }

        // sorting the sets
        Arrays.sort(arr1Set);
        Arrays.sort(arr2Set);

        // flag to check if arr2 is a subset of arr1
        boolean isSubset = true;

        // Iterating through the arr2 set
        for (int i = 0; i < arr2Set.length; i++) {
            //checking if every element of arr2 is present in arr1 or not
            if (Arrays.binarySearch(arr1Set, arr2Set[i]) < 0) {
                isSubset = false;
                break;
            }
        }
        if (isSubset) {
            System.out.println("Array 2 is a subset of Array 1");
        } else {
            System.out.println("Array 2 is not a subset of Array 1");
        }
    }
}

/* OUTPUT -
Array 2 is a subset of Array 1

*/