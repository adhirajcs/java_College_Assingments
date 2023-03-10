package day9;

/* 1. Write a program that reads in a series of first names and stores them in a LinkedList. Do not store
duplicate names. Allow the user to search for a first name. */

import java.util.LinkedList;
import java.util.Scanner;

public class q1 {
    // creating a linkedlist object to store names
    private LinkedList<String> names;

    // constructor
    public q1() {
        names = new LinkedList<String>();
    }

    // method to add names in list, if already exists then a message will be printed
    public void addName(String name) {
        if (!names.contains(name)) {
            names.add(name);
        }
        else if (names.contains(name)) {
            System.out.println("Name: " + name + " Already Exists!!!");
        }
    }

    // method to check if the entered name exists in the list
    public boolean searchName(String name) {
        return names.contains(name);
    }

    public static void main(String[] args) {
        // creating a new object of class q1
        q1 list = new q1();
        Scanner scanner = new Scanner(System.in);

        // Loop for adding names
        while (true) {
            System.out.print("Enter a name (or 'q' to quit): ");
            String name = scanner.nextLine();

            if (name.equals("q")) {
                break;
            }

            list.addName(name);
        }

        // Loop for searching names
        while (true) {
            System.out.print("Enter a name to search for (or 'q' to quit): ");
            String searchName = scanner.nextLine();
            if (list.searchName(searchName)) {
                System.out.println(searchName + " is in the list.");
            }
            else if(searchName.equals("q")) {
                break;
            }
            else {
                System.out.println(searchName + " is not in the list.");
            }
        }
        // closing the scanner object
        scanner.close();
    }
}


/* OUTPUT -
Enter a name (or 'q' to quit): soumik
Enter a name (or 'q' to quit): pranati
Enter a name (or 'q' to quit): soumik
Name: soumik Already Exists!!!
Enter a name (or 'q' to quit): adhiraj
Enter a name (or 'q' to quit): q
Enter a name to search for (or 'q' to quit): pranati
pranati is in the list.
Enter a name to search for (or 'q' to quit): adhiraj
adhiraj is in the list.
Enter a name to search for (or 'q' to quit): q

 */