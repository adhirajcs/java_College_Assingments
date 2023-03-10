package day9;

/* 2. Write a program that uses a StringTokenizer to tokenize a line of text input by the user and places
each token in a treeSet. Print the elements of the treeSet. [Note: This should cause the elements to be
printed in ascending sorted order.] */

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeSet<String> tokenSet = new TreeSet<>();
        System.out.print("Enter a line of text: ");
        String line = scanner.nextLine();

        StringTokenizer st = new StringTokenizer(line);
        while (st.hasMoreTokens()) {
            tokenSet.add(st.nextToken());
        }

        System.out.println("Elements in ascending order:");
        for (String token : tokenSet) {
            System.out.println(token);
        }
        scanner.close();
    }
}


/* OUTPUT -
Enter a line of text: The quick brown fox jumps over the lazy dog
Elements in ascending order:
The
brown
dog
fox
jumps
lazy
over
quick
the

*/