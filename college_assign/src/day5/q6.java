package day5;

import java.util.Scanner;

/*
 6. Assume that a Bank maintains two kinds of accounts for its customers, one called savings
account and the other current account. The savings account provides compound interest and
withdrawal facilities. The current account provides no interest. Current account holders
should maintain balance and if the balance falls below this level, a service charge is imposed.
o Create a class Account that stores customers name, account number and type of the
account. From this derive the classes CurAccount and SavAccount to make them
more specific to their requirements.
o Include the necessary methods in order to achieve the following tasks:
Assign initial values
Accept deposit from a customer and update the balance
Permit withdrawal and update the balance
Compute and deposit interest
Check for the minimum balance, impose penalty, if necessary, and update it.
Display the balance
o Write a program that creates an array of Bank Account and displays a menu that lets a
new account to be created, perform deposit and withdrawal transactions on the basis
of account number, display the balance of account holder for whom the account
number is provided.
 */

// created a abstract class called Account
abstract class Account {
	Scanner sc = q6.sc;
	private String name, accNumber, type;
	private double balance;

	void initialise(String type) {
		System.out.print("Name: ");
		sc.nextLine();
		name = sc.nextLine();
		System.out.print("Acc No.: ");
		accNumber = sc.next();
		System.out.print("Initial Balance to open Account: ");
		balance = sc.nextDouble();
		this.type = type;
	}
    // method to return the value to balance
	double getBalance() {
		return balance;
	}
    // method to update the value of balance
	void updateBalance(double amount) {
		balance += amount;
		System.out.println(balance + ", balance updated!!!");
	}
    // method to display the amt after deposition
	void deposit() {
		System.out.print("Enter amount to be deposited: ");
		balance += sc.nextDouble();
		System.out.println(balance + ", balance updated!!!");
	}
    // method to display all the data
	void display() {
		System.out.println("Name: " + name);
		System.out.println("Acc No.: " + accNumber);
		System.out.println("Acc Type: " + type);
		System.out.println("Balance: " + balance);
	}
    
	abstract void withdraw();
    // method to return the acc number
	String getAccNo() {
		return accNumber;
	}
}
// created a class called SavAccount which inherits Account class
class SavAccount extends Account {
	private int mon;
	private double intr, rt;
    // constructor
	SavAccount(int mon, double rt) {
		this.mon = mon;
		this.rt = ((int)(rt * 100))/100.0;
		System.out.println("Rate of interest: " + this.rt + "%");
		initialise("Savings");
	}
    // method for interest
	private void addInterest() {
		System.out.println("Months stored: " + mon);
		System.out.println("Rate of interest: " + rt + "%");
		intr = getBalance() * rt * (mon / 12.0) * 0.01;
		System.out.println(intr + ", interest added");
		updateBalance(intr);
	}
    // overridding the withdraw() method
	void withdraw() {
		display();
		double t;
		System.out.print("\nEnter amount to be withdrawn: ");
		t = sc.nextDouble();
		if ((getBalance() - t) < 0)
			System.out.println("Not enough balance!!!!");
		else
			updateBalance(-1 * t);
	}
    // method to display the data
	void display() {
        // using super keyword to call super class
		super.display();
		addInterest();
		mon += (int) (Math.random() * 10) + 1;
	}
}
// created a class called CurAccount which inherits Account
class CurAccount extends Account {
	private double min, chrg;
    // constructor
	CurAccount(double min, double chrg) {
		this.min = ((int)(min * 100))/100.0;
		System.out.println("Min Balance: " + this.min);
		this.chrg = ((int)(chrg * 100))/100.0;
		System.out.println("Penalty charge: " + this.chrg + "%");
		initialise("Currents");
	}
    // method for penalty
	private void penalty() {
		double t = getBalance();
		if (t < min) {
			System.out.println("Amount below min balance!!!");
			System.out.println("Penalty charged at rate " + chrg + "%: " + (t * chrg * 0.01));
		}
	}
	// method for deposition
	void deposit() {
        // using super keyword to call the super class
		super.deposit();
		penalty();
	}
    // method to withdraw
	void withdraw() {
		display();
		System.out.println("\nMin Balance: " + min);
		double t;
		System.out.print("Enter amount to be withdrawn: ");
		t = sc.nextDouble();
		if ((getBalance() - t) < 0) // min balance check
			System.out.println("Not enough balance!!!");
		else
			updateBalance(-1 * t);
		penalty();
	}
    // method to display all the data
	void display() {
        // using super keyword to call super class
		super.display();
		penalty();
	}
}
// driver class
class q6
{  
  static Scanner sc = new Scanner(System.in);

	static void menu(Account a) {
        // using while for a mini menu-like UI for the user
		while (true) {
            System.out.println("\n1. Deposit\t2. Withdraw\t3. Display\t4. Exit");
			System.out.print("Enter choice: ");
			switch (sc.nextInt()) {
			default:
				System.out.print("Enter correctly!!!");
				break;
			case 1:
				a.deposit();
				break;
			case 2:
				a.withdraw();
				break;
			case 3:
				a.display();
				break;
			case 4:
				return;
			}
			System.out.println();
		}
	}
    // static method for acc type 
	static Account accType() {
		while (true) {
			System.out.print("Select Account Type -> 1.Savings 2.Current: ");
			switch (sc.nextInt()) {
			case 1:
				return new SavAccount((int) (Math.random() * 20 + 1), Math.random() * 10);
			case 2:
				return new CurAccount(Math.random() * 1000 + 1000, Math.random() * 50);
			default:
				System.out.println("Choose a correct option!!!");
			}
		}
	}
    // method for acc search
	static Account search(String n, Account ac[]) { 
		for (int i = 0; i < ac.length; i++)
			if (ac[i].getAccNo().equals(n))
				return ac[i];
		return null;
	}
    // main method
	public static void main(String[] args) {
		System.out.print("Enter no. of customers: ");
		Account ac[] = new Account[sc.nextInt()];

		// account initialisation
		for (int i = 0; i < ac.length; i++) {
			ac[i] = accType();
			System.out.println();
		}
		while (true) {
			System.out.println("\n1. Search Account\n2. Exit");
			System.out.print("Enter choice: ");

			switch (sc.nextInt()) {
			default:
				System.out.println("Enter correctly!!!");
				break;
			case 1:
				System.out.print("Enter Account no.: ");
                    // using the search() method
				Account a = search(sc.next(), ac);
                // checking if the value of x is null
				if (a == null)
					System.out.println("Wrong Account No.");
				else
					menu(a);
				break;
			case 2:
				return;
			}
		}
	}
}