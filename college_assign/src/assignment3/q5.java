package assignment3;

/* 5. Define a class Account to represent a bank account. Include the following members.
Instance Variable: Name of the depositor, Account number, Account type, Balance amount in
the account.
Method: To assign initial values, To deposit an amount, To withdraw an amount after checking
the balance, To display name and balance.
Write a program to test the program for a given number of customers. The program should be
able to search any customer if the account number is provided. */

import java.util.*;

class Accounts {
	String name,acc_type;
	int acc_no=0,bal_amount;
	// declaring scanner class and taking user input
	Scanner sc = new Scanner(System.in);
	// method to assign values
	void assign() {												
		System.out.print("Enter the name: ");
		name = sc.next();
		System.out.print("Enter the account number: ");
		acc_no = sc.nextInt();
		System.out.print("Enter the Balance Amount: ");
		bal_amount = sc.nextInt();
		System.out.print("Enter the account type: ");
		acc_type = sc.next();
	}
	// method for depositing
	void deposit(int value,int acc_no) {								
		
				bal_amount = bal_amount+value;
				System.out.println("Current Balance is: "+bal_amount);
		
		
	}
	// method for withdrawal
	void withdraw(int value,int acc_no) {		
			// checking if the Balance Amount is zero or less than the amount that user wants to withdraw
			if(bal_amount==0 || bal_amount<value) {						
				System.out.println("Insufficient Balance!!!");
			}
			else{
			bal_amount = bal_amount-value;
			System.out.println("Current Balance is: "+bal_amount);
			}

		
	}
	// method to display the details of an user
	void details(int acc_no) {											
		System.out.println("Name: "+name);
		System.out.println("Balance: "+bal_amount);
	}
}

public class q5 {

	public static void main(String[] args) {
		// declaring scanner class and taking user input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of customers to insert: ");
		int num = sc.nextInt();
		Accounts ac[] = new Accounts[num];
		for(int i=0;i<num;i++) {
			ac[i]=new Accounts();
			ac[i].assign();
		}
		
		while(true) {
			System.out.print("Press 1 to deposit in an account\nPress 2 to withdraw from an account\nPress 3 to view an account\nPress 4 to exit: ");
			int ch = sc.nextInt();
			// using a counter to check if the given account number is found or not and if found storing the index in a variable
			int acc_no,counter=0,store=0;												
			//using switch case for a menu interface for the user
			switch(ch) {																
			// if the user wants to deposit
			case 1:																		
				System.out.print("Enter a valid account number: ");
				acc_no = sc.nextInt();
				
				for(int i=0;i<num;i++) {
					
					if(ac[i].acc_no==acc_no) {
						store=i;
						counter++;
						break;
					}

				}
				if(counter==1) {
					System.out.print("Enter an amount to deposit: ");
					int amount = sc.nextInt();
					ac[store].deposit(amount,acc_no);
					break;
				}
				else {
						System.out.println("Account doesn't exist!");
					}
				
				break;
				// if the user wants to withdraw
			case 2:	System.out.print("Enter a valid account number: ");
					acc_no = sc.nextInt();
					for(int i=0;i<num;i++) {
						if(ac[i].acc_no==acc_no) {
							store=i;
							counter++;
							break;
						}
					}
					if(counter==1) {
						System.out.print("Enter an amount to withdraw: ");
						int amount = sc.nextInt();
						ac[store].withdraw(amount,acc_no);
					}
					else {
						System.out.println("Account doesn't exist!");
					}
				
				
					break;
				// if the user wants to view details
			case 3:	System.out.print("Enter a valid account number: ");
					acc_no = sc.nextInt();
					for(int i=0;i<num;i++) {
						if(ac[i].acc_no==acc_no) {
							store=i;
							counter++;
							break;
						}
					}
					if(counter==1) {
						ac[store].details(acc_no);
						break;
					}
					else {
						System.out.println("Account doesn't exist!");
					}

					break;
			case 4: System.exit(0);
					break;
					default:
					System.out.println("WRONG INPUT!!!");
			}
			
		}		
	}

}

/* OUPUT -
Enter the number of customers to insert: 2
Enter the name: s
Enter the account number: 1
Enter the Balance Amount: 10
Enter the account type: s
Enter the name: a
Enter the account number: 2
Enter the Balance Amount: 20
Enter the account type: s
Press 1 to deposit in an account
Press 2 to withdraw from an account
Press 3 to view an account
Press 4 to exit: 1
Enter a valid account number: 32
Account doesn't exist!
Press 1 to deposit in an account
Press 2 to withdraw from an account
Press 3 to view an account
Press 4 to exit: 1
Enter a valid account number: 1
Enter an amount to deposit: 32
Current Balance is: 42
Press 1 to deposit in an account
Press 2 to withdraw from an account
Press 3 to view an account
Press 4 to exit: 3
Enter a valid account number: 1
Name: s
Balance: 42
Press 1 to deposit in an account
Press 2 to withdraw from an account
Press 3 to view an account
Press 4 to exit: 3
Enter a valid account number: 2
Name: a
Balance: 20
Press 1 to deposit in an account
Press 2 to withdraw from an account
Press 3 to view an account
Press 4 to exit: 2
Enter a valid account number: 2
Enter an amount to withdraw: 10
Current Balance is: 10
Press 1 to deposit in an account
Press 2 to withdraw from an account
Press 3 to view an account
Press 4 to exit: 3
Enter a valid account number: 2
Name: a
Balance: 10
Press 1 to deposit in an account
Press 2 to withdraw from an account
Press 3 to view an account
Press 4 to exit: 4
*/
