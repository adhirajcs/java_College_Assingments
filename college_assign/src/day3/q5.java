package day3;

import java.util.*;

/*
 5. Consider an example of book shop which sells books &amp; video tapes. It’s modeled by Book &amp;
Tape classes. These two classes are inherited from the abstract class called Media. The Media
class has common data members such as title &amp; publication. The Book class has data
member for storing a no. of pages in a book &amp; Tape class has the playing time in a tape. Each
class will have method such as read ( ) &amp; show ( ). Write a program that models this class
hierarchy &amp; processes objects using reference to base class only.
 */
//declaring a abstract class called Media
abstract class Media1
{
	String title,publication;
 // creating a method to get the data
	void read(String title,String publication)	
	{
		this.title=title;
		this.publication=publication;
	}
 // method to display the data
	void show()				
	{
		System.out.println("Title is "+title);
		System.out.println("Publication is "+publication);
	}
	
}
//creating a class called Book which is inheriting the properties of Media class
class Book1 extends Media1
{
	int numberOfPages;
 // creating a method to take the data
	void read(String title,String publication,int numberOfPages)							
	{
     // using super keyword to call super class
		super.read(title, publication);	
     this.numberOfPages=numberOfPages;
	}
	// creating a method to display the data
	void show()			
	{
     // using super keyword to call super class
		super.show();	
		System.out.println("Number of pages "+numberOfPages);
	}
}
//creating a class called Tape which is inheriting the properties of Media class
class Tape1 extends Media1
{
	int playingTime;
	void read(String title,String publication,int playingTime)
	{
     // using super keyword to call super class
		super.read(title, publication);				
		this.playingTime=playingTime;
	}
	
	void show()
	{
     // using super keyword to call super class
		super.show();																	
		System.out.println("Playing time is "+playingTime+" minutes ");
	}
}

//driver class
public class q5
{  
public static void main(String[] args) {
		// creating an object called book of the Book class
		Book1 book=new Book1();
		book.read("A Study in Scarlet","Conan Doyle",124);
		book.show();
   // creating a  object called tape of the tape class
		Tape1 tape=new Tape1();
		tape.read("Interstellar","Christopher Nolan",169);
		tape.show();
	}
}


/* OUPUT -
Title is A Study in Scarlet
Publication is Conan Doyle
Number of pages 124
Title is Interstellar
Publication is Christopher Nolan
Playing time is 169 minutes 

 */