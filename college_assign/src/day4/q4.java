package day4;

/*
4. Create an interface Department containing attributes deptName and deptHead. It also
has abstract methods for getting data and printing the attributes. Create a class hostel
containing hostelName, hostelLocation and numberofRooms. The class contains methods
for getting and printing the attributes. Then write Student class extending the Hostel
class and implementing the Department interface. This class contains attributes
studentName, regdNo, electiveSubject and avgMarks. Write suitable getData and
printData methods for this class. Also implement the abstract methods of the Department
interface. Write a driver class to test the Student class. The program should be menu
driven containing the options:
i) Admit new student
ii) Migrate a student
iii) Display details of a student
For the third option a search is to be made on the basis of the entered registration number.
*/

import java.util.*;

// interface named Department for the department details
interface Department{
	public void DeptName();
	public void DetpHead();
}

// class named Hostel for the hostel data
class Hostel{
	protected String hname,hostleLocation;
	int noOfRoom;
	void getHostelName(){
		System.out.println("Name Of the Hostel : " + hname);
	}
	void getHostelLocation(){
		System.out.println("Hostel Location : " + hostleLocation);
	}
	void getNoOfRoom(){
		System.out.println("Total Room : " + noOfRoom);
	}
}
// class named stuedent is inherinting Hostel class and implementing Department interface
class Student extends Hostel implements Department
{
	String sname,regno,elesub;
	String deptName,deptHead;
	int avgMarks;
	// method to print the student name
	void studentName(){
		System.out.println("Student : " + sname);
	}
	// method to return student's registration number
	String regdNo(){
		return regno;
	}
	// method to print the elective subject
	void electiveSubject(){
		System.out.println("Elective Subject : " + elesub);
	}
	// method to print the average marks of the student
	void avgMarks(){
		System.out.println("Average Marks : " + avgMarks);
	}
	// method to print the department name 
	public void DeptName(){
		System.out.println("Department Name : " + deptName);
	}
	public void DetpHead(){
		System.out.println("Department Head : " + deptHead);
	}
	// method to add student details
	void addStudent(){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Student name : ");
		sname=sc.nextLine();
		System.out.print("Enter Registration Number : ");
		regno=sc.nextLine();
		System.out.print("Enter Elective Subject: ");
		elesub=sc.nextLine();
		System.out.print("Enter Hostel Name: ");
		hname=sc.nextLine();
		System.out.print("Enter Hostel Location: ");
		hostleLocation=sc.nextLine();
		System.out.print("Enter Department Name: ");
		deptName=sc.nextLine();
		System.out.print("Enter Department Head: ");
		deptHead=sc.nextLine();
		System.out.print("Enter No of room: ");
		noOfRoom=sc.nextInt();
		System.out.print("Enter Avg Marks: ");
		avgMarks=sc.nextInt();
	}
	// method for the migration
	void migrate(){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter new Department Name: ");
		deptName=sc.nextLine();
		System.out.print("Enter new Department Head: ");
		deptHead=sc.nextLine();
	}
	// method to display student data
	void display(){
		studentName();
		System.out.println("Student Registration No is: " + regdNo());
		electiveSubject();
		avgMarks();
		DeptName();
		DetpHead();
	}
}

// driver class
class q4 {
    public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		// taking user input for the number of students
		System.out.println("Enter the number of Students: ");
		int n =  sc.nextInt();
		Student []st=new Student[n];
		int sno=0;
		String rno;
		int ch;
		boolean b;
		// using while loop and switch case for menu-like UI for the user
		while(true){
			System.out.println("\n1. Admit a student");
			System.out.println("2. Migrate a student");
			System.out.println("3. Display");
			System.out.println("4. Exit");
			System.out.print("5. Enter Your Choice: ");
			ch=sc.nextInt();
			switch(ch){
				case 1:
					st[sno]=new Student();
					st[sno++].addStudent();
					break;
				case 2:
					System.out.print("Enter Registration no: ");
					rno=sc.next();
					b=false;
					for(int i=0;i<sno;i++){
						if(st[i].regdNo().equals(rno)){
							b=true;
							st[0].migrate();
							break;
						}
					}
					if(b==false)
					{
						System.out.println("Student Not Found");
					}
					break;
				case 3:
					System.out.println("Enter Registration no : ");
					rno=sc.next();
					b=false;
					for(int i=0;i<sno;i++){
						if(st[i].regdNo().equals(rno)){
						b=true;
						st[i].display();
						break;
						}
					}
					if(b==false){
						System.out.println("Student Not Found");
					}
					break;
				case 4:
					System.exit(0);
				default:
					System.out.println("--Invalid Entry--");
			}
		}
	}
}

/*OUTPUT - 
Enter the number of Students: 
1

1. Admit a student
2. Migrate a student
3. Display
4. Exit
5. Enter Your Choice: 1
Enter Student name : jfsad
Enter Registration Number : 1
Enter Elective Subject: maths
Enter Hostel Name: jfdosf
Enter Hostel Location: fdjsof
Enter Department Name: mca
Enter Department Head: jfdos
Enter No of room: 2
Enter Avg Marks: 65

1. Admit a student
2. Migrate a student
3. Display
4. Exit
5. Enter Your Choice: 2
Enter Registration no: 1
Enter new Department Name: mba
Enter new Department Head: jfdosf

1. Admit a student
2. Migrate a student
3. Display
4. Exit
5. Enter Your Choice: 3
Enter Registration no : 
1
Student : jfsad
Student Registration No is: 1
Elective Subject : maths
Average Marks : 65
Department Name : mba
Department Head : jfdosf

1. Admit a student
2. Migrate a student
3. Display
4. Exit
5. Enter Your Choice: 
*/