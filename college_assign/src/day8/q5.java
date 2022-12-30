package day8;
import java.util.*;

/* 5. Write a Java class called ArrayExample to declare an array of String objects called
Products of the size 10, assign values to each element while declarations and print and
sort them. */

class ArrayExample{            
	// declaring an array of strings objects called Products of size 10
    String[] Products = new String[10];
    // method named inputElements for taking elements as user input
    void inputElements(){
        Scanner sc = new Scanner(System.in);
        // taking user input
        System.out.print("Enter the elements: ");
        for(int i = 0; i < 10; i++){
          Products[i] = sc.next();
        }
        
    }
    // method to display the array
    void display(){
        for(String st:Products){
            System.out.println(st);
        }
    }
    // sort function
    void sort(){
    	// here using the sort() to sort the array of strings
        Arrays.sort(Products);
    }
}

public class q5 {

	public static void main(String args[]) {
		// declaring an object of the ArrayExample class
	    ArrayExample o1 = new ArrayExample();
	    // calling the inputElements() method of the ArrayExample class
	    o1.inputElements();
	    System.out.println("Displaying the elements: ");
	    // calling the display() method of the ArrayExample class to display the array
	    o1.display();
	    // calling the sort() method of the ArrayExample class to sort the values preset in the array
	    o1.sort();
	    System.out.println("After sorting, the elements are: ");
	    // calling the display() method of the ArrayExample class after calling the sort() method
	    o1.display();
	}

}

/* OUTPUT -
Enter the elements: aaaaaaaaaaaaa
ggggggggggggggggggg
ddddddddddddddddddddddd
bbbbbbbbbbbbbbbbbb
ffffffffffffffffffffff
eeeeeeeeeeeeeeeeeeeeeee
cccccccccccccccccccccccc
hhhhhhhhhhhhhhhhhh
sssssssssssssssss
tttttttttttttttttttt
Displaying the elements: 
aaaaaaaaaaaaa
ggggggggggggggggggg
ddddddddddddddddddddddd
bbbbbbbbbbbbbbbbbb
ffffffffffffffffffffff
eeeeeeeeeeeeeeeeeeeeeee
cccccccccccccccccccccccc
hhhhhhhhhhhhhhhhhh
sssssssssssssssss
tttttttttttttttttttt
After sorting, the elements are: 
aaaaaaaaaaaaa
bbbbbbbbbbbbbbbbbb
cccccccccccccccccccccccc
ddddddddddddddddddddddd
eeeeeeeeeeeeeeeeeeeeeee
ffffffffffffffffffffff
ggggggggggggggggggg
hhhhhhhhhhhhhhhhhh
sssssssssssssssss
tttttttttttttttttttt
*/
