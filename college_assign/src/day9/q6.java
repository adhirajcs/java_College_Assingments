package day9;

/* 6. Write a program to check the number where the difference between every adjacent digit should
be 1 using ArrayList. */

import java.util.ArrayList;
import java.util.List;

public class q6 {

    public static void main(String[] args) {
        int num = 1234;
        int diff = 1;

        // Creating an ArrayList to store the digits of the number
        List<Integer> digits = new ArrayList<>();

        // Adding the digits of the number to the ArrayList
        while (num > 0) {
            digits.add(num % 10);
            num /= 10;
        }

        // flag to check if the difference between every adjacent digit is 1
        boolean check = true;

        for (int i = 0; i < digits.size() - 1; i++) {
            // Checking if the difference between every adjacent digit is 1
            if (Math.abs(digits.get(i) - digits.get(i + 1)) != diff) {
                check = false;
                break;
            }
        }
        if (check) {
            System.out.println("The number has a difference of " + diff + " between every adjacent digit");
        } else {
            System.out.println("The number does not have a difference of " + diff + " between every adjacent digit");
        }
    }
}

/* OUTPUT -
The number has a difference of 1 between every adjacent digit

*/