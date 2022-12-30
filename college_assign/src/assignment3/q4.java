package assignment3;

/* 4. The annual examination results of N students are tabulated as follows:
 Roll No. Subject 1 Subject 2 Subject 3

 …..
…..

 Write a program to read the data and determine the following:
(a) Total marks obtain by each student
(b) The highest marks in each subject and the roll no of the student who secured it
(c) The student who obtained the highest total marks */

import java.util.*;

class results{
	Scanner sc = new Scanner(System.in);
	int roll;
	double s1,s2,s3,s4,total;
	// method to take the student data as user input
	void insert() {
		System.out.println("Enter your roll number: ");
		roll = sc.nextInt();
		System.out.println("Enter your marks of Subject 1: ");
		s1 = sc.nextDouble();
		System.out.println("Enter your marks of Subject 2: ");
		s2 = sc.nextDouble();
		System.out.println("Enter your marks of Subject 3: ");
		s3 = sc.nextDouble();
	}
	double total() {
		// method to returns the sum of 3 subjects
		return s1+s2+s3;
	}
}

// driver class
public class q4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of students to be entered: ");
		int num = sc.nextInt();
		// declaring an array of objects of the results class
		results r[] = new results[num];	
		// loop to store the data of the result
		for(int i = 0;i<num;i++) {								
			r[i] = new results();
			r[i].insert();
		}
		for(int i=0;i<num;i++) {
			// printing the total marks of each student
			System.out.println("The Student with Roll Number "+r[i].roll+" has a total of "+r[i].total());		
		}
		// declaring and initializing a max variable for each subject to the first's students marks
		double max_1 = r[0].s1,max_2 = r[0].s2,max_3 = r[0].s3;			
		// declaring and initializing a max variable of roll to the first student's roll number
		int store_1 = r[0].roll,store_2 = r[0].roll,store_3= r[0].roll;											
		for(int i=1;i<num;i++) {
			// finding maximum marks of a student in subject 1 and storing their roll numbers
			if(r[i].s1>max_1) {	
				max_1 = r[i].s1;
				store_1 = r[i].roll;
			}
			// finding maximum marks of a student in subject 2 and storing their roll numbers
			if(r[i].s2>max_2) {
				max_2 = r[i].s2;
				store_2 = r[i].roll;
			}
			// finding maximum marks of a student in subject 3 and storing their roll numbers
			if(r[i].s3>max_3) {
				max_3 = r[i].s3;
				store_3 = r[i].roll;
			}
		}
		System.out.println("Student with Roll Number " + store_1 + " has gotten the highest with a marks of " + max_1 + " in Subject 1");
		System.out.println("Student with Roll Number " + store_2 + " has gotten the highest with a marks of " + max_2 + " in Subject 2");
		System.out.println("Student with Roll Number " + store_3 + " has gotten the highest with a marks of " + max_3 + " in Subject 3");
		// declaring and initializing a max variable total marks to the first's students total marks
		double total_max=r[0].total();		
		// declaring and initializing a max variable of roll to the first student's roll number
		int store_roll=r[0].roll;																
		// loop to find which student has gotten the highest total marks and storing their roll numbers
		for(int i=1;i<num;i++) {
			if(r[i].total()>total_max) {
				total_max = r[i].total();
				store_roll = r[i].roll;
			}
			
		}
		System.out.println("Student of Roll Number "+store_roll+" has gotten the highest total marks of "+total_max);
		
	}

}

/*OUTPUT - 
Enter the number of students to be entered: 
3
Enter your roll number: 
1
Enter your marks of Subject 1: 
32
Enter your marks of Subject 2: 
43
Enter your marks of Subject 3: 
65
Enter your roll number: 
2
Enter your marks of Subject 1: 
54
Enter your marks of Subject 2: 
76
Enter your marks of Subject 3: 
21
Enter your roll number: 
3
Enter your marks of Subject 1: 
65
Enter your marks of Subject 2: 
43
Enter your marks of Subject 3: 
76
The Student with Roll Number 1 has a total of 140.0
The Student with Roll Number 2 has a total of 151.0
The Student with Roll Number 3 has a total of 184.0
Student with Roll Number 3 has gotten the highest with a marks of 65.0 in Subject 1
Student with Roll Number 2 has gotten the highest with a marks of 76.0 in Subject 2
Student with Roll Number 3 has gotten the highest with a marks of 76.0 in Subject 3
Student of Roll Number 3 has gotten the highest total marks of 184.0
*/
