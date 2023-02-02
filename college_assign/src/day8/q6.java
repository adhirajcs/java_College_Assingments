package day8;

import java.util.Scanner;

/*
 Write a methods [double operation(double a, double b)]; ] that return a lambda expression implement a
calculator perform Addition, Subtraction, Division, Multiplication operation.
 */
class Calc {
	double x,y;
	//Creating a constructor to get the input
	Calc(double x, double y){
		this.x = x;
		this.y = y;
	}
	//Functional Interfaces for performing the operations
	interface MathOperation {
		double operation(double number1, double number2);
	}
	
	public double operate(double x2, double y2, MathOperation mathOperation) {
		return mathOperation.operation(x2, y2);
	}
	//Addition
	 void Addition() {				
		MathOperation AdditionOp = (number1, number2) -> number1 + number2;								//lambda expression
		System.out.println("Sum of "+x+" and "+y+" = " + operate(x, y, AdditionOp));
	}
	//Subtraction
	void Subtraction() {
		MathOperation SubtractionOp = (number1, number2) -> number1 - number2;							//lambda expression
		System.out.println("Difference of "+x+" and "+y+" = " +operate(x, y, SubtractionOp));
	}
	//Multiplication
	 void Multiplication() {
		MathOperation MultiplicationOp = (number1, number2) -> number1 * number2;						//lambda expression
		System.out.println("Multiplication of "+x+" and "+y+" = " +operate(x, y, MultiplicationOp));
	}
	 //Division
	 void Division() {
		MathOperation DivisionOp = (number1, number2) -> number1 / number2;								//lambda expression
		System.out.println("Division of "+x+" and "+y+" = " +operate(x, y, DivisionOp));
	}
}

//Driver class
public class q6 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first and second number:");
		Calc Calc = new Calc(sc.nextDouble(),sc.nextDouble());					//creating a Calc object
		Calc.Addition();
		Calc.Subtraction();
		Calc.Multiplication();
		Calc.Division();
	}
}


/* OUTPUT - 
Enter the first and second number:
3
6
Sum of 3.0 and 6.0 = 9.0
Difference of 3.0 and 6.0 = -3.0
Multiplication of 3.0 and 6.0 = 18.0
Division of 3.0 and 6.0 = 0.5
*/

